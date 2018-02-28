package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.GenericDataRepresentationListUserData;
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
     * Get User
     *
     * This will return the requested user. [view-users] role required
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
     * Get Users
     *
     * This will search users. [view-users] role required
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String username = null;
        GenericDataRepresentationListUserData response = api.getUsers(username);

        // TODO: test validations
    }
    
}
