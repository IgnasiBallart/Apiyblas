package com.api.apiyblas.model;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by iballart on 21/11/18.
 */

@Document(collection = "users")
@TypeAlias("users")
public class User {

    private static final String TO_STRING_PATTERN = "%s [Internal_id: %s, Username: %s]";

    public static final String COLLECTION = "users";
    public static final String FIELD_USERNAME = "username";
    public static final String FIELD_PASSWORD = "password";
    private static final long serialVersionUID = 1L;

    @Field(FIELD_USERNAME)
    private String username;

    @Field(FIELD_PASSWORD)
    private String password;

    @PersistenceConstructor
    public User( String username, String password) {
        //super(id, internalId);
        this.username = username;
        this.password = password;
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

    @Override
    public String toString() {
        return String.format(TO_STRING_PATTERN, this.getClass().getSimpleName(),  getUsername());
    }
}
