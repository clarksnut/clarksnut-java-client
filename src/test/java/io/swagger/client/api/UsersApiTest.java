package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DocumentQueryRepresentation;
import io.swagger.client.model.DocumentRepresentation;
import io.swagger.client.model.GenericDataRepresentationListDocumentData;
import io.swagger.client.model.GenericDataRepresentationListPartyData;
import io.swagger.client.model.GenericDataRepresentationListRequestData;
import io.swagger.client.model.GenericDataRepresentationListSpaceData;
import io.swagger.client.model.GenericDataRepresentationListUserData;
import io.swagger.client.model.NotificationsRepresentation;
import io.swagger.client.model.SpaceRepresentation;
import io.swagger.client.model.TypedGenericDataRepresentationListUserData;
import io.swagger.client.model.UserRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Add new Collaborator
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSpaceCollaboratorsTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        TypedGenericDataRepresentationListUserData body = null;
        api.addSpaceCollaborators(userId, spaceId, body);

        // TODO: test validations
    }
    
    /**
     * Delete space
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserSpaceTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        api.deleteUserSpace(userId, spaceId);

        // TODO: test validations
    }
    
    /**
     * Print Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadPdfTest() throws ApiException {
        String userId = null;
        String documentId = null;
        String theme = null;
        String format = null;
        api.downloadPdf(userId, documentId, theme, format);

        // TODO: test validations
    }
    
    /**
     * Download Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadUserDocumentXmlTest() throws ApiException {
        String userId = null;
        String documentId = null;
        api.downloadUserDocumentXml(userId, documentId);

        // TODO: test validations
    }
    
    /**
     * Get Notifications
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationsTest() throws ApiException {
        String userId = null;
        List<String> space = null;
        String status = null;
        NotificationsRepresentation response = api.getNotifications(userId, space, status);

        // TODO: test validations
    }
    
    /**
     * Get parties
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPartiesTest() throws ApiException {
        String userId = null;
        String filterText = null;
        Integer offset = null;
        Integer limit = null;
        List<String> space = null;
        GenericDataRepresentationListPartyData response = api.getParties(userId, filterText, offset, limit, space);

        // TODO: test validations
    }
    
    /**
     * Return One User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        String userId = null;
        UserRepresentation response = api.getUser(userId);

        // TODO: test validations
    }
    
    /**
     * Return one Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDocumentTest() throws ApiException {
        String userId = null;
        String documentId = null;
        DocumentRepresentation response = api.getUserDocument(userId, documentId);

        // TODO: test validations
    }
    
    /**
     * Return List of Documents
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserDocumentsTest() throws ApiException {
        String userId = null;
        String filterText = null;
        Integer offset = null;
        Integer limit = null;
        List<String> space = null;
        GenericDataRepresentationListDocumentData response = api.getUserDocuments(userId, filterText, offset, limit, space);

        // TODO: test validations
    }
    
    /**
     * Return one Space
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSpaceTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        SpaceRepresentation response = api.getUserSpace(userId, spaceId);

        // TODO: test validations
    }
    
    /**
     * Return list of Collaborators
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSpaceCollaboratorsTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        Integer offset = null;
        Integer limit = null;
        GenericDataRepresentationListUserData response = api.getUserSpaceCollaborators(userId, spaceId, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Get Notifications
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSpaceRequestAccessTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        String status = null;
        GenericDataRepresentationListRequestData response = api.getUserSpaceRequestAccess(userId, spaceId, status);

        // TODO: test validations
    }
    
    /**
     * Return allowed Spaces of User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSpacesTest() throws ApiException {
        String userId = null;
        String role = null;
        Integer offset = null;
        Integer limit = null;
        GenericDataRepresentationListSpaceData response = api.getUserSpaces(userId, role, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Return List of Users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String username = null;
        String filterText = null;
        Integer offset = null;
        Integer limit = null;
        GenericDataRepresentationListUserData response = api.getUsers(username, filterText, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Remove Collaborator
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSpaceCollaboratorsTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        String collaboratorId = null;
        api.removeSpaceCollaborators(userId, spaceId, collaboratorId);

        // TODO: test validations
    }
    
    /**
     * Search Document
     *
     * Search on allowed user (session) spaces
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchUserDocumentsTest() throws ApiException {
        String userId = null;
        DocumentQueryRepresentation body = null;
        GenericDataRepresentationListDocumentData response = api.searchUserDocuments(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update User
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String userId = null;
        UserRepresentation body = null;
        UserRepresentation response = api.updateUser(userId, body);

        // TODO: test validations
    }
    
    /**
     * Update a Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserDocumentTest() throws ApiException {
        String userId = null;
        String documentId = null;
        DocumentRepresentation body = null;
        DocumentRepresentation response = api.updateUserDocument(userId, documentId, body);

        // TODO: test validations
    }
    
    /**
     * Update space
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserSpaceTest() throws ApiException {
        String userId = null;
        String spaceId = null;
        SpaceRepresentation body = null;
        SpaceRepresentation response = api.updateUserSpace(userId, spaceId, body);

        // TODO: test validations
    }
    
}
