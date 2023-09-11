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
from BrowserUpMitmProxyClient.models.match_criteria import MatchCriteria  # noqa: E501
from BrowserUpMitmProxyClient.rest import ApiException

class TestMatchCriteria(unittest.TestCase):
    """MatchCriteria unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test MatchCriteria
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MatchCriteria`
        """
        model = BrowserUpMitmProxyClient.models.match_criteria.MatchCriteria()  # noqa: E501
        if include_optional :
            return MatchCriteria(
                url = '', 
                page = '', 
                status = '', 
                content = '', 
                content_type = '', 
                websocket_message = '', 
                request_header = BrowserUpMitmProxyClient.models.name_value_pair.NameValuePair(
                    name = '', 
                    value = '', ), 
                request_cookie = BrowserUpMitmProxyClient.models.name_value_pair.NameValuePair(
                    name = '', 
                    value = '', ), 
                response_header = BrowserUpMitmProxyClient.models.name_value_pair.NameValuePair(
                    name = '', 
                    value = '', ), 
                response_cookie = BrowserUpMitmProxyClient.models.name_value_pair.NameValuePair(
                    name = '', 
                    value = '', ), 
                json_valid = True, 
                json_path = '', 
                json_schema = '', 
                error_if_no_traffic = True
            )
        else :
            return MatchCriteria(
        )
        """

    def testMatchCriteria(self):
        """Test MatchCriteria"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
