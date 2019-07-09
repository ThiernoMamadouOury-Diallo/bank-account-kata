package com.socgen.itec.bank.account.kata.unit.service;

import com.socgen.itec.bank.account.kata.constants.OperationsData;
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

        List<Operation> operationList = OperationsData.getOperations();
        if(operationList.isEmpty())
            return new ArrayList<>();
        return operationList;
    }
}
