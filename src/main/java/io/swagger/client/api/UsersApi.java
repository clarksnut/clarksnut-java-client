

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


import io.swagger.client.model.DocumentQueryRepresentation;
import io.swagger.client.model.DocumentRepresentation;
import io.swagger.client.model.GenericDataRepresentationListDocumentData;
import io.swagger.client.model.GenericDataRepresentationListPartyData;
import io.swagger.client.model.GenericDataRepresentationListRequestData;
import io.swagger.client.model.GenericDataRepresentationListSpaceData;
import io.swagger.client.model.GenericDataRepresentationListUserData;
import io.swagger.client.model.NotificationsRepresentation;
import io.swagger.client.model.SpaceRepresentation;
import io.swagger.client.model.TypedGenericDataRepresentationListUserData;
import io.swagger.client.model.UserRepresentation;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addSpaceCollaborators
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addSpaceCollaboratorsCall(String userId, String spaceId, TypedGenericDataRepresentationListUserData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}/collaborators"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addSpaceCollaboratorsValidateBeforeCall(String userId, String spaceId, TypedGenericDataRepresentationListUserData body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling addSpaceCollaborators(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling addSpaceCollaborators(Async)");
        }
        

        com.squareup.okhttp.Call call = addSpaceCollaboratorsCall(userId, spaceId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add new Collaborator
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addSpaceCollaborators(String userId, String spaceId, TypedGenericDataRepresentationListUserData body) throws ApiException {
        addSpaceCollaboratorsWithHttpInfo(userId, spaceId, body);
    }

    /**
     * Add new Collaborator
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addSpaceCollaboratorsWithHttpInfo(String userId, String spaceId, TypedGenericDataRepresentationListUserData body) throws ApiException {
        com.squareup.okhttp.Call call = addSpaceCollaboratorsValidateBeforeCall(userId, spaceId, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add new Collaborator (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addSpaceCollaboratorsAsync(String userId, String spaceId, TypedGenericDataRepresentationListUserData body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addSpaceCollaboratorsValidateBeforeCall(userId, spaceId, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteUserSpace
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUserSpaceCall(String userId, String spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUserSpaceValidateBeforeCall(String userId, String spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteUserSpace(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling deleteUserSpace(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteUserSpaceCall(userId, spaceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete space
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteUserSpace(String userId, String spaceId) throws ApiException {
        deleteUserSpaceWithHttpInfo(userId, spaceId);
    }

    /**
     * Delete space
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteUserSpaceWithHttpInfo(String userId, String spaceId) throws ApiException {
        com.squareup.okhttp.Call call = deleteUserSpaceValidateBeforeCall(userId, spaceId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete space (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUserSpaceAsync(String userId, String spaceId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteUserSpaceValidateBeforeCall(userId, spaceId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for downloadPdf
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param theme Theme (optional)
     * @param format format (optional, default to pdf)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadPdfCall(String userId, String documentId, String theme, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/documents/{documentId}/print"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (theme != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("theme", theme));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call downloadPdfValidateBeforeCall(String userId, String documentId, String theme, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling downloadPdf(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling downloadPdf(Async)");
        }
        

        com.squareup.okhttp.Call call = downloadPdfCall(userId, documentId, theme, format, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Print Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param theme Theme (optional)
     * @param format format (optional, default to pdf)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void downloadPdf(String userId, String documentId, String theme, String format) throws ApiException {
        downloadPdfWithHttpInfo(userId, documentId, theme, format);
    }

    /**
     * Print Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param theme Theme (optional)
     * @param format format (optional, default to pdf)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> downloadPdfWithHttpInfo(String userId, String documentId, String theme, String format) throws ApiException {
        com.squareup.okhttp.Call call = downloadPdfValidateBeforeCall(userId, documentId, theme, format, null, null);
        return apiClient.execute(call);
    }

    /**
     * Print Document (asynchronously)
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param theme Theme (optional)
     * @param format format (optional, default to pdf)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadPdfAsync(String userId, String documentId, String theme, String format, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadPdfValidateBeforeCall(userId, documentId, theme, format, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for downloadUserDocumentXml
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadUserDocumentXmlCall(String userId, String documentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/documents/{documentId}/download"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml"
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
    private com.squareup.okhttp.Call downloadUserDocumentXmlValidateBeforeCall(String userId, String documentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling downloadUserDocumentXml(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling downloadUserDocumentXml(Async)");
        }
        

        com.squareup.okhttp.Call call = downloadUserDocumentXmlCall(userId, documentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Download Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void downloadUserDocumentXml(String userId, String documentId) throws ApiException {
        downloadUserDocumentXmlWithHttpInfo(userId, documentId);
    }

    /**
     * Download Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> downloadUserDocumentXmlWithHttpInfo(String userId, String documentId) throws ApiException {
        com.squareup.okhttp.Call call = downloadUserDocumentXmlValidateBeforeCall(userId, documentId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Download Document (asynchronously)
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadUserDocumentXmlAsync(String userId, String documentId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadUserDocumentXmlValidateBeforeCall(userId, documentId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getNotifications
     * @param userId User Id (required)
     * @param space Space Ids (optional)
     * @param status Status (optional, default to pending)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotificationsCall(String userId, List<String> space, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/notifications"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (space != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "space", space));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));

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
    private com.squareup.okhttp.Call getNotificationsValidateBeforeCall(String userId, List<String> space, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getNotifications(Async)");
        }
        

        com.squareup.okhttp.Call call = getNotificationsCall(userId, space, status, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Notifications
     * 
     * @param userId User Id (required)
     * @param space Space Ids (optional)
     * @param status Status (optional, default to pending)
     * @return NotificationsRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotificationsRepresentation getNotifications(String userId, List<String> space, String status) throws ApiException {
        ApiResponse<NotificationsRepresentation> resp = getNotificationsWithHttpInfo(userId, space, status);
        return resp.getData();
    }

    /**
     * Get Notifications
     * 
     * @param userId User Id (required)
     * @param space Space Ids (optional)
     * @param status Status (optional, default to pending)
     * @return ApiResponse&lt;NotificationsRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotificationsRepresentation> getNotificationsWithHttpInfo(String userId, List<String> space, String status) throws ApiException {
        com.squareup.okhttp.Call call = getNotificationsValidateBeforeCall(userId, space, status, null, null);
        Type localVarReturnType = new TypeToken<NotificationsRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Notifications (asynchronously)
     * 
     * @param userId User Id (required)
     * @param space Space Ids (optional)
     * @param status Status (optional, default to pending)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotificationsAsync(String userId, List<String> space, String status, final ApiCallback<NotificationsRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotificationsValidateBeforeCall(userId, space, status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NotificationsRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getParties
     * @param userId User Id (required)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Space Ids (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPartiesCall(String userId, String filterText, Integer offset, Integer limit, List<String> space, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/parties"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterText != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterText", filterText));
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
    private com.squareup.okhttp.Call getPartiesValidateBeforeCall(String userId, String filterText, Integer offset, Integer limit, List<String> space, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getParties(Async)");
        }
        

        com.squareup.okhttp.Call call = getPartiesCall(userId, filterText, offset, limit, space, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get parties
     * 
     * @param userId User Id (required)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Space Ids (optional)
     * @return GenericDataRepresentationListPartyData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListPartyData getParties(String userId, String filterText, Integer offset, Integer limit, List<String> space) throws ApiException {
        ApiResponse<GenericDataRepresentationListPartyData> resp = getPartiesWithHttpInfo(userId, filterText, offset, limit, space);
        return resp.getData();
    }

    /**
     * Get parties
     * 
     * @param userId User Id (required)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Space Ids (optional)
     * @return ApiResponse&lt;GenericDataRepresentationListPartyData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListPartyData> getPartiesWithHttpInfo(String userId, String filterText, Integer offset, Integer limit, List<String> space) throws ApiException {
        com.squareup.okhttp.Call call = getPartiesValidateBeforeCall(userId, filterText, offset, limit, space, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListPartyData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get parties (asynchronously)
     * 
     * @param userId User Id (required)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max result (optional, default to 10)
     * @param space Space Ids (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPartiesAsync(String userId, String filterText, Integer offset, Integer limit, List<String> space, final ApiCallback<GenericDataRepresentationListPartyData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPartiesValidateBeforeCall(userId, filterText, offset, limit, space, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListPartyData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUser
     * @param userId User Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    private com.squareup.okhttp.Call getUserValidateBeforeCall(String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUser(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserCall(userId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return One User
     * 
     * @param userId User Id (required)
     * @return UserRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserRepresentation getUser(String userId) throws ApiException {
        ApiResponse<UserRepresentation> resp = getUserWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * Return One User
     * 
     * @param userId User Id (required)
     * @return ApiResponse&lt;UserRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserRepresentation> getUserWithHttpInfo(String userId) throws ApiException {
        com.squareup.okhttp.Call call = getUserValidateBeforeCall(userId, null, null);
        Type localVarReturnType = new TypeToken<UserRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return One User (asynchronously)
     * 
     * @param userId User Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserAsync(String userId, final ApiCallback<UserRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserValidateBeforeCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserDocument
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserDocumentCall(String userId, String documentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/documents/{documentId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
    private com.squareup.okhttp.Call getUserDocumentValidateBeforeCall(String userId, String documentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserDocument(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling getUserDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserDocumentCall(userId, documentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return one Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @return DocumentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentRepresentation getUserDocument(String userId, String documentId) throws ApiException {
        ApiResponse<DocumentRepresentation> resp = getUserDocumentWithHttpInfo(userId, documentId);
        return resp.getData();
    }

    /**
     * Return one Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @return ApiResponse&lt;DocumentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentRepresentation> getUserDocumentWithHttpInfo(String userId, String documentId) throws ApiException {
        com.squareup.okhttp.Call call = getUserDocumentValidateBeforeCall(userId, documentId, null, null);
        Type localVarReturnType = new TypeToken<DocumentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return one Document (asynchronously)
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserDocumentAsync(String userId, String documentId, final ApiCallback<DocumentRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserDocumentValidateBeforeCall(userId, documentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserDocuments
     * @param userId User Id (required)
     * @param filterText Filter text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Maz results (optional, default to 10)
     * @param space Space Ids (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserDocumentsCall(String userId, String filterText, Integer offset, Integer limit, List<String> space, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/documents"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (filterText != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filterText", filterText));
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
    private com.squareup.okhttp.Call getUserDocumentsValidateBeforeCall(String userId, String filterText, Integer offset, Integer limit, List<String> space, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserDocuments(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserDocumentsCall(userId, filterText, offset, limit, space, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return List of Documents
     * 
     * @param userId User Id (required)
     * @param filterText Filter text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Maz results (optional, default to 10)
     * @param space Space Ids (optional)
     * @return GenericDataRepresentationListDocumentData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListDocumentData getUserDocuments(String userId, String filterText, Integer offset, Integer limit, List<String> space) throws ApiException {
        ApiResponse<GenericDataRepresentationListDocumentData> resp = getUserDocumentsWithHttpInfo(userId, filterText, offset, limit, space);
        return resp.getData();
    }

    /**
     * Return List of Documents
     * 
     * @param userId User Id (required)
     * @param filterText Filter text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Maz results (optional, default to 10)
     * @param space Space Ids (optional)
     * @return ApiResponse&lt;GenericDataRepresentationListDocumentData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListDocumentData> getUserDocumentsWithHttpInfo(String userId, String filterText, Integer offset, Integer limit, List<String> space) throws ApiException {
        com.squareup.okhttp.Call call = getUserDocumentsValidateBeforeCall(userId, filterText, offset, limit, space, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListDocumentData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return List of Documents (asynchronously)
     * 
     * @param userId User Id (required)
     * @param filterText Filter text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Maz results (optional, default to 10)
     * @param space Space Ids (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserDocumentsAsync(String userId, String filterText, Integer offset, Integer limit, List<String> space, final ApiCallback<GenericDataRepresentationListDocumentData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserDocumentsValidateBeforeCall(userId, filterText, offset, limit, space, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListDocumentData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserSpace
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserSpaceCall(String userId, String spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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
    private com.squareup.okhttp.Call getUserSpaceValidateBeforeCall(String userId, String spaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserSpace(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getUserSpace(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserSpaceCall(userId, spaceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return one Space
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @return SpaceRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SpaceRepresentation getUserSpace(String userId, String spaceId) throws ApiException {
        ApiResponse<SpaceRepresentation> resp = getUserSpaceWithHttpInfo(userId, spaceId);
        return resp.getData();
    }

    /**
     * Return one Space
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @return ApiResponse&lt;SpaceRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SpaceRepresentation> getUserSpaceWithHttpInfo(String userId, String spaceId) throws ApiException {
        com.squareup.okhttp.Call call = getUserSpaceValidateBeforeCall(userId, spaceId, null, null);
        Type localVarReturnType = new TypeToken<SpaceRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return one Space (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserSpaceAsync(String userId, String spaceId, final ApiCallback<SpaceRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserSpaceValidateBeforeCall(userId, spaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SpaceRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserSpaceCollaborators
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserSpaceCollaboratorsCall(String userId, String spaceId, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}/collaborators"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "spaceId" + "\\}", apiClient.escapeString(spaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getUserSpaceCollaboratorsValidateBeforeCall(String userId, String spaceId, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserSpaceCollaborators(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getUserSpaceCollaborators(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserSpaceCollaboratorsCall(userId, spaceId, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return list of Collaborators
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return GenericDataRepresentationListUserData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListUserData getUserSpaceCollaborators(String userId, String spaceId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<GenericDataRepresentationListUserData> resp = getUserSpaceCollaboratorsWithHttpInfo(userId, spaceId, offset, limit);
        return resp.getData();
    }

    /**
     * Return list of Collaborators
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return ApiResponse&lt;GenericDataRepresentationListUserData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListUserData> getUserSpaceCollaboratorsWithHttpInfo(String userId, String spaceId, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getUserSpaceCollaboratorsValidateBeforeCall(userId, spaceId, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListUserData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return list of Collaborators (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserSpaceCollaboratorsAsync(String userId, String spaceId, Integer offset, Integer limit, final ApiCallback<GenericDataRepresentationListUserData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserSpaceCollaboratorsValidateBeforeCall(userId, spaceId, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListUserData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserSpaceRequestAccess
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param status Status (optional, default to pending)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserSpaceRequestAccessCall(String userId, String spaceId, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}/request-access"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "spaceId" + "\\}", apiClient.escapeString(spaceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));

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
    private com.squareup.okhttp.Call getUserSpaceRequestAccessValidateBeforeCall(String userId, String spaceId, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserSpaceRequestAccess(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling getUserSpaceRequestAccess(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserSpaceRequestAccessCall(userId, spaceId, status, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Notifications
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param status Status (optional, default to pending)
     * @return GenericDataRepresentationListRequestData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListRequestData getUserSpaceRequestAccess(String userId, String spaceId, String status) throws ApiException {
        ApiResponse<GenericDataRepresentationListRequestData> resp = getUserSpaceRequestAccessWithHttpInfo(userId, spaceId, status);
        return resp.getData();
    }

    /**
     * Get Notifications
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param status Status (optional, default to pending)
     * @return ApiResponse&lt;GenericDataRepresentationListRequestData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListRequestData> getUserSpaceRequestAccessWithHttpInfo(String userId, String spaceId, String status) throws ApiException {
        com.squareup.okhttp.Call call = getUserSpaceRequestAccessValidateBeforeCall(userId, spaceId, status, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListRequestData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Notifications (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param status Status (optional, default to pending)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserSpaceRequestAccessAsync(String userId, String spaceId, String status, final ApiCallback<GenericDataRepresentationListRequestData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserSpaceRequestAccessValidateBeforeCall(userId, spaceId, status, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListRequestData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUserSpaces
     * @param userId User Id (required)
     * @param role Role (optional, default to owner)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUserSpacesCall(String userId, String role, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (role != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("role", role));
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
    private com.squareup.okhttp.Call getUserSpacesValidateBeforeCall(String userId, String role, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserSpaces(Async)");
        }
        

        com.squareup.okhttp.Call call = getUserSpacesCall(userId, role, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return allowed Spaces of User
     * 
     * @param userId User Id (required)
     * @param role Role (optional, default to owner)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return GenericDataRepresentationListSpaceData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListSpaceData getUserSpaces(String userId, String role, Integer offset, Integer limit) throws ApiException {
        ApiResponse<GenericDataRepresentationListSpaceData> resp = getUserSpacesWithHttpInfo(userId, role, offset, limit);
        return resp.getData();
    }

    /**
     * Return allowed Spaces of User
     * 
     * @param userId User Id (required)
     * @param role Role (optional, default to owner)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return ApiResponse&lt;GenericDataRepresentationListSpaceData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListSpaceData> getUserSpacesWithHttpInfo(String userId, String role, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getUserSpacesValidateBeforeCall(userId, role, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListSpaceData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return allowed Spaces of User (asynchronously)
     * 
     * @param userId User Id (required)
     * @param role Role (optional, default to owner)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserSpacesAsync(String userId, String role, Integer offset, Integer limit, final ApiCallback<GenericDataRepresentationListSpaceData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserSpacesValidateBeforeCall(userId, role, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListSpaceData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getUsers
     * @param username Username (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsersCall(String username, String filterText, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("username", username));
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
    private com.squareup.okhttp.Call getUsersValidateBeforeCall(String username, String filterText, Integer offset, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getUsersCall(username, filterText, offset, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Return List of Users
     * 
     * @param username Username (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return GenericDataRepresentationListUserData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListUserData getUsers(String username, String filterText, Integer offset, Integer limit) throws ApiException {
        ApiResponse<GenericDataRepresentationListUserData> resp = getUsersWithHttpInfo(username, filterText, offset, limit);
        return resp.getData();
    }

    /**
     * Return List of Users
     * 
     * @param username Username (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @return ApiResponse&lt;GenericDataRepresentationListUserData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListUserData> getUsersWithHttpInfo(String username, String filterText, Integer offset, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getUsersValidateBeforeCall(username, filterText, offset, limit, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListUserData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return List of Users (asynchronously)
     * 
     * @param username Username (optional)
     * @param filterText Filter Text (optional)
     * @param offset First result (optional, default to 0)
     * @param limit Max results (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsersAsync(String username, String filterText, Integer offset, Integer limit, final ApiCallback<GenericDataRepresentationListUserData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUsersValidateBeforeCall(username, filterText, offset, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListUserData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeSpaceCollaborators
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param collaboratorId User Id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeSpaceCollaboratorsCall(String userId, String spaceId, String collaboratorId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}/collaborators/{collaboratorId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "spaceId" + "\\}", apiClient.escapeString(spaceId.toString()))
            .replaceAll("\\{" + "collaboratorId" + "\\}", apiClient.escapeString(collaboratorId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeSpaceCollaboratorsValidateBeforeCall(String userId, String spaceId, String collaboratorId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling removeSpaceCollaborators(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling removeSpaceCollaborators(Async)");
        }
        
        // verify the required parameter 'collaboratorId' is set
        if (collaboratorId == null) {
            throw new ApiException("Missing the required parameter 'collaboratorId' when calling removeSpaceCollaborators(Async)");
        }
        

        com.squareup.okhttp.Call call = removeSpaceCollaboratorsCall(userId, spaceId, collaboratorId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Remove Collaborator
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param collaboratorId User Id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeSpaceCollaborators(String userId, String spaceId, String collaboratorId) throws ApiException {
        removeSpaceCollaboratorsWithHttpInfo(userId, spaceId, collaboratorId);
    }

    /**
     * Remove Collaborator
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param collaboratorId User Id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeSpaceCollaboratorsWithHttpInfo(String userId, String spaceId, String collaboratorId) throws ApiException {
        com.squareup.okhttp.Call call = removeSpaceCollaboratorsValidateBeforeCall(userId, spaceId, collaboratorId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove Collaborator (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param collaboratorId User Id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeSpaceCollaboratorsAsync(String userId, String spaceId, String collaboratorId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeSpaceCollaboratorsValidateBeforeCall(userId, spaceId, collaboratorId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for searchUserDocuments
     * @param userId User Id (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchUserDocumentsCall(String userId, DocumentQueryRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/documents/search"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
    private com.squareup.okhttp.Call searchUserDocumentsValidateBeforeCall(String userId, DocumentQueryRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling searchUserDocuments(Async)");
        }
        

        com.squareup.okhttp.Call call = searchUserDocumentsCall(userId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search Document
     * Search on allowed user (session) spaces
     * @param userId User Id (required)
     * @param body  (optional)
     * @return GenericDataRepresentationListDocumentData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericDataRepresentationListDocumentData searchUserDocuments(String userId, DocumentQueryRepresentation body) throws ApiException {
        ApiResponse<GenericDataRepresentationListDocumentData> resp = searchUserDocumentsWithHttpInfo(userId, body);
        return resp.getData();
    }

    /**
     * Search Document
     * Search on allowed user (session) spaces
     * @param userId User Id (required)
     * @param body  (optional)
     * @return ApiResponse&lt;GenericDataRepresentationListDocumentData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericDataRepresentationListDocumentData> searchUserDocumentsWithHttpInfo(String userId, DocumentQueryRepresentation body) throws ApiException {
        com.squareup.okhttp.Call call = searchUserDocumentsValidateBeforeCall(userId, body, null, null);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListDocumentData>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search Document (asynchronously)
     * Search on allowed user (session) spaces
     * @param userId User Id (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchUserDocumentsAsync(String userId, DocumentQueryRepresentation body, final ApiCallback<GenericDataRepresentationListDocumentData> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = searchUserDocumentsValidateBeforeCall(userId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericDataRepresentationListDocumentData>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUser
     * @param userId User Id (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUserCall(String userId, UserRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/users/{userId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUserValidateBeforeCall(String userId, UserRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateUser(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUserCall(userId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update User
     * 
     * @param userId User Id (required)
     * @param body  (optional)
     * @return UserRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserRepresentation updateUser(String userId, UserRepresentation body) throws ApiException {
        ApiResponse<UserRepresentation> resp = updateUserWithHttpInfo(userId, body);
        return resp.getData();
    }

    /**
     * Update User
     * 
     * @param userId User Id (required)
     * @param body  (optional)
     * @return ApiResponse&lt;UserRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserRepresentation> updateUserWithHttpInfo(String userId, UserRepresentation body) throws ApiException {
        com.squareup.okhttp.Call call = updateUserValidateBeforeCall(userId, body, null, null);
        Type localVarReturnType = new TypeToken<UserRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update User (asynchronously)
     * 
     * @param userId User Id (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUserAsync(String userId, UserRepresentation body, final ApiCallback<UserRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUserValidateBeforeCall(userId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUserDocument
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUserDocumentCall(String userId, String documentId, DocumentRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/documents/{documentId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
            .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUserDocumentValidateBeforeCall(String userId, String documentId, DocumentRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateUserDocument(Async)");
        }
        
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new ApiException("Missing the required parameter 'documentId' when calling updateUserDocument(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUserDocumentCall(userId, documentId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update a Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param body  (optional)
     * @return DocumentRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentRepresentation updateUserDocument(String userId, String documentId, DocumentRepresentation body) throws ApiException {
        ApiResponse<DocumentRepresentation> resp = updateUserDocumentWithHttpInfo(userId, documentId, body);
        return resp.getData();
    }

    /**
     * Update a Document
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param body  (optional)
     * @return ApiResponse&lt;DocumentRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentRepresentation> updateUserDocumentWithHttpInfo(String userId, String documentId, DocumentRepresentation body) throws ApiException {
        com.squareup.okhttp.Call call = updateUserDocumentValidateBeforeCall(userId, documentId, body, null, null);
        Type localVarReturnType = new TypeToken<DocumentRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Document (asynchronously)
     * 
     * @param userId User Id (required)
     * @param documentId Document Id (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUserDocumentAsync(String userId, String documentId, DocumentRepresentation body, final ApiCallback<DocumentRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUserDocumentValidateBeforeCall(userId, documentId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateUserSpace
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateUserSpaceCall(String userId, String spaceId, SpaceRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/users/{userId}/spaces/{spaceId}"
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()))
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateUserSpaceValidateBeforeCall(String userId, String spaceId, SpaceRepresentation body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateUserSpace(Async)");
        }
        
        // verify the required parameter 'spaceId' is set
        if (spaceId == null) {
            throw new ApiException("Missing the required parameter 'spaceId' when calling updateUserSpace(Async)");
        }
        

        com.squareup.okhttp.Call call = updateUserSpaceCall(userId, spaceId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update space
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @return SpaceRepresentation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SpaceRepresentation updateUserSpace(String userId, String spaceId, SpaceRepresentation body) throws ApiException {
        ApiResponse<SpaceRepresentation> resp = updateUserSpaceWithHttpInfo(userId, spaceId, body);
        return resp.getData();
    }

    /**
     * Update space
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @return ApiResponse&lt;SpaceRepresentation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SpaceRepresentation> updateUserSpaceWithHttpInfo(String userId, String spaceId, SpaceRepresentation body) throws ApiException {
        com.squareup.okhttp.Call call = updateUserSpaceValidateBeforeCall(userId, spaceId, body, null, null);
        Type localVarReturnType = new TypeToken<SpaceRepresentation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update space (asynchronously)
     * 
     * @param userId User Id (required)
     * @param spaceId Space Id (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateUserSpaceAsync(String userId, String spaceId, SpaceRepresentation body, final ApiCallback<SpaceRepresentation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateUserSpaceValidateBeforeCall(userId, spaceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SpaceRepresentation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
