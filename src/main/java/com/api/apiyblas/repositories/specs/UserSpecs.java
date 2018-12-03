package com.api.apiyblas.repositories.specs;

import com.api.apiyblas.model.User;
import org.springframework.data.mongodb.core.query.Criteria;

/**
 * Created by iballart on 21/11/18.
 */
public class UserSpecs {

    public UserSpecs() {
    }
/*
    public static Criteria internalIdIs(String internalId) {
        return Criteria.where(User.FIELD_INTERNAL_ID).is(internalId);
    }
*/
    public static Criteria usernameIs(String username) {
        return Criteria.where(User.FIELD_USERNAME).is(username);
    }
}
