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
 * The PageTimings model module.
 * @module BrowserUpMitmProxyClient/model/PageTimings
 * @version 1.0.0
 */
class PageTimings {
    /**
     * Constructs a new <code>PageTimings</code>.
     * @alias module:BrowserUpMitmProxyClient/model/PageTimings
     * @extends Object
     * @param onContentLoad {Number} 
     * @param onLoad {Number} 
     */
    constructor(onContentLoad, onLoad) { 
        
        PageTimings.initialize(this, onContentLoad, onLoad);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, onContentLoad, onLoad) { 
        obj['onContentLoad'] = onContentLoad || -1;
        obj['onLoad'] = onLoad || -1;
    }

    /**
     * Constructs a <code>PageTimings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/PageTimings} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/PageTimings} The populated <code>PageTimings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PageTimings();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('onContentLoad')) {
                obj['onContentLoad'] = ApiClient.convertToType(data['onContentLoad'], 'Number');
            }
            if (data.hasOwnProperty('onLoad')) {
                obj['onLoad'] = ApiClient.convertToType(data['onLoad'], 'Number');
            }
            if (data.hasOwnProperty('_href')) {
                obj['_href'] = ApiClient.convertToType(data['_href'], 'String');
            }
            if (data.hasOwnProperty('_dns')) {
                obj['_dns'] = ApiClient.convertToType(data['_dns'], 'Number');
            }
            if (data.hasOwnProperty('_ssl')) {
                obj['_ssl'] = ApiClient.convertToType(data['_ssl'], 'Number');
            }
            if (data.hasOwnProperty('_ttfb')) {
                obj['_ttfb'] = ApiClient.convertToType(data['_ttfb'], 'Number');
            }
            if (data.hasOwnProperty('_cumulativeLayoutShift')) {
                obj['_cumulativeLayoutShift'] = ApiClient.convertToType(data['_cumulativeLayoutShift'], 'Number');
            }
            if (data.hasOwnProperty('_largestContentfulPaint')) {
                obj['_largestContentfulPaint'] = ApiClient.convertToType(data['_largestContentfulPaint'], 'Number');
            }
            if (data.hasOwnProperty('_firstPaint')) {
                obj['_firstPaint'] = ApiClient.convertToType(data['_firstPaint'], 'Number');
            }
            if (data.hasOwnProperty('_firstInputDelay')) {
                obj['_firstInputDelay'] = ApiClient.convertToType(data['_firstInputDelay'], 'Number');
            }
            if (data.hasOwnProperty('_domInteractive')) {
                obj['_domInteractive'] = ApiClient.convertToType(data['_domInteractive'], 'Number');
            }
            if (data.hasOwnProperty('_firstContentfulPaint')) {
                obj['_firstContentfulPaint'] = ApiClient.convertToType(data['_firstContentfulPaint'], 'Number');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PageTimings</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PageTimings</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of PageTimings.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['_href'] && !(typeof data['_href'] === 'string' || data['_href'] instanceof String)) {
            throw new Error("Expected the field `_href` to be a primitive type in the JSON string but got " + data['_href']);
        }
        // ensure the json data is a string
        if (data['comment'] && !(typeof data['comment'] === 'string' || data['comment'] instanceof String)) {
            throw new Error("Expected the field `comment` to be a primitive type in the JSON string but got " + data['comment']);
        }

        return true;
    }


}

PageTimings.RequiredProperties = ["onContentLoad", "onLoad"];

/**
 * @member {Number} onContentLoad
 * @default -1
 */
PageTimings.prototype['onContentLoad'] = -1;

/**
 * @member {Number} onLoad
 * @default -1
 */
PageTimings.prototype['onLoad'] = -1;

/**
 * @member {String} _href
 * @default ''
 */
PageTimings.prototype['_href'] = '';

/**
 * @member {Number} _dns
 * @default -1
 */
PageTimings.prototype['_dns'] = -1;

/**
 * @member {Number} _ssl
 * @default -1
 */
PageTimings.prototype['_ssl'] = -1;

/**
 * @member {Number} _ttfb
 * @default -1
 */
PageTimings.prototype['_ttfb'] = -1;

/**
 * @member {Number} _cumulativeLayoutShift
 * @default -1
 */
PageTimings.prototype['_cumulativeLayoutShift'] = -1;

/**
 * @member {Number} _largestContentfulPaint
 * @default -1
 */
PageTimings.prototype['_largestContentfulPaint'] = -1;

/**
 * @member {Number} _firstPaint
 * @default -1
 */
PageTimings.prototype['_firstPaint'] = -1;

/**
 * @member {Number} _firstInputDelay
 * @default -1
 */
PageTimings.prototype['_firstInputDelay'] = -1;

/**
 * @member {Number} _domInteractive
 * @default -1
 */
PageTimings.prototype['_domInteractive'] = -1;

/**
 * @member {Number} _firstContentfulPaint
 * @default -1
 */
PageTimings.prototype['_firstContentfulPaint'] = -1;

/**
 * @member {String} comment
 */
PageTimings.prototype['comment'] = undefined;






export default PageTimings;

