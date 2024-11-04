/*
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

package com.ptvgroup.developer.client.matrixrouting.osm.api;

import com.ptvgroup.developer.client.matrixrouting.osm.ApiClient;
import com.ptvgroup.developer.client.matrixrouting.osm.ApiException;
import com.ptvgroup.developer.client.matrixrouting.osm.ApiResponse;
import com.ptvgroup.developer.client.matrixrouting.osm.Pair;

import com.ptvgroup.developer.client.matrixrouting.osm.model.ErrorResponse;
import com.ptvgroup.developer.client.matrixrouting.osm.model.Locations;
import com.ptvgroup.developer.client.matrixrouting.osm.model.MatrixIdentifier;
import com.ptvgroup.developer.client.matrixrouting.osm.model.MatrixResponse;
import com.ptvgroup.developer.client.matrixrouting.osm.model.Options;
import com.ptvgroup.developer.client.matrixrouting.osm.model.Results;
import com.ptvgroup.developer.client.matrixrouting.osm.model.StatusResponse;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T13:14:13.711081255Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class MatricesApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public MatricesApi() {
    this(new ApiClient());
  }

  public MatricesApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Creates a matrix by calculating distances and travel times between given origins and destinations.
   * @param locations  (required)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/osm-profiles) such as _EUR_OSM_CAR_. (optional, default to EUR_OSM_CAR)
   * @param results Comma-separated list that defines which results will be returned.  * &#x60;DISTANCES&#x60;     Response includes information about the distances between start and destination locations.  * &#x60;TRAVEL_TIMES&#x60;     Response includes information about the travel times between start and destination locations.  * &#x60;DIRECT_DISTANCE_FLAGS&#x60;     Response includes flags describing if relations have been estimated by direct distance. (optional)
   * @param options Matrix Routing-relevant options like the average speed for direct distance calculations. Use array notation like &#x60;options[averageSpeed]&#x3D;60&#x60; to set options. (optional)
   * @return MatrixResponse
   * @throws ApiException if fails to make API call
   */
  public MatrixResponse calculateMatrix(Locations locations, String profile, List<Results> results, Options options) throws ApiException {
    ApiResponse<MatrixResponse> localVarResponse = calculateMatrixWithHttpInfo(locations, profile, results, options);
    return localVarResponse.getData();
  }

  /**
   * 
   * Creates a matrix by calculating distances and travel times between given origins and destinations.
   * @param locations  (required)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/osm-profiles) such as _EUR_OSM_CAR_. (optional, default to EUR_OSM_CAR)
   * @param results Comma-separated list that defines which results will be returned.  * &#x60;DISTANCES&#x60;     Response includes information about the distances between start and destination locations.  * &#x60;TRAVEL_TIMES&#x60;     Response includes information about the travel times between start and destination locations.  * &#x60;DIRECT_DISTANCE_FLAGS&#x60;     Response includes flags describing if relations have been estimated by direct distance. (optional)
   * @param options Matrix Routing-relevant options like the average speed for direct distance calculations. Use array notation like &#x60;options[averageSpeed]&#x3D;60&#x60; to set options. (optional)
   * @return ApiResponse&lt;MatrixResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MatrixResponse> calculateMatrixWithHttpInfo(Locations locations, String profile, List<Results> results, Options options) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = calculateMatrixRequestBuilder(locations, profile, results, options);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("calculateMatrix", localVarResponse);
        }
        return new ApiResponse<MatrixResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MatrixResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder calculateMatrixRequestBuilder(Locations locations, String profile, List<Results> results, Options options) throws ApiException {
    // verify the required parameter 'locations' is set
    if (locations == null) {
      throw new ApiException(400, "Missing the required parameter 'locations' when calling calculateMatrix");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/matrices";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "profile";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("profile", profile));
    localVarQueryParameterBaseName = "results";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "results", results));
    localVarQueryParameterBaseName = "options";
    if (options != null) {
      String queryString = options.toUrlQueryString("options");
      if (!queryString.isBlank()) {
        localVarQueryStringJoiner.add(queryString);
      }
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(locations);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Cancels a matrix calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
   * @param id The ID of a matrix calculation operation. (required)
   * @throws ApiException if fails to make API call
   */
  public void cancelMatrixCalculation(UUID id) throws ApiException {
    cancelMatrixCalculationWithHttpInfo(id);
  }

  /**
   * 
   * Cancels a matrix calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.
   * @param id The ID of a matrix calculation operation. (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> cancelMatrixCalculationWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = cancelMatrixCalculationRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("cancelMatrixCalculation", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder cancelMatrixCalculationRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling cancelMatrixCalculation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/matrices/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Requests the results of a matrix calculation operation.
   * @param id The ID of a matrix calculation operation. (required)
   * @return MatrixResponse
   * @throws ApiException if fails to make API call
   */
  public MatrixResponse getMatrix(UUID id) throws ApiException {
    ApiResponse<MatrixResponse> localVarResponse = getMatrixWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * 
   * Requests the results of a matrix calculation operation.
   * @param id The ID of a matrix calculation operation. (required)
   * @return ApiResponse&lt;MatrixResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MatrixResponse> getMatrixWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getMatrixRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getMatrix", localVarResponse);
        }
        return new ApiResponse<MatrixResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MatrixResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getMatrixRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMatrix");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/matrices/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Requests the status of a matrix calculation.
   * @param id The ID of a matrix calculation operation. (required)
   * @return StatusResponse
   * @throws ApiException if fails to make API call
   */
  public StatusResponse getStatus(UUID id) throws ApiException {
    ApiResponse<StatusResponse> localVarResponse = getStatusWithHttpInfo(id);
    return localVarResponse.getData();
  }

  /**
   * 
   * Requests the status of a matrix calculation.
   * @param id The ID of a matrix calculation operation. (required)
   * @return ApiResponse&lt;StatusResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StatusResponse> getStatusWithHttpInfo(UUID id) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getStatusRequestBuilder(id);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getStatus", localVarResponse);
        }
        return new ApiResponse<StatusResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<StatusResponse>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getStatusRequestBuilder(UUID id) throws ApiException {
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getStatus");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/matrices/status/{id}"
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * 
   * Creates a matrix asynchronously by calculating distances and travel times between given origins and destinations.
   * @param locations  (required)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/osm-profiles) such as _EUR_OSM_CAR_. (optional, default to EUR_OSM_CAR)
   * @param results Comma-separated list that defines which results will be returned.  * &#x60;DISTANCES&#x60;     Response includes information about the distances between start and destination locations.  * &#x60;TRAVEL_TIMES&#x60;     Response includes information about the travel times between start and destination locations.  * &#x60;DIRECT_DISTANCE_FLAGS&#x60;     Response includes flags describing if relations have been estimated by direct distance. (optional)
   * @param options Matrix Routing-relevant options like the average speed for direct distance calculations. Use array notation like &#x60;options[averageSpeed]&#x3D;60&#x60; to set options. (optional)
   * @return MatrixIdentifier
   * @throws ApiException if fails to make API call
   */
  public MatrixIdentifier startMatrixCalculation(Locations locations, String profile, List<Results> results, Options options) throws ApiException {
    ApiResponse<MatrixIdentifier> localVarResponse = startMatrixCalculationWithHttpInfo(locations, profile, results, options);
    return localVarResponse.getData();
  }

  /**
   * 
   * Creates a matrix asynchronously by calculating distances and travel times between given origins and destinations.
   * @param locations  (required)
   * @param profile A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/osm-profiles) such as _EUR_OSM_CAR_. (optional, default to EUR_OSM_CAR)
   * @param results Comma-separated list that defines which results will be returned.  * &#x60;DISTANCES&#x60;     Response includes information about the distances between start and destination locations.  * &#x60;TRAVEL_TIMES&#x60;     Response includes information about the travel times between start and destination locations.  * &#x60;DIRECT_DISTANCE_FLAGS&#x60;     Response includes flags describing if relations have been estimated by direct distance. (optional)
   * @param options Matrix Routing-relevant options like the average speed for direct distance calculations. Use array notation like &#x60;options[averageSpeed]&#x3D;60&#x60; to set options. (optional)
   * @return ApiResponse&lt;MatrixIdentifier&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<MatrixIdentifier> startMatrixCalculationWithHttpInfo(Locations locations, String profile, List<Results> results, Options options) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = startMatrixCalculationRequestBuilder(locations, profile, results, options);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("startMatrixCalculation", localVarResponse);
        }
        return new ApiResponse<MatrixIdentifier>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MatrixIdentifier>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder startMatrixCalculationRequestBuilder(Locations locations, String profile, List<Results> results, Options options) throws ApiException {
    // verify the required parameter 'locations' is set
    if (locations == null) {
      throw new ApiException(400, "Missing the required parameter 'locations' when calling startMatrixCalculation");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();
		localVarRequestBuilder.header("User-Agent","ptv-generated java client");

    String localVarPath = "/matrices/async";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "profile";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("profile", profile));
    localVarQueryParameterBaseName = "results";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "results", results));
    localVarQueryParameterBaseName = "options";
    if (options != null) {
      String queryString = options.toUrlQueryString("options");
      if (!queryString.isBlank()) {
        localVarQueryStringJoiner.add(queryString);
      }
    }

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(locations);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}