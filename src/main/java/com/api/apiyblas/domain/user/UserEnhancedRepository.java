package com.api.apiyblas.domain.user;

import com.api.apiyblas.domain.user.model.User;

/**
 * Created by iballart on 21/11/18.
 */
public interface UserEnhancedRepository {

    User findByInternalId(String internalId);

    User findByUsername(String username);
}
