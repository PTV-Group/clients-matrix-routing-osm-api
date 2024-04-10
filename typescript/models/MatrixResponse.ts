/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing OSM
 * With the Matrix Routing OSM service you can compute distances and travel times between a set of origins and destinations based on open street map data.
 *
 * The version of the OpenAPI document: 1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { Warning } from './Warning';
import {
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';

/**
 * 
 * @export
 * @interface MatrixResponse
 */
export interface MatrixResponse {
    /**
     * Percentage of relations in the distance matrix which has not been calculated successfully. 
     * Zero distances corresponding to A-A relations are not included in this calculation.
     * @type {number}
     * @memberof MatrixResponse
     */
    percentageOfDirectDistanceRelations?: number;
    /**
     * The distances of the requested matrix elements [m]. To access to the distance of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the distance for an A-A relation is always set to zero.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    distances?: Array<number>;
    /**
     * The travel times of the requested matrix elements [s]. To access to the travel time of the relation between the origin i and the destination j, read the k-th element defined by `k = i * N + j`, with N being the number of destinations.
     * Please note that the travel time for an A-A relation is always set to zero.
     * @type {Array<number>}
     * @memberof MatrixResponse
     */
    travelTimes?: Array<number>;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof MatrixResponse
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the MatrixResponse interface.
 */
export function instanceOfMatrixResponse(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function MatrixResponseFromJSON(json: any): MatrixResponse {
    return MatrixResponseFromJSONTyped(json, false);
}

export function MatrixResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatrixResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'percentageOfDirectDistanceRelations': !exists(json, 'percentageOfDirectDistanceRelations') ? undefined : json['percentageOfDirectDistanceRelations'],
        'distances': !exists(json, 'distances') ? undefined : json['distances'],
        'travelTimes': !exists(json, 'travelTimes') ? undefined : json['travelTimes'],
        'warnings': !exists(json, 'warnings') ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function MatrixResponseToJSON(value?: MatrixResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'percentageOfDirectDistanceRelations': value.percentageOfDirectDistanceRelations,
        'distances': value.distances,
        'travelTimes': value.travelTimes,
        'warnings': value.warnings === undefined ? undefined : ((value.warnings as Array<any>).map(WarningToJSON)),
    };
}

