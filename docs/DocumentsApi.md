# DocumentsApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadPdf**](DocumentsApi.md#downloadPdf) | **GET** /api/documents/{documentId}/print | Print Document
[**downloadXml**](DocumentsApi.md#downloadXml) | **GET** /api/documents/{documentId}/download | Download Document
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /api/documents/{documentId} | Return one Document
[**getDocuments**](DocumentsApi.md#getDocuments) | **GET** /api/documents | Return List of Documents
[**importDocument**](DocumentsApi.md#importDocument) | **POST** /api/documents | Import Document
[**searchDocuments**](DocumentsApi.md#searchDocuments) | **POST** /api/documents/search | Search Document
[**updateDocument**](DocumentsApi.md#updateDocument) | **PUT** /api/documents/{documentId} | Update a Document


<a name="downloadPdf"></a>
# **downloadPdf**
> downloadPdf(documentId, theme, format)

Print Document

User need to have access to the Space owner of the document

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
    apiInstance.downloadPdf(documentId, theme, format);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#downloadPdf");
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

<a name="downloadXml"></a>
# **downloadXml**
> downloadXml(documentId)

Download Document

User need to have access to the Space owner of the document

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
try {
    apiInstance.downloadXml(documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#downloadXml");
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

<a name="getDocument"></a>
# **getDocument**
> DocumentRepresentation getDocument(documentId)

Return one Document

User need to have access to the Space owner of the document

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
> GenericDataRepresentationListDocumentData getDocuments(filterText, offset, limit, space)

Return List of Documents

Search on allowed user (session) spaces

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String filterText = "filterText_example"; // String | Filter text
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Maz results
List<String> space = Arrays.asList("space_example"); // List<String> | Space Ids
try {
    GenericDataRepresentationListDocumentData result = apiInstance.getDocuments(filterText, offset, limit, space);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#getDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="searchDocuments"></a>
# **searchDocuments**
> GenericDataRepresentationListDocumentData searchDocuments(body)

Search Document

Search on allowed user (session) spaces

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

Update a Document

User need to have access to the Space owner of the document

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

