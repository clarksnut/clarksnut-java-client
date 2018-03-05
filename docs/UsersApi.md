# UsersApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSpaceCollaborators**](UsersApi.md#addSpaceCollaborators) | **POST** /api/users/{userId}/spaces/{spaceId}/collaborators | Add new Collaborator
[**deleteUserSpace**](UsersApi.md#deleteUserSpace) | **DELETE** /api/users/{userId}/spaces/{spaceId} | Delete space
[**downloadPdf**](UsersApi.md#downloadPdf) | **GET** /api/users/{userId}/documents/{documentId}/print | Print Document
[**downloadUserDocumentXml**](UsersApi.md#downloadUserDocumentXml) | **GET** /api/users/{userId}/documents/{documentId}/download | Download Document
[**getNotifications**](UsersApi.md#getNotifications) | **GET** /api/users/{userId}/notifications | Get Notifications
[**getParties**](UsersApi.md#getParties) | **GET** /api/users/{userId}/parties | Get parties
[**getUser**](UsersApi.md#getUser) | **GET** /api/users/{userId} | Return One User
[**getUserDocument**](UsersApi.md#getUserDocument) | **GET** /api/users/{userId}/documents/{documentId} | Return one Document
[**getUserDocuments**](UsersApi.md#getUserDocuments) | **GET** /api/users/{userId}/documents | Return List of Documents
[**getUserSpace**](UsersApi.md#getUserSpace) | **GET** /api/users/{userId}/spaces/{spaceId} | Return one Space
[**getUserSpaceCollaborators**](UsersApi.md#getUserSpaceCollaborators) | **GET** /api/users/{userId}/spaces/{spaceId}/collaborators | Return list of Collaborators
[**getUserSpaceRequestAccess**](UsersApi.md#getUserSpaceRequestAccess) | **GET** /api/users/{userId}/spaces/{spaceId}/request-access | Get Notifications
[**getUserSpaces**](UsersApi.md#getUserSpaces) | **GET** /api/users/{userId}/spaces | Return allowed Spaces of User
[**getUsers**](UsersApi.md#getUsers) | **GET** /api/users | Return List of Users
[**removeSpaceCollaborators**](UsersApi.md#removeSpaceCollaborators) | **DELETE** /api/users/{userId}/spaces/{spaceId}/collaborators/{collaboratorId} | Remove Collaborator
[**searchUserDocuments**](UsersApi.md#searchUserDocuments) | **POST** /api/users/{userId}/documents/search | Search Document
[**updateUser**](UsersApi.md#updateUser) | **PUT** /api/users/{userId} | Update User
[**updateUserDocument**](UsersApi.md#updateUserDocument) | **PUT** /api/users/{userId}/documents/{documentId} | Update a Document
[**updateUserSpace**](UsersApi.md#updateUserSpace) | **PUT** /api/users/{userId}/spaces/{spaceId} | Update space


<a name="addSpaceCollaborators"></a>
# **addSpaceCollaborators**
> addSpaceCollaborators(userId, spaceId, body)

Add new Collaborator



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
TypedGenericDataRepresentationListUserData body = new TypedGenericDataRepresentationListUserData(); // TypedGenericDataRepresentationListUserData | 
try {
    apiInstance.addSpaceCollaborators(userId, spaceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#addSpaceCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
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
> deleteUserSpace(userId, spaceId)

Delete space



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
try {
    apiInstance.deleteUserSpace(userId, spaceId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#deleteUserSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **spaceId** | **String**| Space Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadPdf"></a>
# **downloadPdf**
> downloadPdf(userId, documentId, theme, format)

Print Document



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String documentId = "documentId_example"; // String | Document Id
String theme = "theme_example"; // String | Theme
String format = "pdf"; // String | format
try {
    apiInstance.downloadPdf(userId, documentId, theme, format);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#downloadPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **documentId** | **String**| Document Id |
 **theme** | **String**| Theme | [optional]
 **format** | **String**| format | [optional] [default to pdf] [enum: pdf, html]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="downloadUserDocumentXml"></a>
# **downloadUserDocumentXml**
> downloadUserDocumentXml(userId, documentId)

Download Document



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String documentId = "documentId_example"; // String | Document Id
try {
    apiInstance.downloadUserDocumentXml(userId, documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#downloadUserDocumentXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **documentId** | **String**| Document Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml

<a name="getNotifications"></a>
# **getNotifications**
> NotificationsRepresentation getNotifications(userId, space, status)

Get Notifications



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
List<String> space = Arrays.asList("space_example"); // List<String> | Space Ids
String status = "pending"; // String | Status
try {
    NotificationsRepresentation result = apiInstance.getNotifications(userId, space, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **space** | [**List&lt;String&gt;**](String.md)| Space Ids | [optional]
 **status** | **String**| Status | [optional] [default to pending] [enum: pending, accepted, rejected]

### Return type

[**NotificationsRepresentation**](NotificationsRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getParties"></a>
# **getParties**
> GenericDataRepresentationListPartyData getParties(userId, filterText, offset, limit, space)

Get parties



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String filterText = "filterText_example"; // String | Filter Text
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max result
List<String> space = Arrays.asList("space_example"); // List<String> | Space Ids
try {
    GenericDataRepresentationListPartyData result = apiInstance.getParties(userId, filterText, offset, limit, space);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getParties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **filterText** | **String**| Filter Text | [optional]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max result | [optional] [default to 10]
 **space** | [**List&lt;String&gt;**](String.md)| Space Ids | [optional]

### Return type

[**GenericDataRepresentationListPartyData**](GenericDataRepresentationListPartyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserRepresentation getUser(userId)

Return One User



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
try {
    UserRepresentation result = apiInstance.getUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserDocument"></a>
# **getUserDocument**
> DocumentRepresentation getUserDocument(userId, documentId)

Return one Document



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String documentId = "documentId_example"; // String | Document Id
try {
    DocumentRepresentation result = apiInstance.getUserDocument(userId, documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **documentId** | **String**| Document Id |

### Return type

[**DocumentRepresentation**](DocumentRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserDocuments"></a>
# **getUserDocuments**
> GenericDataRepresentationListDocumentData getUserDocuments(userId, filterText, offset, limit, space)

Return List of Documents



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String filterText = "filterText_example"; // String | Filter text
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Maz results
List<String> space = Arrays.asList("space_example"); // List<String> | Space Ids
try {
    GenericDataRepresentationListDocumentData result = apiInstance.getUserDocuments(userId, filterText, offset, limit, space);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **filterText** | **String**| Filter text | [optional]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Maz results | [optional] [default to 10]
 **space** | [**List&lt;String&gt;**](String.md)| Space Ids | [optional]

### Return type

[**GenericDataRepresentationListDocumentData**](GenericDataRepresentationListDocumentData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSpace"></a>
# **getUserSpace**
> SpaceRepresentation getUserSpace(userId, spaceId)

Return one Space



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
try {
    SpaceRepresentation result = apiInstance.getUserSpace(userId, spaceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **spaceId** | **String**| Space Id |

### Return type

[**SpaceRepresentation**](SpaceRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSpaceCollaborators"></a>
# **getUserSpaceCollaborators**
> GenericDataRepresentationListUserData getUserSpaceCollaborators(userId, spaceId, offset, limit)

Return list of Collaborators



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListUserData result = apiInstance.getUserSpaceCollaborators(userId, spaceId, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSpaceCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
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

<a name="getUserSpaceRequestAccess"></a>
# **getUserSpaceRequestAccess**
> GenericDataRepresentationListRequestData getUserSpaceRequestAccess(userId, spaceId, status)

Get Notifications



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
String status = "pending"; // String | Status
try {
    GenericDataRepresentationListRequestData result = apiInstance.getUserSpaceRequestAccess(userId, spaceId, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSpaceRequestAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **spaceId** | **String**| Space Id |
 **status** | **String**| Status | [optional] [default to pending] [enum: pending, accepted, rejected]

### Return type

[**GenericDataRepresentationListRequestData**](GenericDataRepresentationListRequestData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserSpaces"></a>
# **getUserSpaces**
> GenericDataRepresentationListSpaceData getUserSpaces(userId, role, offset, limit)

Return allowed Spaces of User



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String role = "owner"; // String | Role
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListSpaceData result = apiInstance.getUserSpaces(userId, role, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUserSpaces");
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

<a name="getUsers"></a>
# **getUsers**
> GenericDataRepresentationListUserData getUsers(username, filterText, offset, limit)

Return List of Users



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String username = "username_example"; // String | Username
String filterText = "filterText_example"; // String | Filter Text
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max results
try {
    GenericDataRepresentationListUserData result = apiInstance.getUsers(username, filterText, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Username | [optional]
 **filterText** | **String**| Filter Text | [optional]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max results | [optional] [default to 10]

### Return type

[**GenericDataRepresentationListUserData**](GenericDataRepresentationListUserData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeSpaceCollaborators"></a>
# **removeSpaceCollaborators**
> removeSpaceCollaborators(userId, spaceId, collaboratorId)

Remove Collaborator



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
String collaboratorId = "collaboratorId_example"; // String | User Id
try {
    apiInstance.removeSpaceCollaborators(userId, spaceId, collaboratorId);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#removeSpaceCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **spaceId** | **String**| Space Id |
 **collaboratorId** | **String**| User Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchUserDocuments"></a>
# **searchUserDocuments**
> GenericDataRepresentationListDocumentData searchUserDocuments(userId, body)

Search Document

Search on allowed user (session) spaces

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
DocumentQueryRepresentation body = new DocumentQueryRepresentation(); // DocumentQueryRepresentation | 
try {
    GenericDataRepresentationListDocumentData result = apiInstance.searchUserDocuments(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#searchUserDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **body** | [**DocumentQueryRepresentation**](DocumentQueryRepresentation.md)|  | [optional]

### Return type

[**GenericDataRepresentationListDocumentData**](GenericDataRepresentationListDocumentData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserRepresentation updateUser(userId, body)

Update User



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
UserRepresentation body = new UserRepresentation(); // UserRepresentation | 
try {
    UserRepresentation result = apiInstance.updateUser(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **body** | [**UserRepresentation**](UserRepresentation.md)|  | [optional]

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserDocument"></a>
# **updateUserDocument**
> DocumentRepresentation updateUserDocument(userId, documentId, body)

Update a Document



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String documentId = "documentId_example"; // String | Document Id
DocumentRepresentation body = new DocumentRepresentation(); // DocumentRepresentation | 
try {
    DocumentRepresentation result = apiInstance.updateUserDocument(userId, documentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **documentId** | **String**| Document Id |
 **body** | [**DocumentRepresentation**](DocumentRepresentation.md)|  | [optional]

### Return type

[**DocumentRepresentation**](DocumentRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserSpace"></a>
# **updateUserSpace**
> SpaceRepresentation updateUserSpace(userId, spaceId, body)

Update space



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UsersApi;


UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User Id
String spaceId = "spaceId_example"; // String | Space Id
SpaceRepresentation body = new SpaceRepresentation(); // SpaceRepresentation | 
try {
    SpaceRepresentation result = apiInstance.updateUserSpace(userId, spaceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#updateUserSpace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User Id |
 **spaceId** | **String**| Space Id |
 **body** | [**SpaceRepresentation**](SpaceRepresentation.md)|  | [optional]

### Return type

[**SpaceRepresentation**](SpaceRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

