# DocumentsApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadDocumentPdf**](DocumentsApi.md#downloadDocumentPdf) | **GET** /api/documents/{documentId}/print | Print Document
[**downloadDocumentXml**](DocumentsApi.md#downloadDocumentXml) | **GET** /api/documents/{documentId}/download | Download Document
[**getDocument**](DocumentsApi.md#getDocument) | **GET** /api/documents/{documentId} | Return one Document
[**importDocument**](DocumentsApi.md#importDocument) | **POST** /api/documents | Import Document


<a name="downloadDocumentPdf"></a>
# **downloadDocumentPdf**
> downloadDocumentPdf(documentId, theme, locale, format)

Print Document



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
String theme = "theme_example"; // String | Theme
String locale = "locale_example"; // String | Locale
String format = "pdf"; // String | format
try {
    apiInstance.downloadDocumentPdf(documentId, theme, locale, format);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#downloadDocumentPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | **String**| Document Id |
 **theme** | **String**| Theme | [optional]
 **locale** | **String**| Locale | [optional]
 **format** | **String**| format | [optional] [default to pdf] [enum: pdf, html]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="downloadDocumentXml"></a>
# **downloadDocumentXml**
> downloadDocumentXml(documentId)

Download Document



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DocumentsApi;


DocumentsApi apiInstance = new DocumentsApi();
String documentId = "documentId_example"; // String | Document Id
try {
    apiInstance.downloadDocumentXml(documentId);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentsApi#downloadDocumentXml");
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

<a name="importDocument"></a>
# **importDocument**
> importDocument(body)

Import Document



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

