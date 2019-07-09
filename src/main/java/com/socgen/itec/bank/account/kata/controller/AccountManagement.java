package com.socgen.itec.bank.account.kata.controller;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * All endpoints expected for user account management
 */
@Path("/")
@Component
public class AccountManagement {
    private static final String APPLICATION_JSON = MediaType.APPLICATION_JSON;

    private AccountManagement(){

    }

    @GET
    @Produces(APPLICATION_JSON)
    public Response sendWelcome(){
        return Response.ok("Welcome to Bank account kata").build();
    }
}
