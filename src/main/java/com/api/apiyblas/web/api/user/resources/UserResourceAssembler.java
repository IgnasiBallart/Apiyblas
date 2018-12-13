package com.api.apiyblas.web.api.user.resources;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;


import com.api.apiyblas.domain.user.model.User;
import com.api.apiyblas.web.api.CustomResourceAssemblerSupport;
import com.api.apiyblas.web.api.user.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Language;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RelProvider;
import org.springframework.stereotype.Service;

@Service
public class UserResourceAssembler
        extends CustomResourceAssemblerSupport<User, UserResource, UserController> {

    @Autowired
    public UserResourceAssembler(final EntityLinks entityLinks, final RelProvider relProvider) {
        super(entityLinks, relProvider, UserController.class, UserResource.class);
    }

    @Override
    public UserResource toResource(User entity) {
        return new UserResource(entity);
    }

    @Override
    public UserResource toResource(User entity, Language language) {
        return toResource(entity);
    }

    public Link linkToMe() {
        return linkTo(getControllerClass()).slash("me").withRel("me");
    }

}
