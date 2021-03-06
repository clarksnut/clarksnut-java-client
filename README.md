# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DocumentsApi;

import java.io.File;
import java.util.*;

public class DocumentsApiExample {

    public static void main(String[] args) {
        
        DocumentsApi apiInstance = new DocumentsApi();
        String documentId = "documentId_example"; // String | Document Id
        try {
            DocumentRepresentation result = apiInstance.getDocument(documentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DocumentsApi#getDocument");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocumentsApi* | [**getDocument**](docs/DocumentsApi.md#getDocument) | **GET** /api/documents/{documentId} | Get Document
*DocumentsApi* | [**getDocuments**](docs/DocumentsApi.md#getDocuments) | **GET** /api/documents | Get Documents
*DocumentsApi* | [**getXml**](docs/DocumentsApi.md#getXml) | **GET** /api/documents/{documentId}/download | Download Document
*DocumentsApi* | [**importDocument**](docs/DocumentsApi.md#importDocument) | **POST** /api/documents | Import Document
*DocumentsApi* | [**printDocument**](docs/DocumentsApi.md#printDocument) | **GET** /api/documents/{documentId}/print | Print Document
*DocumentsApi* | [**searchDocuments**](docs/DocumentsApi.md#searchDocuments) | **POST** /api/documents/search | Search Document
*DocumentsApi* | [**updateDocument**](docs/DocumentsApi.md#updateDocument) | **PUT** /api/documents/{documentId} | Update Document
*PartiesApi* | [**getParties**](docs/PartiesApi.md#getParties) | **GET** /api/parties | Get parties
*ProfileApi* | [**currentUser**](docs/ProfileApi.md#currentUser) | **PUT** /api/profile | Update User Profile
*ProfileApi* | [**getCurrentUser**](docs/ProfileApi.md#getCurrentUser) | **GET** /api/profile | Return User Profile
*ProfileSpacesApi* | [**addSpaceCollaborators**](docs/ProfileSpacesApi.md#addSpaceCollaborators) | **POST** /api/profile/spaces/{spaceId}/collaborators | Add Space SpaceCollaborators
*ProfileSpacesApi* | [**deleteUserSpace**](docs/ProfileSpacesApi.md#deleteUserSpace) | **DELETE** /api/profile/spaces/{spaceId} | Delete space
*ProfileSpacesApi* | [**getSpaceCollaborators**](docs/ProfileSpacesApi.md#getSpaceCollaborators) | **GET** /api/profile/spaces/{spaceId}/collaborators | Get Space SpaceCollaborators
*ProfileSpacesApi* | [**getUserSpace**](docs/ProfileSpacesApi.md#getUserSpace) | **GET** /api/profile/spaces/{spaceId} | Get Space
*ProfileSpacesApi* | [**getUserSpaces**](docs/ProfileSpacesApi.md#getUserSpaces) | **GET** /api/profile/spaces | Get Spaces of user
*ProfileSpacesApi* | [**removeSpaceCollaborators**](docs/ProfileSpacesApi.md#removeSpaceCollaborators) | **DELETE** /api/profile/spaces/{spaceId}/collaborators/{userId} | Remove Space SpaceCollaborators
*ProfileSpacesApi* | [**updateUserSpace**](docs/ProfileSpacesApi.md#updateUserSpace) | **PUT** /api/profile/spaces/{spaceId} | Update space
*SpaceRequestAccessApi* | [**getRequestAccess**](docs/SpaceRequestAccessApi.md#getRequestAccess) | **GET** /request-access | 
*SpaceRequestAccessApi* | [**requestAccessToSpace**](docs/SpaceRequestAccessApi.md#requestAccessToSpace) | **POST** /request-access | 
*SpaceRequestAccessApi* | [**updateAccessSpace**](docs/SpaceRequestAccessApi.md#updateAccessSpace) | **PUT** /request-access/{requestId} | 
*SpacesApi* | [**createSpace**](docs/SpacesApi.md#createSpace) | **POST** /api/spaces | Create Space
*SpacesApi* | [**getSpace**](docs/SpacesApi.md#getSpace) | **GET** /api/spaces/{spaceId} | Get Space
*SpacesApi* | [**getSpaces**](docs/SpacesApi.md#getSpaces) | **GET** /api/spaces | Get Spaces
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /api/users/{userId} | Get User
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /api/users | Get Users


## Documentation for Models

 - [DocumentAttributes](docs/DocumentAttributes.md)
 - [DocumentData](docs/DocumentData.md)
 - [DocumentLink](docs/DocumentLink.md)
 - [DocumentQueryAttributes](docs/DocumentQueryAttributes.md)
 - [DocumentQueryData](docs/DocumentQueryData.md)
 - [DocumentQueryRepresentation](docs/DocumentQueryRepresentation.md)
 - [DocumentRelationships](docs/DocumentRelationships.md)
 - [DocumentRepresentation](docs/DocumentRepresentation.md)
 - [GenericDataRepresentation](docs/GenericDataRepresentation.md)
 - [GenericDataRepresentationListDocumentData](docs/GenericDataRepresentationListDocumentData.md)
 - [GenericDataRepresentationListPartyData](docs/GenericDataRepresentationListPartyData.md)
 - [GenericDataRepresentationListRequestData](docs/GenericDataRepresentationListRequestData.md)
 - [GenericDataRepresentationListSpaceData](docs/GenericDataRepresentationListSpaceData.md)
 - [GenericDataRepresentationListUserData](docs/GenericDataRepresentationListUserData.md)
 - [GenericLinksRepresentation](docs/GenericLinksRepresentation.md)
 - [InputPart](docs/InputPart.md)
 - [MediaType](docs/MediaType.md)
 - [MultipartFormDataInput](docs/MultipartFormDataInput.md)
 - [OwnedBy](docs/OwnedBy.md)
 - [PartyAttributes](docs/PartyAttributes.md)
 - [PartyData](docs/PartyData.md)
 - [RequestAttributes](docs/RequestAttributes.md)
 - [RequestData](docs/RequestData.md)
 - [RequestRepresentation](docs/RequestRepresentation.md)
 - [SpaceAttributes](docs/SpaceAttributes.md)
 - [SpaceCollaborators](docs/SpaceCollaborators.md)
 - [SpaceData](docs/SpaceData.md)
 - [SpaceOwnedBy](docs/SpaceOwnedBy.md)
 - [SpaceRelationships](docs/SpaceRelationships.md)
 - [SpaceRepresentation](docs/SpaceRepresentation.md)
 - [TypedGenericDataRepresentation](docs/TypedGenericDataRepresentation.md)
 - [TypedGenericDataRepresentationListUserData](docs/TypedGenericDataRepresentationListUserData.md)
 - [UserAttributesRepresentation](docs/UserAttributesRepresentation.md)
 - [UserData](docs/UserData.md)
 - [UserRepresentation](docs/UserRepresentation.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



