package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GenericDataRepresentationListSpaceData;
import io.swagger.client.model.GenericDataRepresentationListUserData;
import io.swagger.client.model.SpaceRepresentation;
import io.swagger.client.model.TypedGenericDataRepresentationListUserData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NamespacesApi
 */
@Ignore
public class NamespacesApiTest {

    private final NamespacesApi api = new NamespacesApi();

    
    /**
     * Add Space SpaceCollaborators
     *
     * Accessed just by the owner, the owner is identified by current token. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSpaceCollaboratorsTest() throws ApiException {
        String spaceId = null;
        TypedGenericDataRepresentationListUserData body = null;
        api.addSpaceCollaborators(spaceId, body);

        // TODO: test validations
    }
    
    /**
     * Delete space
     *
     * Accessed just by the owner, the owner is identified by current token. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserSpaceTest() throws ApiException {
        String spaceId = null;
        api.deleteUserSpace(spaceId);

        // TODO: test validations
    }
    
    /**
     * Get Space SpaceCollaborators
     *
     * Accessed just by the owner, the owner is identified by current token. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpaceCollaboratorsTest() throws ApiException {
        String spaceId = null;
        Integer offset = null;
        Integer limit = null;
        GenericDataRepresentationListUserData response = api.getSpaceCollaborators(spaceId, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Get Space
     *
     * This will get a space, just the owner will be allowed. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSpaceTest() throws ApiException {
        String spaceId = null;
        SpaceRepresentation response = api.getUserSpace(spaceId);

        // TODO: test validations
    }
    
    /**
     * Get Spaces of user
     *
     * This will search owned and collaborated spaces. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserSpacesTest() throws ApiException {
        String role = null;
        GenericDataRepresentationListSpaceData response = api.getUserSpaces(role);

        // TODO: test validations
    }
    
    /**
     * Remove Space SpaceCollaborators
     *
     * Accessed just by the owner, the owner is identified by current token. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSpaceCollaboratorsTest() throws ApiException {
        String spaceId = null;
        String userId = null;
        api.removeSpaceCollaborators(spaceId, userId);

        // TODO: test validations
    }
    
    /**
     * Update space
     *
     * Accessed just by the owner, the owner is identified by current token. [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserSpaceTest() throws ApiException {
        String spaceId = null;
        SpaceRepresentation body = null;
        SpaceRepresentation response = api.updateUserSpace(spaceId, body);

        // TODO: test validations
    }
    
}
