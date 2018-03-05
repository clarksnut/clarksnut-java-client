package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GenericDataRepresentationListPartyData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartiesApi
 */
@Ignore
public class PartiesApiTest {

    private final PartiesApi api = new PartiesApi();

    
    /**
     * Get parties
     *
     * This will search parties on allowed spaces and current user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPartiesTest() throws ApiException {
        String filterText = null;
        Integer offset = null;
        Integer limit = null;
        List<String> space = null;
        GenericDataRepresentationListPartyData response = api.getParties(filterText, offset, limit, space);

        // TODO: test validations
    }
    
}
