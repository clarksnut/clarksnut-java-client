# ProfileApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currentUser**](ProfileApi.md#currentUser) | **PUT** /api/profile | Update User Profile
[**getCurrentUser**](ProfileApi.md#getCurrentUser) | **GET** /api/profile | Return User Profile


<a name="currentUser"></a>
# **currentUser**
> UserRepresentation currentUser(body)

Update User Profile

This will update the profile associated to the current token. [user] role required

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
UserRepresentation body = new UserRepresentation(); // UserRepresentation | 
try {
    UserRepresentation result = apiInstance.currentUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#currentUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserRepresentation**](UserRepresentation.md)|  | [optional]

### Return type

[**UserRepresentation**](UserRepresentation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentUser"></a>
# **getCurrentUser**
> UserRepresentation getCurrentUser()

Return User Profile

This will return the profile associated to the current token. [user] role required

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

