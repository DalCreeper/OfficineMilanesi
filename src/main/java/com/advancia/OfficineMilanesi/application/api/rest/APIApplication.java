package com.advancia.OfficineMilanesi.application.api.rest;

import com.advancia.OfficineMilanesi.application.api.filters.CorsFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class APIApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(ClienteRestController.class);
        set.add(FatturaRestController.class);
        set.add(FilialeRestController.class);
        set.add(ProceduresRestController.class);
        set.add(CorsFilter.class);
        return set;
    }
}