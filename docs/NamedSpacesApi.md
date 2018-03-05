# NamedSpacesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserSpaces**](NamedSpacesApi.md#getUserSpaces) | **GET** /api/namedspaces/{userId} | Return allowed Spaces of User


<a name="getUserSpaces"></a>
# **getUserSpaces**
> GenericDataRepresentationListSpaceData getUserSpaces(userId, role, offset, limit)

Return allowed Spaces of User

[view-users] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamedSpacesApi;


NamedSpacesApi apiInstance = new NamedSpacesApi();
String userId = "userId_example"; // String | User Id
String role = "owner"; // String | Role
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListSpaceData result = apiInstance.getUserSpaces(userId, role, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamedSpacesApi#getUserSpaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **role** | **String**| Role | [optional] [default to owner] [enum: owner, collaborator]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max results | [optional] [default to 10]

### Return type

[**GenericDataRepresentationListSpaceData**](GenericDataRepresentationListSpaceData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

