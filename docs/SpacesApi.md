# SpacesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpace**](SpacesApi.md#createSpace) | **POST** /api/spaces | Create Space
[**getSpace**](SpacesApi.md#getSpace) | **GET** /api/spaces/{spaceId} | Get Space
[**getSpaces**](SpacesApi.md#getSpaces) | **GET** /api/spaces | Get Spaces


<a name="createSpace"></a>
# **createSpace**
> createSpace(body)

Create Space

This will create a space. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
SpaceRepresentation body = new SpaceRepresentation(); // SpaceRepresentation | 
try {
    apiInstance.createSpace(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#createSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SpaceRepresentation**](SpaceRepresentation.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSpace"></a>
# **getSpace**
> SpaceRepresentation getSpace(spaceId)

Get Space

This will get a space. [view-spaces] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String spaceId = "spaceId_example"; // String | Space Id
try {
    SpaceRepresentation result = apiInstance.getSpace(spaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#getSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **String**| Space Id |

### Return type

[**SpaceRepresentation**](SpaceRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSpaces"></a>
# **getSpaces**
> GenericDataRepresentationListSpaceData getSpaces(assignedId, q, offset, limit)

Get Spaces

This will search spaces. [view-spaces] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String assignedId = "assignedId_example"; // String | Space Assigned Id
String q = "*"; // String | Full text search value
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListSpaceData result = apiInstance.getSpaces(assignedId, q, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#getSpaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assignedId** | **String**| Space Assigned Id | [optional]
 **q** | **String**| Full text search value | [optional] [default to *]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max results | [optional] [default to 10]

### Return type

[**GenericDataRepresentationListSpaceData**](GenericDataRepresentationListSpaceData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

