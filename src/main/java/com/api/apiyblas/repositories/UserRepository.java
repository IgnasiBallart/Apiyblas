package com.api.apiyblas.repositories;

import com.api.apiyblas.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by iballart on 21/11/18.
 */
public interface UserRepository extends
        MongoRepository<User, String>,
        UserEnhancedRepository {
}
