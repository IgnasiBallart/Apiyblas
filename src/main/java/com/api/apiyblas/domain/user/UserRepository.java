package com.api.apiyblas.domain.user;

import com.api.apiyblas.domain.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by iballart on 21/11/18.
 */
public interface UserRepository extends
        MongoRepository<User, String>,
        UserEnhancedRepository {
}
