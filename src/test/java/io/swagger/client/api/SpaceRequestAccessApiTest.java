package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GenericDataRepresentationListRequestData;
import io.swagger.client.model.RequestRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpaceRequestAccessApi
 */
@Ignore
public class SpaceRequestAccessApiTest {

    private final SpaceRequestAccessApi api = new SpaceRequestAccessApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRequestAccessTest() throws ApiException {
        GenericDataRepresentationListRequestData response = api.getRequestAccess();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestAccessToSpaceTest() throws ApiException {
        RequestRepresentation body = null;
        api.requestAccessToSpace(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccessSpaceTest() throws ApiException {
        String requestId = null;
        RequestRepresentation body = null;
        api.updateAccessSpace(requestId, body);

        // TODO: test validations
    }
    
}
