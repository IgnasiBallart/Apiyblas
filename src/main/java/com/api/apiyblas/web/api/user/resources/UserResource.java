package com.api.apiyblas.web.api.user.resources;

import com.api.apiyblas.domain.user.model.User;
import com.api.apiyblas.web.api.ResourceWithEmbeddeds;
import com.api.apiyblas.web.api.ZonedDateTimeResource;

/**
 * Created by iballart on 12/12/18.
 */
public class UserResource extends ResourceWithEmbeddeds {

    private String userName;
    private ZonedDateTimeResource lastConnection;
    private Object[] roles;

    public UserResource(User user) {
        super();
        userName = user.getUsername();
        lastConnection = toResource(user.getLastConnection());
    }

    public String getUserName() {
        return userName;
    }

    public ZonedDateTimeResource getLastConnection() {
        return lastConnection;
    }

    public Object[] getRoles() {
        return roles;
    }
}
