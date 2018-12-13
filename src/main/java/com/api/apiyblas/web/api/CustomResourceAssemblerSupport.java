package com.api.apiyblas.web.api;

import org.springframework.data.mongodb.core.mapping.Language;
import org.springframework.hateoas.*;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import java.util.*;

/**
 * Created by iballart on 12/12/18.
 */
public abstract class CustomResourceAssemblerSupport <T, D extends ResourceSupport, C>
        extends ResourceAssemblerSupport<T, D> {

    private final static String PAGE_REQUEST_PARAMETERS_TEMPLATE = "page={page}&size={size}&sort={sort}";
    private final EntityLinks entityLinks;
    private final RelProvider relProvider;
    private final Class<C> controllerClass;

    public CustomResourceAssemblerSupport(final EntityLinks entityLinks, final RelProvider relProvider,
                                          Class<C> controllerClass, Class<D> resourceType) {
        super(controllerClass, resourceType);
        this.entityLinks = entityLinks;
        this.relProvider = relProvider;
        this.controllerClass = controllerClass;
    }

    public Class<C> getControllerClass() {
        return controllerClass;
    }

    public EntityLinks getEntityLinks() {
        return entityLinks;
    }

    public RelProvider getRelProvider() {
        return relProvider;
    }

    /*To resources with default language or no language at all*/
    public Resource<D> toHALResource(T entity) {
        return new Resource<>(toResource(entity));
    }

    public Resources<D> toHALResources(Iterable<T> entities) {
        Collection<D> entityResources = toResources(entities);
        return new Resources<>(entityResources);
    }

	/*To resources with language*/

    public abstract D toResource(T entity, Language language);


}
