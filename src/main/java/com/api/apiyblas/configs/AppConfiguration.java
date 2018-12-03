package com.api.apiyblas.configs;

/**
 * Created by iballart on 22/11/18.
 */
public class AppConfiguration {

    private String mongoDBName;

    protected AppConfiguration(String mongoDBName){
        this.mongoDBName = mongoDBName;
    }

    public String getMongoDBName() {
        return mongoDBName;
    }
}
