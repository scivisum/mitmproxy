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

import ApiClient from '../ApiClient';
import Content from './Content';
import Cookie from './Cookie';
import Header from './Header';

/**
 * The Response model module.
 * @module BrowserUpProxyClient/model/Response
 * @version 1.0.0
 */
class Response {
    /**
     * Constructs a new <code>Response</code>.
     * @alias module:BrowserUpProxyClient/model/Response
     * @param status {Number} 
     * @param statusText {String} 
     * @param httpVersion {String} 
     * @param cookies {Array.<module:BrowserUpProxyClient/model/Cookie>} 
     * @param headers {Array.<module:BrowserUpProxyClient/model/Header>} 
     * @param content {module:BrowserUpProxyClient/model/Content} 
     * @param redirectURL {String} 
     * @param headersSize {Number} 
     * @param bodySize {Number} 
     */
    constructor(status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize) { 
        
        Response.initialize(this, status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize) { 
        obj['status'] = status;
        obj['statusText'] = statusText;
        obj['httpVersion'] = httpVersion;
        obj['cookies'] = cookies;
        obj['headers'] = headers;
        obj['content'] = content;
        obj['redirectURL'] = redirectURL;
        obj['headersSize'] = headersSize;
        obj['bodySize'] = bodySize;
    }

    /**
     * Constructs a <code>Response</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpProxyClient/model/Response} obj Optional instance to populate.
     * @return {module:BrowserUpProxyClient/model/Response} The populated <code>Response</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Response();

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'Number');
            }
            if (data.hasOwnProperty('statusText')) {
                obj['statusText'] = ApiClient.convertToType(data['statusText'], 'String');
            }
            if (data.hasOwnProperty('httpVersion')) {
                obj['httpVersion'] = ApiClient.convertToType(data['httpVersion'], 'String');
            }
            if (data.hasOwnProperty('cookies')) {
                obj['cookies'] = ApiClient.convertToType(data['cookies'], [Cookie]);
            }
            if (data.hasOwnProperty('headers')) {
                obj['headers'] = ApiClient.convertToType(data['headers'], [Header]);
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = Content.constructFromObject(data['content']);
            }
            if (data.hasOwnProperty('redirectURL')) {
                obj['redirectURL'] = ApiClient.convertToType(data['redirectURL'], 'String');
            }
            if (data.hasOwnProperty('headersSize')) {
                obj['headersSize'] = ApiClient.convertToType(data['headersSize'], 'Number');
            }
            if (data.hasOwnProperty('bodySize')) {
                obj['bodySize'] = ApiClient.convertToType(data['bodySize'], 'Number');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} status
 */
Response.prototype['status'] = undefined;

/**
 * @member {String} statusText
 */
Response.prototype['statusText'] = undefined;

/**
 * @member {String} httpVersion
 */
Response.prototype['httpVersion'] = undefined;

/**
 * @member {Array.<module:BrowserUpProxyClient/model/Cookie>} cookies
 */
Response.prototype['cookies'] = undefined;

/**
 * @member {Array.<module:BrowserUpProxyClient/model/Header>} headers
 */
Response.prototype['headers'] = undefined;

/**
 * @member {module:BrowserUpProxyClient/model/Content} content
 */
Response.prototype['content'] = undefined;

/**
 * @member {String} redirectURL
 */
Response.prototype['redirectURL'] = undefined;

/**
 * @member {Number} headersSize
 */
Response.prototype['headersSize'] = undefined;

/**
 * @member {Number} bodySize
 */
Response.prototype['bodySize'] = undefined;

/**
 * @member {String} comment
 */
Response.prototype['comment'] = undefined;






export default Response;

