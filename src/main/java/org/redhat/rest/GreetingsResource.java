package org.redhat.rest;

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

    @GET
    public String greet(){
        return "Hello from the application!";
    }

    @GET
    @Path("/{name}")
    public String greetName(@PathParam("name") String name){
        return "Hello " + name + "! Welcome to the application!";
    }
}
