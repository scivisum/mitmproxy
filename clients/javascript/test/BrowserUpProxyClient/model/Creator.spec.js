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
    instance = new BrowserUpProxyClient.Creator();
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

  describe('Creator', function() {
    it('should create an instance of Creator', function() {
      // uncomment below and update the code to test Creator
      //var instane = new BrowserUpProxyClient.Creator();
      //expect(instance).to.be.a(BrowserUpProxyClient.Creator);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new BrowserUpProxyClient.Creator();
      //expect(instance).to.be();
    });

    it('should have the property version (base name: "version")', function() {
      // uncomment below and update the code to test the property version
      //var instance = new BrowserUpProxyClient.Creator();
      //expect(instance).to.be();
    });

    it('should have the property comment (base name: "comment")', function() {
      // uncomment below and update the code to test the property comment
      //var instance = new BrowserUpProxyClient.Creator();
      //expect(instance).to.be();
    });

  });

}));
