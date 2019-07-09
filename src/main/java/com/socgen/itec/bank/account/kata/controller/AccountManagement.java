package com.socgen.itec.bank.account.kata.controller;

import com.socgen.itec.bank.account.kata.model.Operations;
import com.socgen.itec.bank.account.kata.service.AccountService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static com.socgen.itec.bank.account.kata.constants.PathConstants.REST_API_OPERATIONS_PATH;

/**
 * All endpoints expected for user account management
 */
@Path("/")
@Component
public class AccountManagement {
    private static final String APPLICATION_JSON = MediaType.APPLICATION_JSON;

    private final AccountService accountService;

    public AccountManagement(AccountService accountService){
        this.accountService = accountService;

    }

    @GET
    @Produces(APPLICATION_JSON)
    public Response sendWelcome(){
        return Response.ok("Welcome to Bank account kata").build();
    }

    @GET
    @Path(REST_API_OPERATIONS_PATH)
    @Produces(APPLICATION_JSON)
    public Response getAllOperationsForUser(@PathParam("idUser") String idUser){

        Operations operations = accountService.getOperations(idUser);
        if(operations.getOperations() == null){
            return Response.serverError().build();
        }
        return Response.ok(operations).build();
    }
}
