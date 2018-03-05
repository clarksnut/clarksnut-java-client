# RequestAccessApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestAccessToSpace**](RequestAccessApi.md#requestAccessToSpace) | **POST** /api/request-access | Request access
[**updateAccessSpace**](RequestAccessApi.md#updateAccessSpace) | **PUT** /api/request-access/{requestId} | Update request


<a name="requestAccessToSpace"></a>
# **requestAccessToSpace**
> requestAccessToSpace(body)

Request access



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestAccessApi;


RequestAccessApi apiInstance = new RequestAccessApi();
RequestRepresentation body = new RequestRepresentation(); // RequestRepresentation | 
try {
    apiInstance.requestAccessToSpace(body);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestAccessApi#requestAccessToSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestRepresentation**](RequestRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccessSpace"></a>
# **updateAccessSpace**
> updateAccessSpace(requestId, body)

Update request



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestAccessApi;


RequestAccessApi apiInstance = new RequestAccessApi();
String requestId = "requestId_example"; // String | Request Id
RequestRepresentation body = new RequestRepresentation(); // RequestRepresentation | 
try {
    apiInstance.updateAccessSpace(requestId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestAccessApi#updateAccessSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**| Request Id |
 **body** | [**RequestRepresentation**](RequestRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

