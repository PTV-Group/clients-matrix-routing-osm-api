/* tslint:disable */
/* eslint-disable */
/**
 * Matrix Routing OSM
 * With the Matrix Routing OSM service you can compute distances and travel times between a set of origins and destinations based on open street map data.
 *
 * The version of the OpenAPI document: 1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * The current status of the calculation.
 *  * `RUNNING` - The calculation is still running.
 *  * `SUCCEEDED` - The calculation has completed successfully.
 *  * `FAILED` - The calculation has completed with a failure.
 * @export
 */
export const CalculationStatus = {
    RUNNING: 'RUNNING',
    SUCCEEDED: 'SUCCEEDED',
    FAILED: 'FAILED'
} as const;
export type CalculationStatus = typeof CalculationStatus[keyof typeof CalculationStatus];


export function CalculationStatusFromJSON(json: any): CalculationStatus {
    return CalculationStatusFromJSONTyped(json, false);
}

export function CalculationStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): CalculationStatus {
    return json as CalculationStatus;
}

export function CalculationStatusToJSON(value?: CalculationStatus | null): any {
    return value as any;
}

