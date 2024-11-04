/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing OSM
 * With the Matrix Routing OSM service you can compute distances and travel times between a set of origins and destinations based on open street map data.
 *
 * The version of the OpenAPI document: 1.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface Warning
 */
export interface Warning {
    /**
     * A human readable message that describes the warning.
     * @type {string}
     * @memberof Warning
     */
    description: string;
    /**
     * A constant string that can be used to identify this warning class programmatically.
     * A warningCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified.
     * Note that additional warningCodes as well as the **details** of existing warningCodes may be added at any time. Furthermore, the **description** may change at any time.  
     * 
     * * `GENERAL_PARAMETER_IGNORED` - A parameter was ignored.
     *   * `parameter` - The ignored parameter.
     *   * `value` - The value of the ignored parameter.
     *   * `relatedParameter` - The parameter which caused the parameter in question to be ignored.
     *   * `relatedValue` - The value which caused the parameter in question to be ignored. Not present if the conflict is independent of the value.
     * 
     * @type {string}
     * @memberof Warning
     */
    warningCode: string;
    /**
     * Additional properties specific to this class of warnings.
     * @type {{ [key: string]: any; }}
     * @memberof Warning
     */
    details?: { [key: string]: any; };
}

/**
 * Check if a given object implements the Warning interface.
 */
export function instanceOfWarning(value: object): value is Warning {
    if (!('description' in value) || value['description'] === undefined) return false;
    if (!('warningCode' in value) || value['warningCode'] === undefined) return false;
    return true;
}

export function WarningFromJSON(json: any): Warning {
    return WarningFromJSONTyped(json, false);
}

export function WarningFromJSONTyped(json: any, ignoreDiscriminator: boolean): Warning {
    if (json == null) {
        return json;
    }
    return {
        
        'description': json['description'],
        'warningCode': json['warningCode'],
        'details': json['details'] == null ? undefined : json['details'],
    };
}

export function WarningToJSON(value?: Warning | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['description'],
        'warningCode': value['warningCode'],
        'details': value['details'],
    };
}

