package com.socgen.itec.bank.account.kata.service;

import com.socgen.itec.bank.account.kata.constants.OperationsData;
import com.socgen.itec.bank.account.kata.constants.UserData;
import com.socgen.itec.bank.account.kata.model.Operation;
import com.socgen.itec.bank.account.kata.model.UserBalance;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountManagementImpl implements AccountManagementService{

    public static final UserBalance userBalance = UserData.getUser();
    public static final List<Operation> operationList = OperationsData.getOperations();

    public AccountManagementImpl(){

    }

    @Override
    public List<Operation> getAllOperations(){

        if(operationList.isEmpty())
            return new ArrayList<>();
        return operationList;
    }

    @Override
    public void saveMoney(String userId, String amount){

        BigDecimal solde;

        Operation operation =new Operation();
        operation.setOperation("Depot");
        operation.setDate(LocalDate.now().toString());
        operation.setAmount(amount);

        solde = userBalance.getBalance().add(new BigDecimal(amount));
        userBalance.setBalance(solde);
        operation.setBalance(solde.toString());

        operationList.add(operation);
    }
}
