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
 * API tests for RequestAccessApi
 */
@Ignore
public class RequestAccessApiTest {

    private final RequestAccessApi api = new RequestAccessApi();

    
    /**
     * Get Request accesses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRequestAccessTest() throws ApiException {
        List<String> space = null;
        String status = null;
        GenericDataRepresentationListRequestData response = api.getRequestAccess(space, status);

        // TODO: test validations
    }
    
    /**
     * Request access
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
     * Update request
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
