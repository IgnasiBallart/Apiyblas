package com.api.apiyblas.web.api;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.core.EmbeddedWrapper;

import java.time.ZonedDateTime;

/**
 * Created by iballart on 12/12/18.
 */
public class ResourceWithEmbeddeds extends ResourceSupport {

    private Resources<EmbeddedWrapper> embeddeds;

    public Resources<EmbeddedWrapper> getEmbeddeds() {
        return embeddeds;
    }

    public void setEmbeddeds(Resources<EmbeddedWrapper> embeddeds) {
        this.embeddeds = embeddeds;
    }

    public ZonedDateTimeResource toResource(ZonedDateTime dateTime) {
        if(dateTime == null) {
            return null;
        }
        return new ZonedDateTimeResource(dateTime);
    }

}
