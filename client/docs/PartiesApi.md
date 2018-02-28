# PartiesApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getParties**](PartiesApi.md#getParties) | **GET** /api/parties | Get parties


<a name="getParties"></a>
# **getParties**
> GenericDataRepresentationListPartyData getParties(q, offset, limit, space)

Get parties

This will search parties on allowed spaces and current user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PartiesApi;


PartiesApi apiInstance = new PartiesApi();
String q = "q_example"; // String | Search text
Integer offset = 0; // Integer | First result
Integer limit = 10; // Integer | Max result
List<String> space = Arrays.asList("space_example"); // List<String> | Spaces Id where to search parties
try {
    GenericDataRepresentationListPartyData result = apiInstance.getParties(q, offset, limit, space);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartiesApi#getParties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Search text | [optional]
 **offset** | **Integer**| First result | [optional] [default to 0]
 **limit** | **Integer**| Max result | [optional] [default to 10]
 **space** | [**List&lt;String&gt;**](String.md)| Spaces Id where to search parties | [optional]

### Return type

[**GenericDataRepresentationListPartyData**](GenericDataRepresentationListPartyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

