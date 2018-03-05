package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GenericDataRepresentationListSpaceData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NamedSpacesApi
 */
@Ignore
public class NamedSpacesApiTest {

    private final NamedSpacesApi api = new NamedSpacesApi();

    
    /**
     * Return allowed Spaces of User
     *
     * [view-users] role required
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
    
}
