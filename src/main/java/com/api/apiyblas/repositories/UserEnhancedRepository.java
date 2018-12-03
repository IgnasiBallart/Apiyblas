package com.api.apiyblas.repositories;

import com.api.apiyblas.model.User;

/**
 * Created by iballart on 21/11/18.
 */
public interface UserEnhancedRepository {

    User findByInternalId(String internalId);

    User findByUsername(String username);
}
