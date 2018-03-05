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
 * API tests for SpacesApi
 */
@Ignore
public class SpacesApiTest {

    private final SpacesApi api = new SpacesApi();

    
    /**
     * Add new Collaborator
     *
     * [user] role required
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
     * Create new Space
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSpaceTest() throws ApiException {
        SpaceRepresentation body = null;
        api.createSpace(body);

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
        String spaceId = null;
        api.deleteUserSpace(spaceId);

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
    public void getSpaceTest() throws ApiException {
        String spaceId = null;
        SpaceRepresentation response = api.getSpace(spaceId);

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
    public void getSpaceCollaboratorsTest() throws ApiException {
        String spaceId = null;
        Integer offset = null;
        Integer limit = null;
        GenericDataRepresentationListUserData response = api.getSpaceCollaborators(spaceId, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Return list of Spaces
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSpacesTest() throws ApiException {
        String assignedId = null;
        String filterText = null;
        Integer offset = null;
        Integer limit = null;
        GenericDataRepresentationListSpaceData response = api.getSpaces(assignedId, filterText, offset, limit);

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
        String spaceId = null;
        String userId = null;
        api.removeSpaceCollaborators(spaceId, userId);

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
        String spaceId = null;
        SpaceRepresentation body = null;
        SpaceRepresentation response = api.updateUserSpace(spaceId, body);

        // TODO: test validations
    }
    
}
