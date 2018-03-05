package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GenericDataRepresentationListSpaceData;
import io.swagger.client.model.SpaceRepresentation;
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
    
}
