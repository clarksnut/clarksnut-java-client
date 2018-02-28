# RequestAccessApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRequestAccess**](RequestAccessApi.md#getRequestAccess) | **GET** /request-access | Get Request accesses
[**requestAccessToSpace**](RequestAccessApi.md#requestAccessToSpace) | **POST** /request-access | Request access
[**updateAccessSpace**](RequestAccessApi.md#updateAccessSpace) | **PUT** /request-access/{requestId} | Update request


<a name="getRequestAccess"></a>
# **getRequestAccess**
> GenericDataRepresentationListRequestData getRequestAccess(space, status)

Get Request accesses

This will return all requests on current user. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RequestAccessApi;


RequestAccessApi apiInstance = new RequestAccessApi();
List<String> space = Arrays.asList("space_example"); // List<String> | Space Ids
String status = "pending"; // String | Status
try {
    GenericDataRepresentationListRequestData result = apiInstance.getRequestAccess(space, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RequestAccessApi#getRequestAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **space** | [**List&lt;String&gt;**](String.md)| Space Ids | [optional]
 **status** | **String**| Status | [optional] [default to pending] [enum: pending, accepted, rejected]

### Return type

[**GenericDataRepresentationListRequestData**](GenericDataRepresentationListRequestData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="requestAccessToSpace"></a>
# **requestAccessToSpace**
> requestAccessToSpace(body)

Request access

This will request access to space. [user] role required

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

This will accept or reject requests. [user] role required

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

