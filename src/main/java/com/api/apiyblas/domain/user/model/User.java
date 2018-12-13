package com.api.apiyblas.domain.user.model;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.hateoas.ResourceSupport;

import java.time.ZonedDateTime;

/**
 * Created by iballart on 21/11/18.
 */

@Document(collection = "users")
@TypeAlias("users")
public class User extends ResourceSupport {

    private static final String TO_STRING_PATTERN = "%s [Username: %s, Password: %s]";

    public static final String COLLECTION = "users";
    public static final String FIELD_USERNAME = "username";
    public static final String FIELD_PASSWORD = "password";
    public static final String LAST_CONNECTION = "last_connection";
    private static final long serialVersionUID = 1L;

    @Field(FIELD_USERNAME)
    private String username;

    @Field(FIELD_PASSWORD)
    private String password;

    @Field(LAST_CONNECTION)
    private ZonedDateTime lastConnection;

    public User(String username, String password, ZonedDateTime lastConnection) {
        this.username = username;
        this.password = password;
        this.lastConnection = lastConnection;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ZonedDateTime getLastConnection() {
        return lastConnection;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_PATTERN, this.getClass().getSimpleName(), getUsername(), getPassword());
    }
}
