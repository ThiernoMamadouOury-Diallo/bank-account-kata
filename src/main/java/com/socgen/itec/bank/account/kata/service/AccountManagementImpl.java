package com.socgen.itec.bank.account.kata.service;

import com.socgen.itec.bank.account.kata.model.Operation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountManagementImpl implements AccountManagementService{

    public AccountManagementImpl(){

    }

    @Override
    public List<Operation> getAllOperations(){


        return new ArrayList<>();
    }
}
