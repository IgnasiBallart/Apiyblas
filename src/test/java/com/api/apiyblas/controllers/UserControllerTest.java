package com.api.apiyblas.controllers;

import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import java.util.Optional;

/**
 * Created by iballart on 28/11/18.
 */
public class UserControllerTest {

    private static final String PATH = "/users";

    @Test
    public void ok200getUsers() throws Exception {

       // MockHttpServletRequestBuilder request = defaulRequest(HttpMethod.GET, PATH.concat("/"), Optional.empty());
    }
}
