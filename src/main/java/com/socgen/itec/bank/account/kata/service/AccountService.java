package com.socgen.itec.bank.account.kata.service;

import com.socgen.itec.bank.account.kata.model.Operations;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountManagementService accountManagementService;
    public static Operations operations = new Operations();

    public AccountService(AccountManagementService accountManagementService){
        this.accountManagementService = accountManagementService;

    }
    public Operations getOperations(String userId){


        return operations;
    }

}
