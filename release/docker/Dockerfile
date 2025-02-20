FROM python:3.13-bookworm AS wheelbuilder

COPY mitmproxy-*-py3-none-any.whl /wheels/
RUN pip install wheel && pip wheel --wheel-dir /wheels /wheels/*.whl

FROM python:3.13-slim-bookworm

RUN useradd -mU mitmproxy
RUN apt-get update \
    && apt-get install -y --no-install-recommends gosu nano \
    && rm -rf /var/lib/apt/lists/*

# install git, browserup installs falcon-apispec directly from github
RUN apt-get update \
    && apt-get install -y --no-install-recommends git \
    && rm -rf /var/lib/apt/lists/*

RUN mkdir /home/mitmproxy/.mitmproxy \
    && chown mitmproxy:mitmproxy /home/mitmproxy/.mitmproxy

COPY --from=wheelbuilder /wheels /wheels
# to build falcon-apispec we need to install setuptools
RUN pip download setuptools>=40.8.0 -d /wheels
RUN pip install --no-index --find-links=/wheels mitmproxy
RUN rm -rf /wheels

VOLUME /home/mitmproxy/.mitmproxy

COPY docker-entrypoint.sh /usr/local/bin/
ENTRYPOINT ["docker-entrypoint.sh"]

EXPOSE 8080 8081

CMD ["mitmproxy"]
