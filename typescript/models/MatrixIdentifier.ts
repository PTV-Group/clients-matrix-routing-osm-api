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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface MatrixIdentifier
 */
export interface MatrixIdentifier {
    /**
     * The ID of the matrix.
     * @type {string}
     * @memberof MatrixIdentifier
     */
    id: string;
}

/**
 * Check if a given object implements the MatrixIdentifier interface.
 */
export function instanceOfMatrixIdentifier(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "id" in value;

    return isInstance;
}

export function MatrixIdentifierFromJSON(json: any): MatrixIdentifier {
    return MatrixIdentifierFromJSONTyped(json, false);
}

export function MatrixIdentifierFromJSONTyped(json: any, ignoreDiscriminator: boolean): MatrixIdentifier {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function MatrixIdentifierToJSON(value?: MatrixIdentifier | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
    };
}

