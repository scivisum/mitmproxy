=begin
#BrowserUp Proxy

#___ This is the REST API for controlling the BrowserUp Proxy.  The BrowserUp Proxy is a swiss army knife for automated testing. It allows traffic capture in HAR files and manipulation.  It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.0.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for BrowserupProxy::BlockList
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe BrowserupProxy::BlockList do
  let(:instance) { BrowserupProxy::BlockList.new }

  describe 'test an instance of BlockList' do
    it 'should create an instance of BlockList' do
      expect(instance).to be_instance_of(BrowserupProxy::BlockList)
    end
  end
  describe 'test attribute "status_code"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "url_pattern"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "http_method_pattern"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
