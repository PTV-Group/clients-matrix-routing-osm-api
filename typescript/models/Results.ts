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


/**
 * 
 * @export
 */
export const Results = {
    DISTANCES: 'DISTANCES',
    TRAVEL_TIMES: 'TRAVEL_TIMES'
} as const;
export type Results = typeof Results[keyof typeof Results];


export function ResultsFromJSON(json: any): Results {
    return ResultsFromJSONTyped(json, false);
}

export function ResultsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Results {
    return json as Results;
}

export function ResultsToJSON(value?: Results | null): any {
    return value as any;
}

