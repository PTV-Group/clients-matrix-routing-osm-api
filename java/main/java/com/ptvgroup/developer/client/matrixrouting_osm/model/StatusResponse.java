/*
 * Matrix Routing OSM
 * With the Matrix Routing OSM service you can compute distances and travel times between a set of origins and destinations for bicycles based on open street map data.
 *
 * The version of the OpenAPI document: 1.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.matrixrouting_osm.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.matrixrouting_osm.model.CalculationStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.matrixrouting_osm.JSON;


/**
 * Describes the status of a matrix calculation operation.
 */
@ApiModel(description = "Describes the status of a matrix calculation operation.")
@JsonPropertyOrder({
  StatusResponse.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-18T09:45:27.765912Z[Etc/UTC]")
public class StatusResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  private CalculationStatus status;


  public StatusResponse status(CalculationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CalculationStatus getStatus() {
    return status;
  }


  public void setStatus(CalculationStatus status) {
    this.status = status;
  }


  /**
   * Return true if this StatusResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponse statusResponse = (StatusResponse) o;
    return Objects.equals(this.status, statusResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

