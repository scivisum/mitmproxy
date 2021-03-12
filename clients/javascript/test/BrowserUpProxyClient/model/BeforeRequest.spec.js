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
    instance = new BrowserUpProxyClient.BeforeRequest();
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

  describe('BeforeRequest', function() {
    it('should create an instance of BeforeRequest', function() {
      // uncomment below and update the code to test BeforeRequest
      //var instane = new BrowserUpProxyClient.BeforeRequest();
      //expect(instance).to.be.a(BrowserUpProxyClient.BeforeRequest);
    });

    it('should have the property expires (base name: "expires")', function() {
      // uncomment below and update the code to test the property expires
      //var instance = new BrowserUpProxyClient.BeforeRequest();
      //expect(instance).to.be();
    });

    it('should have the property lastAccess (base name: "lastAccess")', function() {
      // uncomment below and update the code to test the property lastAccess
      //var instance = new BrowserUpProxyClient.BeforeRequest();
      //expect(instance).to.be();
    });

    it('should have the property eTag (base name: "eTag")', function() {
      // uncomment below and update the code to test the property eTag
      //var instance = new BrowserUpProxyClient.BeforeRequest();
      //expect(instance).to.be();
    });

    it('should have the property hitCount (base name: "hitCount")', function() {
      // uncomment below and update the code to test the property hitCount
      //var instance = new BrowserUpProxyClient.BeforeRequest();
      //expect(instance).to.be();
    });

    it('should have the property comment (base name: "comment")', function() {
      // uncomment below and update the code to test the property comment
      //var instance = new BrowserUpProxyClient.BeforeRequest();
      //expect(instance).to.be();
    });

  });

}));
