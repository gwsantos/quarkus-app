package org.redhat.rest;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingsService {
    
    public String greeting(String name){
        return "Hello " + name + "! Welcome to the application!";
    }

    public String greet(){
        return "Hello from the application!";
    }
}
