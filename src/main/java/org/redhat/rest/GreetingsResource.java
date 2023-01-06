package org.redhat.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GreetingsResource {

    @Inject
    GreetingsService service;

    @GET
    @Path("/greetings")
    public String greet(){
        return service.greet();
    }

    @GET
    @Path("/greetings/{name}")
    public String greetName(@PathParam("name") String name){
        return service.greeting(name);
    }
}
