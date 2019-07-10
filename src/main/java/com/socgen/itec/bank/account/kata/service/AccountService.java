package com.socgen.itec.bank.account.kata.service;

import com.socgen.itec.bank.account.kata.model.Operation;
import com.socgen.itec.bank.account.kata.model.Operations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.List;

@Service
public class AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

    private AccountManagementService accountManagementService;

    public AccountService(AccountManagementService accountManagementService){
        this.accountManagementService = accountManagementService;

    }
    public Operations getOperations(String userId){

        Operations operations = new Operations();
        List<Operation> operationList = accountManagementService.getAllOperations();
        operations.setOperations(operationList);
        operations.setUserId(userId);

        return operations;
    }

    public Response saveMoney(String userId,String amount){
        try {
            accountManagementService.saveMoney(userId, amount);
            LOGGER.info("Success");
            return Response.ok().build();
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("Error");
            return Response.serverError().build();
        }

    }

}
