# coding: utf-8

"""
    BrowserUp MitmProxy

    ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

    The version of the OpenAPI document: 1.0.0
    Contact: developers@browserup.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, Field, StrictBool, StrictStr
from BrowserUpMitmProxyClient.models.name_value_pair import NameValuePair

class MatchCriteria(BaseModel):
    """
    A set of criteria for filtering HTTP Requests and Responses.                          Criteria are AND based, and use python regular expressions for string comparison
    """
    url: Optional[StrictStr] = Field(None, description="Request URL regexp to match")
    page: Optional[StrictStr] = Field(None, description="current|all")
    status: Optional[StrictStr] = Field(None, description="HTTP Status code to match.")
    content: Optional[StrictStr] = Field(None, description="Body content regexp content to match")
    content_type: Optional[StrictStr] = Field(None, description="Content type")
    websocket_message: Optional[StrictStr] = Field(None, description="Websocket message text to match")
    request_header: Optional[NameValuePair] = None
    request_cookie: Optional[NameValuePair] = None
    response_header: Optional[NameValuePair] = None
    response_cookie: Optional[NameValuePair] = None
    json_valid: Optional[StrictBool] = Field(None, description="Is valid JSON")
    json_path: Optional[StrictStr] = Field(None, description="Has JSON path")
    json_schema: Optional[StrictStr] = Field(None, description="Validates against passed JSON schema")
    error_if_no_traffic: Optional[StrictBool] = Field(True, description="If the proxy has NO traffic at all, return error")
    __properties = ["url", "page", "status", "content", "content_type", "websocket_message", "request_header", "request_cookie", "response_header", "response_cookie", "json_valid", "json_path", "json_schema", "error_if_no_traffic"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> MatchCriteria:
        """Create an instance of MatchCriteria from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of request_header
        if self.request_header:
            _dict['request_header'] = self.request_header.to_dict()
        # override the default output from pydantic by calling `to_dict()` of request_cookie
        if self.request_cookie:
            _dict['request_cookie'] = self.request_cookie.to_dict()
        # override the default output from pydantic by calling `to_dict()` of response_header
        if self.response_header:
            _dict['response_header'] = self.response_header.to_dict()
        # override the default output from pydantic by calling `to_dict()` of response_cookie
        if self.response_cookie:
            _dict['response_cookie'] = self.response_cookie.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> MatchCriteria:
        """Create an instance of MatchCriteria from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return MatchCriteria.parse_obj(obj)

        _obj = MatchCriteria.parse_obj({
            "url": obj.get("url"),
            "page": obj.get("page"),
            "status": obj.get("status"),
            "content": obj.get("content"),
            "content_type": obj.get("content_type"),
            "websocket_message": obj.get("websocket_message"),
            "request_header": NameValuePair.from_dict(obj.get("request_header")) if obj.get("request_header") is not None else None,
            "request_cookie": NameValuePair.from_dict(obj.get("request_cookie")) if obj.get("request_cookie") is not None else None,
            "response_header": NameValuePair.from_dict(obj.get("response_header")) if obj.get("response_header") is not None else None,
            "response_cookie": NameValuePair.from_dict(obj.get("response_cookie")) if obj.get("response_cookie") is not None else None,
            "json_valid": obj.get("json_valid"),
            "json_path": obj.get("json_path"),
            "json_schema": obj.get("json_schema"),
            "error_if_no_traffic": obj.get("error_if_no_traffic") if obj.get("error_if_no_traffic") is not None else True
        })
        return _obj


