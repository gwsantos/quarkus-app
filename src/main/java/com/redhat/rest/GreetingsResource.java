package com.redhat.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

@Path("/hello")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class GreetingsResource {

    @GET
    @Path("/greetings")
    public String greet(){
        return "Hello from the application!";
    }

    @GET
    @Path("/greetings/{name}")
    public String greetName(@PathParam("name") String name){
        return "Hi " + name + "! Welcome to the application!";
    }
}
