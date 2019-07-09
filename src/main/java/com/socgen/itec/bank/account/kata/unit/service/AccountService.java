package com.socgen.itec.bank.account.kata.unit.service;

import com.socgen.itec.bank.account.kata.model.Operation;
import com.socgen.itec.bank.account.kata.model.Operations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private AccountManagementService accountManagementService;
    public static Operations operations = new Operations();

    public AccountService(AccountManagementService accountManagementService){
        this.accountManagementService = accountManagementService;

    }
    public Operations getOperations(String userId){

        List<Operation> operationList = accountManagementService.getAllOperations();
        Operations operations = new Operations();
        operations.setOperations(operationList);
        operations.setUserId(userId);

        return operations;
    }

}
