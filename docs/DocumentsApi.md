# DocumentsApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /api/documents/{documentId} | Get Document
[**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /api/documents | Get Documents
[**getXml**](DocumentsApi.md#getXml) | **GET** /api/documents/{documentId}/download | Download Document
[**importDocument**](DocumentsApi.md#importDocument) | **POST** /api/documents | Import Document
[**printDocument**](DocumentsApi.md#printDocument) | **GET** /api/documents/{documentId}/print | Print Document
[**searchDocuments**](DocumentsApi.md#searchDocuments) | **POST** /api/documents/search | Search Document
[**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** /api/documents/{documentId} | Update Document


<a name="getDocument"></a>
# **getDocument**
> DocumentRepresentation getDocument(documentId)

Get Document

This will return a document

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
try {
    DocumentRepresentation result = apiInstance.getDocument(documentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document Id |

### Return type

[**DocumentRepresentation**](DocumentRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDocuments"></a>
# **getDocuments**
> GenericDataRepresentationListDocumentData getDocuments(q, offset, limit, space)

Get Documents

This will search just on Owned and Collaborated Spaces

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String q = "q_example"; // String | A text for filter results
Integer offset = 0; // Integer | The first position of array results
Integer limit = 10; // Integer | The max number of results
List<String> space = Arrays.asList("space_example"); // List<String> | List of space ids to search in. If null or empty all allowed spaces of user will be used
try {
    GenericDataRepresentationListDocumentData result = apiInstance.getDocuments(q, offset, limit, space);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A text for filter results | [optional]
 **offset** | **Integer**| The first position of array results | [optional] [default to 0]
 **limit** | **Integer**| The max number of results | [optional] [default to 10]
 **space** | [**List&lt;String&gt;**](String.md)| List of space ids to search in. If null or empty all allowed spaces of user will be used | [optional]

### Return type

[**GenericDataRepresentationListDocumentData**](GenericDataRepresentationListDocumentData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getXml"></a>
# **getXml**
> getXml(documentId)

Download Document

This will download the document

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
try {
    apiInstance.getXml(documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getXml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document Id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/xml

<a name="importDocument"></a>
# **importDocument**
> importDocument(body)

Import Document

This will import xml or compressed files

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
MultipartFormDataInput body = new MultipartFormDataInput(); // MultipartFormDataInput | 
try {
    apiInstance.importDocument(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#importDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultipartFormDataInput**](MultipartFormDataInput.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="printDocument"></a>
# **printDocument**
> printDocument(documentId, theme, format)

Print Document

This will print the document

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
String theme = "theme_example"; // String | Theme
String format = "pdf"; // String | format
try {
    apiInstance.printDocument(documentId, theme, format);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#printDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="searchDocuments"></a>
# **searchDocuments**
> GenericDataRepresentationListDocumentData searchDocuments(body)

Search Document

This will search document in advanced mode

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
DocumentQueryRepresentation body = new DocumentQueryRepresentation(); // DocumentQueryRepresentation | 
try {
    GenericDataRepresentationListDocumentData result = apiInstance.searchDocuments(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#searchDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocumentQueryRepresentation**](DocumentQueryRepresentation.md)|  | [optional]

### Return type

[**GenericDataRepresentationListDocumentData**](GenericDataRepresentationListDocumentData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDocument"></a>
# **updateDocument**
> DocumentRepresentation updateDocument(documentId, body)

Update Document

This will update the document just for current user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
DocumentRepresentation body = new DocumentRepresentation(); // DocumentRepresentation | 
try {
    DocumentRepresentation result = apiInstance.updateDocument(documentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#updateDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document Id |
 **body** | [**DocumentRepresentation**](DocumentRepresentation.md)|  | [optional]

### Return type

[**DocumentRepresentation**](DocumentRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

