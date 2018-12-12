package com.api.apiyblas.domain.user;

//import static com.api.apiyblas.domain.user.specs.UserSpecs.internalIdIs;
import static com.api.apiyblas.domain.user.specs.UserSpecs.usernameIs;

import com.api.apiyblas.domain.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;

/**
 * Created by iballart on 21/11/18.
 */
public class UserEnhancedRepositoryImpl implements UserEnhancedRepository {

    private MongoOperations mongoOperations;

    @Autowired
    public UserEnhancedRepositoryImpl(MongoOperations mongoOperations) {
        super();
        this.mongoOperations = mongoOperations;
    }

    @Override
    public User findByInternalId(String internalId) {
        //Query query = new Query(internalIdIs(internalId));
        //return mongoOperations.findOne(query, User.class);
        return null;
    }

    @Override
    public User findByUsername(String username) {
        Query query = new Query(usernameIs(username));
        return mongoOperations.findOne(query, User.class);
    }
}
