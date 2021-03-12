/**
 * BrowserUp Proxy
 * BrowserUp Proxy Control API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/BrowserUpProxyClient/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/BrowserUpProxyClient/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BrowserUpProxyClient);
  }
}(this, function(expect, BrowserUpProxyClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BrowserUpProxyClient.BlockList();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('BlockList', function() {
    it('should create an instance of BlockList', function() {
      // uncomment below and update the code to test BlockList
      //var instane = new BrowserUpProxyClient.BlockList();
      //expect(instance).to.be.a(BrowserUpProxyClient.BlockList);
    });

    it('should have the property urlPattern (base name: "urlPattern")', function() {
      // uncomment below and update the code to test the property urlPattern
      //var instance = new BrowserUpProxyClient.BlockList();
      //expect(instance).to.be();
    });

    it('should have the property statusCode (base name: "statusCode")', function() {
      // uncomment below and update the code to test the property statusCode
      //var instance = new BrowserUpProxyClient.BlockList();
      //expect(instance).to.be();
    });

    it('should have the property httpMethodPattern (base name: "httpMethodPattern")', function() {
      // uncomment below and update the code to test the property httpMethodPattern
      //var instance = new BrowserUpProxyClient.BlockList();
      //expect(instance).to.be();
    });

  });

}));
