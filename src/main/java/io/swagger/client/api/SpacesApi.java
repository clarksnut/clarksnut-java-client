

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.GenericDataRepresentationListSpaceData;
import io.swagger.client.model.SpaceRepresentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpacesApi {
    private ApiClient apiClient;

    public SpacesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SpacesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createSpace
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createSpaceCall(SpaceRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/spaces";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createSpaceValidateBeforeCall(SpaceRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = createSpaceCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create new Space
     * 
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createSpace(SpaceRepresentation body) throws ApiException {
        createSpaceWithHttpInfo(body);
    }

    /**
     * Create new Space
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createSpaceWithHttpInfo(SpaceRepresentation body) throws ApiException {
        com.squareup.okhttp.Call call = createSpaceValidateBeforeCall(body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create new Space (asynchronously)
     * 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createSpaceAsync(SpaceRepresentation body, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createSpaceValidateBeforeCall(body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getSpace
     * @param spaceId Space Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSpaceCall(String spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/spaces/{spaceId}"
            .replaceAll("\\{" + "spaceId" + "\\}", apiClient.escapeString(spaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSpaceValidateBeforeCall(String spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getSpace(Async)");
        }
        

        com.squareup.okhttp.Call call = getSpaceCall(spaceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return one Space
     * 
     * @param spaceId Space Id (required)
     * @return SpaceRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SpaceRepresentation getSpace(String spaceId) throws ApiException {
        ApiResponse<SpaceRepresentation> resp = getSpaceWithHttpInfo(spaceId);
        return resp.getData();
    }

    /**
     * Return one Space
     * 
     * @param spaceId Space Id (required)
     * @return ApiResponse&lt;SpaceRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SpaceRepresentation> getSpaceWithHttpInfo(String spaceId) throws ApiException {
        com.squareup.okhttp.Call call = getSpaceValidateBeforeCall(spaceId, null, null);
        Type localVarReturnType = new TypeToken<SpaceRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return one Space (asynchronously)
     * 
     * @param spaceId Space Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSpaceAsync(String spaceId, final ApiCallback<SpaceRepresentation> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSpaceValidateBeforeCall(spaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SpaceRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSpaces
     * @param assignedId Space Assigned Id (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSpacesCall(String assignedId, String filterText, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/spaces";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (assignedId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("assignedId", assignedId));
        if (filterText != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterText", filterText));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSpacesValidateBeforeCall(String assignedId, String filterText, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSpacesCall(assignedId, filterText, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return list of Spaces
     * 
     * @param assignedId Space Assigned Id (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return GenericDataRepresentationListSpaceData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListSpaceData getSpaces(String assignedId, String filterText, Integer offset, Integer limit) throws ApiException {
        ApiResponse<GenericDataRepresentationListSpaceData> resp = getSpacesWithHttpInfo(assignedId, filterText, offset, limit);
        return resp.getData();
    }

    /**
     * Return list of Spaces
     * 
     * @param assignedId Space Assigned Id (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return ApiResponse&lt;GenericDataRepresentationListSpaceData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListSpaceData> getSpacesWithHttpInfo(String assignedId, String filterText, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getSpacesValidateBeforeCall(assignedId, filterText, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListSpaceData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return list of Spaces (asynchronously)
     * 
     * @param assignedId Space Assigned Id (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSpacesAsync(String assignedId, String filterText, Integer offset, Integer limit, final ApiCallback<GenericDataRepresentationListSpaceData> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSpacesValidateBeforeCall(assignedId, filterText, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListSpaceData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
