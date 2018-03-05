package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.UserRepresentation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileApi
 */
@Ignore
public class ProfileApiTest {

    private final ProfileApi api = new ProfileApi();

    
    /**
     * Update User Profile
     *
     * [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void currentUserTest() throws ApiException {
        UserRepresentation body = null;
        UserRepresentation response = api.currentUser(body);

        // TODO: test validations
    }
    
    /**
     * Return User Profile
     *
     * [user] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
        UserRepresentation response = api.getCurrentUser();

        // TODO: test validations
    }
    
}
