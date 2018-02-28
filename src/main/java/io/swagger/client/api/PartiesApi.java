

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


import io.swagger.client.model.GenericDataRepresentationListPartyData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartiesApi {
    private ApiClient apiClient;

    public PartiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getParties
     * @param q Search text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Spaces Id where to search parties (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPartiesCall(String q, Integer offset, Integer limit, List<String> space, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/parties";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (space != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "space", space));

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
    private com.squareup.okhttp.Call getPartiesValidateBeforeCall(String q, Integer offset, Integer limit, List<String> space, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getPartiesCall(q, offset, limit, space, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get parties
     * This will search parties on allowed spaces and current user
     * @param q Search text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Spaces Id where to search parties (optional)
     * @return GenericDataRepresentationListPartyData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListPartyData getParties(String q, Integer offset, Integer limit, List<String> space) throws ApiException {
        ApiResponse<GenericDataRepresentationListPartyData> resp = getPartiesWithHttpInfo(q, offset, limit, space);
        return resp.getData();
    }

    /**
     * Get parties
     * This will search parties on allowed spaces and current user
     * @param q Search text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Spaces Id where to search parties (optional)
     * @return ApiResponse&lt;GenericDataRepresentationListPartyData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListPartyData> getPartiesWithHttpInfo(String q, Integer offset, Integer limit, List<String> space) throws ApiException {
        com.squareup.okhttp.Call call = getPartiesValidateBeforeCall(q, offset, limit, space, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListPartyData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get parties (asynchronously)
     * This will search parties on allowed spaces and current user
     * @param q Search text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Spaces Id where to search parties (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPartiesAsync(String q, Integer offset, Integer limit, List<String> space, final ApiCallback<GenericDataRepresentationListPartyData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPartiesValidateBeforeCall(q, offset, limit, space, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListPartyData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
