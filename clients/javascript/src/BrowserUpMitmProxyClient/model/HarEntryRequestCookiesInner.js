/**
 * BrowserUp MitmProxy
 * ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The HarEntryRequestCookiesInner model module.
 * @module BrowserUpMitmProxyClient/model/HarEntryRequestCookiesInner
 * @version 1.0.0
 */
class HarEntryRequestCookiesInner {
    /**
     * Constructs a new <code>HarEntryRequestCookiesInner</code>.
     * @alias module:BrowserUpMitmProxyClient/model/HarEntryRequestCookiesInner
     * @param name {String} 
     * @param value {String} 
     */
    constructor(name, value) { 
        
        HarEntryRequestCookiesInner.initialize(this, name, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, value) { 
        obj['name'] = name;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>HarEntryRequestCookiesInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/HarEntryRequestCookiesInner} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/HarEntryRequestCookiesInner} The populated <code>HarEntryRequestCookiesInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HarEntryRequestCookiesInner();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('path')) {
                obj['path'] = ApiClient.convertToType(data['path'], 'String');
            }
            if (data.hasOwnProperty('domain')) {
                obj['domain'] = ApiClient.convertToType(data['domain'], 'String');
            }
            if (data.hasOwnProperty('expires')) {
                obj['expires'] = ApiClient.convertToType(data['expires'], 'String');
            }
            if (data.hasOwnProperty('httpOnly')) {
                obj['httpOnly'] = ApiClient.convertToType(data['httpOnly'], 'Boolean');
            }
            if (data.hasOwnProperty('secure')) {
                obj['secure'] = ApiClient.convertToType(data['secure'], 'Boolean');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HarEntryRequestCookiesInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HarEntryRequestCookiesInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of HarEntryRequestCookiesInner.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['value'] && !(typeof data['value'] === 'string' || data['value'] instanceof String)) {
            throw new Error("Expected the field `value` to be a primitive type in the JSON string but got " + data['value']);
        }
        // ensure the json data is a string
        if (data['path'] && !(typeof data['path'] === 'string' || data['path'] instanceof String)) {
            throw new Error("Expected the field `path` to be a primitive type in the JSON string but got " + data['path']);
        }
        // ensure the json data is a string
        if (data['domain'] && !(typeof data['domain'] === 'string' || data['domain'] instanceof String)) {
            throw new Error("Expected the field `domain` to be a primitive type in the JSON string but got " + data['domain']);
        }
        // ensure the json data is a string
        if (data['expires'] && !(typeof data['expires'] === 'string' || data['expires'] instanceof String)) {
            throw new Error("Expected the field `expires` to be a primitive type in the JSON string but got " + data['expires']);
        }
        // ensure the json data is a string
        if (data['comment'] && !(typeof data['comment'] === 'string' || data['comment'] instanceof String)) {
            throw new Error("Expected the field `comment` to be a primitive type in the JSON string but got " + data['comment']);
        }

        return true;
    }


}

HarEntryRequestCookiesInner.RequiredProperties = ["name", "value"];

/**
 * @member {String} name
 */
HarEntryRequestCookiesInner.prototype['name'] = undefined;

/**
 * @member {String} value
 */
HarEntryRequestCookiesInner.prototype['value'] = undefined;

/**
 * @member {String} path
 */
HarEntryRequestCookiesInner.prototype['path'] = undefined;

/**
 * @member {String} domain
 */
HarEntryRequestCookiesInner.prototype['domain'] = undefined;

/**
 * @member {String} expires
 */
HarEntryRequestCookiesInner.prototype['expires'] = undefined;

/**
 * @member {Boolean} httpOnly
 */
HarEntryRequestCookiesInner.prototype['httpOnly'] = undefined;

/**
 * @member {Boolean} secure
 */
HarEntryRequestCookiesInner.prototype['secure'] = undefined;

/**
 * @member {String} comment
 */
HarEntryRequestCookiesInner.prototype['comment'] = undefined;






export default HarEntryRequestCookiesInner;
