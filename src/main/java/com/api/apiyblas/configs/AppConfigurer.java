package com.api.apiyblas.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by iballart on 22/11/18.
 */
@Configuration("appConfigurationFactory")
@Profile({"default"})
public class AppConfigurer {

    private String mongoDBName;

    public AppConfigurer(@Value("${spring.data.mongodb.database}") String mongoDBName){
        this.mongoDBName = mongoDBName;
    }

    @Bean("appConfiguration")
    public AppConfiguration appConfiguration(){
        return new AppConfiguration(mongoDBName);
    }

}
