# ProfileApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](ProfileApi.md#getCurrentUser) | **GET** /api/profile | Return User Profile


<a name="getCurrentUser"></a>
# **getCurrentUser**
> UserRepresentation getCurrentUser()

Return User Profile



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
try {
    UserRepresentation result = apiInstance.getCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

