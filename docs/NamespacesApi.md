# NamespacesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSpaceCollaborators**](NamespacesApi.md#addSpaceCollaborators) | **POST** /api/namespaces/{spaceId}/collaborators | Add Space SpaceCollaborators
[**deleteUserSpace**](NamespacesApi.md#deleteUserSpace) | **DELETE** /api/namespaces/{spaceId} | Delete space
[**getSpaceCollaborators**](NamespacesApi.md#getSpaceCollaborators) | **GET** /api/namespaces/{spaceId}/collaborators | Get Space SpaceCollaborators
[**getUserSpace**](NamespacesApi.md#getUserSpace) | **GET** /api/namespaces/{spaceId} | Get Space
[**getUserSpaces**](NamespacesApi.md#getUserSpaces) | **GET** /api/namespaces | Get Spaces of user
[**removeSpaceCollaborators**](NamespacesApi.md#removeSpaceCollaborators) | **DELETE** /api/namespaces/{spaceId}/collaborators/{userId} | Remove Space SpaceCollaborators
[**updateUserSpace**](NamespacesApi.md#updateUserSpace) | **PUT** /api/namespaces/{spaceId} | Update space


<a name="addSpaceCollaborators"></a>
# **addSpaceCollaborators**
> addSpaceCollaborators(spaceId, body)

Add Space SpaceCollaborators

Accessed just by the owner, the owner is identified by current token. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String spaceId = "spaceId_example"; // String | Space Id
TypedGenericDataRepresentationListUserData body = new TypedGenericDataRepresentationListUserData(); // TypedGenericDataRepresentationListUserData | 
try {
    apiInstance.addSpaceCollaborators(spaceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#addSpaceCollaborators");
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

<a name="deleteUserSpace"></a>
# **deleteUserSpace**
> deleteUserSpace(spaceId)

Delete space

Accessed just by the owner, the owner is identified by current token. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String spaceId = "spaceId_example"; // String | Space Id
try {
    apiInstance.deleteUserSpace(spaceId);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#deleteUserSpace");
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

<a name="getSpaceCollaborators"></a>
# **getSpaceCollaborators**
> GenericDataRepresentationListUserData getSpaceCollaborators(spaceId, offset, limit)

Get Space SpaceCollaborators

Accessed just by the owner, the owner is identified by current token. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String spaceId = "spaceId_example"; // String | Space Id
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListUserData result = apiInstance.getSpaceCollaborators(spaceId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#getSpaceCollaborators");
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

<a name="getUserSpace"></a>
# **getUserSpace**
> SpaceRepresentation getUserSpace(spaceId)

Get Space

This will get a space, just the owner will be allowed. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String spaceId = "spaceId_example"; // String | Space Id
try {
    SpaceRepresentation result = apiInstance.getUserSpace(spaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#getUserSpace");
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

<a name="getUserSpaces"></a>
# **getUserSpaces**
> GenericDataRepresentationListSpaceData getUserSpaces(role)

Get Spaces of user

This will search owned and collaborated spaces. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String role = "owner"; // String | Role
try {
    GenericDataRepresentationListSpaceData result = apiInstance.getUserSpaces(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#getUserSpaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**| Role | [optional] [default to owner] [enum: owner, collaborator]

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

Remove Space SpaceCollaborators

Accessed just by the owner, the owner is identified by current token. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String spaceId = "spaceId_example"; // String | Space Id
String userId = "userId_example"; // String | User Id
try {
    apiInstance.removeSpaceCollaborators(spaceId, userId);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#removeSpaceCollaborators");
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

Accessed just by the owner, the owner is identified by current token. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NamespacesApi;


NamespacesApi apiInstance = new NamespacesApi();
String spaceId = "spaceId_example"; // String | Space Id
SpaceRepresentation body = new SpaceRepresentation(); // SpaceRepresentation | 
try {
    SpaceRepresentation result = apiInstance.updateUserSpace(spaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NamespacesApi#updateUserSpace");
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

