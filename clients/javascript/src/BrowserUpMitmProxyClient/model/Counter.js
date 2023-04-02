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
 * The Counter model module.
 * @module BrowserUpMitmProxyClient/model/Counter
 * @version 1.0.0
 */
class Counter {
    /**
     * Constructs a new <code>Counter</code>.
     * @alias module:BrowserUpMitmProxyClient/model/Counter
     */
    constructor() { 
        
        Counter.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Counter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/Counter} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/Counter} The populated <code>Counter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Counter();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Counter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Counter</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}



/**
 * Value for the counter
 * @member {Number} value
 */
Counter.prototype['value'] = undefined;

/**
 * Name of Custom Counter to add to the page under _counters
 * @member {String} name
 */
Counter.prototype['name'] = undefined;






export default Counter;
