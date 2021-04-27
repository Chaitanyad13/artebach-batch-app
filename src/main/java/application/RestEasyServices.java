package main.java.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import main.java.controller.ReportProcessController;

@ApplicationPath("/rest")
public class RestEasyServices extends Application {
 
    private Set<Object> singletons = new HashSet<Object>();
 
    public RestEasyServices() {
        singletons.add(new ReportProcessController());
    }
 
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}