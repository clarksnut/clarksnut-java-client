# SpacesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSpaceCollaborators**](SpacesApi.md#addSpaceCollaborators) | **POST** /api/spaces/{spaceId}/collaborators | Add new Collaborator
[**createSpace**](SpacesApi.md#createSpace) | **POST** /api/spaces | Create new Space
[**deleteUserSpace**](SpacesApi.md#deleteUserSpace) | **DELETE** /api/spaces/{spaceId} | Delete space
[**getSpace**](SpacesApi.md#getSpace) | **GET** /api/spaces/{spaceId} | Return one Space
[**getSpaceCollaborators**](SpacesApi.md#getSpaceCollaborators) | **GET** /api/spaces/{spaceId}/collaborators | Return list of Collaborators
[**getSpaces**](SpacesApi.md#getSpaces) | **GET** /api/spaces | Return list of Spaces
[**removeSpaceCollaborators**](SpacesApi.md#removeSpaceCollaborators) | **DELETE** /api/spaces/{spaceId}/collaborators/{userId} | Remove Collaborator
[**updateUserSpace**](SpacesApi.md#updateUserSpace) | **PUT** /api/spaces/{spaceId} | Update space


<a name="addSpaceCollaborators"></a>
# **addSpaceCollaborators**
> addSpaceCollaborators(spaceId, body)

Add new Collaborator

[user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String spaceId = "spaceId_example"; // String | Space Id
TypedGenericDataRepresentationListUserData body = new TypedGenericDataRepresentationListUserData(); // TypedGenericDataRepresentationListUserData | 
try {
    apiInstance.addSpaceCollaborators(spaceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#addSpaceCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **String**| Space Id |
 **body** | [**TypedGenericDataRepresentationListUserData**](TypedGenericDataRepresentationListUserData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a name="deleteUserSpace"></a>
# **deleteUserSpace**
> deleteUserSpace(spaceId)

Delete space



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String spaceId = "spaceId_example"; // String | Space Id
try {
    apiInstance.deleteUserSpace(spaceId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#deleteUserSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **String**| Space Id |

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

<a name="getSpaceCollaborators"></a>
# **getSpaceCollaborators**
> GenericDataRepresentationListUserData getSpaceCollaborators(spaceId, offset, limit)

Return list of Collaborators



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String spaceId = "spaceId_example"; // String | Space Id
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListUserData result = apiInstance.getSpaceCollaborators(spaceId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#getSpaceCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **String**| Space Id |
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max results | [optional] [default to 10]

### Return type

[**GenericDataRepresentationListUserData**](GenericDataRepresentationListUserData.md)

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

<a name="removeSpaceCollaborators"></a>
# **removeSpaceCollaborators**
> removeSpaceCollaborators(spaceId, userId)

Remove Collaborator



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String spaceId = "spaceId_example"; // String | Space Id
String userId = "userId_example"; // String | User Id
try {
    apiInstance.removeSpaceCollaborators(spaceId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#removeSpaceCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **String**| Space Id |
 **userId** | **String**| User Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserSpace"></a>
# **updateUserSpace**
> SpaceRepresentation updateUserSpace(spaceId, body)

Update space



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SpacesApi;


SpacesApi apiInstance = new SpacesApi();
String spaceId = "spaceId_example"; // String | Space Id
SpaceRepresentation body = new SpaceRepresentation(); // SpaceRepresentation | 
try {
    SpaceRepresentation result = apiInstance.updateUserSpace(spaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpacesApi#updateUserSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spaceId** | **String**| Space Id |
 **body** | [**SpaceRepresentation**](SpaceRepresentation.md)|  | [optional]

### Return type

[**SpaceRepresentation**](SpaceRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

