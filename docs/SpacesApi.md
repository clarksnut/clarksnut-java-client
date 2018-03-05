# SpacesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpace**](SpacesApi.md#createSpace) | **POST** /api/spaces | Create new Space
[**getSpace**](SpacesApi.md#getSpace) | **GET** /api/spaces/{spaceId} | Return one Space
[**getSpaces**](SpacesApi.md#getSpaces) | **GET** /api/spaces | Return list of Spaces


<a name="createSpace"></a>
# **createSpace**
> createSpace(body)

Create new Space



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

Return one Space



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
> GenericDataRepresentationListSpaceData getSpaces(assignedId, filterText, offset, limit)

Return list of Spaces



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String assignedId = "assignedId_example"; // String | Space Assigned Id
String filterText = "filterText_example"; // String | Filter Text
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListSpaceData result = apiInstance.getSpaces(assignedId, filterText, offset, limit);
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
 **filterText** | **String**| Filter Text | [optional]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max results | [optional] [default to 10]

### Return type

[**GenericDataRepresentationListSpaceData**](GenericDataRepresentationListSpaceData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

