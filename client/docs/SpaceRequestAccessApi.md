# SpaceRequestAccessApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRequestAccess**](SpaceRequestAccessApi.md#getRequestAccess) | **GET** /request-access | 
[**requestAccessToSpace**](SpaceRequestAccessApi.md#requestAccessToSpace) | **POST** /request-access | 
[**updateAccessSpace**](SpaceRequestAccessApi.md#updateAccessSpace) | **PUT** /request-access/{requestId} | 


<a name="getRequestAccess"></a>
# **getRequestAccess**
> GenericDataRepresentationListRequestData getRequestAccess()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceRequestAccessApi;


SpaceRequestAccessApi apiInstance = new SpaceRequestAccessApi();
try {
    GenericDataRepresentationListRequestData result = apiInstance.getRequestAccess();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceRequestAccessApi#getRequestAccess");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

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



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceRequestAccessApi;


SpaceRequestAccessApi apiInstance = new SpaceRequestAccessApi();
RequestRepresentation body = new RequestRepresentation(); // RequestRepresentation | 
try {
    apiInstance.requestAccessToSpace(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceRequestAccessApi#requestAccessToSpace");
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



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpaceRequestAccessApi;


SpaceRequestAccessApi apiInstance = new SpaceRequestAccessApi();
String requestId = "requestId_example"; // String | 
RequestRepresentation body = new RequestRepresentation(); // RequestRepresentation | 
try {
    apiInstance.updateAccessSpace(requestId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpaceRequestAccessApi#updateAccessSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **String**|  |
 **body** | [**RequestRepresentation**](RequestRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

