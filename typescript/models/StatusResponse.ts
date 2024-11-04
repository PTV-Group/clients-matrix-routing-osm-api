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
import type { CalculationStatus } from './CalculationStatus';
import {
    CalculationStatusFromJSON,
    CalculationStatusFromJSONTyped,
    CalculationStatusToJSON,
} from './CalculationStatus';

/**
 * Describes the status of a matrix calculation operation.
 * @export
 * @interface StatusResponse
 */
export interface StatusResponse {
    /**
     * 
     * @type {CalculationStatus}
     * @memberof StatusResponse
     */
    status?: CalculationStatus;
}



/**
 * Check if a given object implements the StatusResponse interface.
 */
export function instanceOfStatusResponse(value: object): value is StatusResponse {
    return true;
}

export function StatusResponseFromJSON(json: any): StatusResponse {
    return StatusResponseFromJSONTyped(json, false);
}

export function StatusResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): StatusResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'status': json['status'] == null ? undefined : CalculationStatusFromJSON(json['status']),
    };
}

export function StatusResponseToJSON(value?: StatusResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'status': CalculationStatusToJSON(value['status']),
    };
}

