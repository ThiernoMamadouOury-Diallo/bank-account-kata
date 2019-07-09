package com.socgen.itec.bank.account.kata.constants;

import com.socgen.itec.bank.account.kata.model.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum OperationsData {
    OPERATIONS_DATA1("Retrait1", "09/08/2019", "20", "50"),
    OPERATIONS_DATA2("Depot2","10/08/2019", "20", "70"),
    OPERATIONS_DATA3("Virement3", "11/08/2019", "20", "50");

    private final String operation;
    private final String date;
    private final String amount;
    private final String balance;

    public String getOperation() {
        return operation;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public String getBalance() {
        return balance;
    }

    OperationsData(final String operation, final String date, final String amount, final String balance){
        this.operation = operation;
        this.date = date;
        this.amount = amount;
        this.balance = balance;

    }
    public static List<Operation> getOperations(){
        List<Operation> operationList = new ArrayList<>();
        Arrays.asList(OperationsData.values()).forEach(e->operationList.add(initOperation(e.operation, e.date, e.amount, e.balance)));

        return operationList;
    }
    public static Operation initOperation(String oper, String date, String amount, String balance){
        Operation operation = new Operation();
        operation.setOperation(oper);
        operation.setDate(date);
        operation.setAmount(amount);
        operation.setBalance(balance);
        return operation;

    }

}
