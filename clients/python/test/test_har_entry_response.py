# coding: utf-8

"""
    BrowserUp MitmProxy

    ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

    The version of the OpenAPI document: 1.0.0
    Contact: developers@browserup.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

import BrowserUpMitmProxyClient
from BrowserUpMitmProxyClient.models.har_entry_response import HarEntryResponse  # noqa: E501
from BrowserUpMitmProxyClient.rest import ApiException

class TestHarEntryResponse(unittest.TestCase):
    """HarEntryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test HarEntryResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HarEntryResponse`
        """
        model = BrowserUpMitmProxyClient.models.har_entry_response.HarEntryResponse()  # noqa: E501
        if include_optional :
            return HarEntryResponse(
                status = 56, 
                status_text = '', 
                http_version = '', 
                cookies = [
                    BrowserUpMitmProxyClient.models.har_entry_request_cookies_inner.HarEntry_request_cookies_inner(
                        name = '', 
                        value = '', 
                        path = '', 
                        domain = '', 
                        expires = '', 
                        http_only = True, 
                        secure = True, 
                        comment = '', )
                    ], 
                headers = [
                    BrowserUpMitmProxyClient.models.header.Header(
                        name = '', 
                        value = '', 
                        comment = '', )
                    ], 
                content = BrowserUpMitmProxyClient.models.har_entry_response_content.HarEntry_response_content(
                    size = 56, 
                    compression = 56, 
                    mime_type = '', 
                    text = '', 
                    encoding = '', 
                    comment = '', ), 
                redirect_url = '', 
                headers_size = 56, 
                body_size = 56, 
                video_buffered_percent = -1, 
                video_stall_count = -1, 
                video_decoded_byte_count = -1, 
                video_waiting_count = -1, 
                video_error_count = -1, 
                video_dropped_frames = -1, 
                video_total_frames = -1, 
                video_audio_bytes_decoded = -1, 
                comment = ''
            )
        else :
            return HarEntryResponse(
                status = 56,
                status_text = '',
                http_version = '',
                cookies = [
                    BrowserUpMitmProxyClient.models.har_entry_request_cookies_inner.HarEntry_request_cookies_inner(
                        name = '', 
                        value = '', 
                        path = '', 
                        domain = '', 
                        expires = '', 
                        http_only = True, 
                        secure = True, 
                        comment = '', )
                    ],
                headers = [
                    BrowserUpMitmProxyClient.models.header.Header(
                        name = '', 
                        value = '', 
                        comment = '', )
                    ],
                content = BrowserUpMitmProxyClient.models.har_entry_response_content.HarEntry_response_content(
                    size = 56, 
                    compression = 56, 
                    mime_type = '', 
                    text = '', 
                    encoding = '', 
                    comment = '', ),
                redirect_url = '',
                headers_size = 56,
                body_size = 56,
        )
        """

    def testHarEntryResponse(self):
        """Test HarEntryResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
