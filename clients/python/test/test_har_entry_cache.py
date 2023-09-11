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
from BrowserUpMitmProxyClient.models.har_entry_cache import HarEntryCache  # noqa: E501
from BrowserUpMitmProxyClient.rest import ApiException

class TestHarEntryCache(unittest.TestCase):
    """HarEntryCache unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test HarEntryCache
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `HarEntryCache`
        """
        model = BrowserUpMitmProxyClient.models.har_entry_cache.HarEntryCache()  # noqa: E501
        if include_optional :
            return HarEntryCache(
                before_request = BrowserUpMitmProxyClient.models.har_entry_cache_before_request.HarEntry_cache_beforeRequest(
                    expires = '', 
                    last_access = '', 
                    e_tag = '', 
                    hit_count = 56, 
                    comment = '', ), 
                after_request = BrowserUpMitmProxyClient.models.har_entry_cache_before_request.HarEntry_cache_beforeRequest(
                    expires = '', 
                    last_access = '', 
                    e_tag = '', 
                    hit_count = 56, 
                    comment = '', ), 
                comment = ''
            )
        else :
            return HarEntryCache(
        )
        """

    def testHarEntryCache(self):
        """Test HarEntryCache"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
