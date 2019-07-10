package com.socgen.itec.bank.account.kata.service;

import com.socgen.itec.bank.account.kata.model.Operation;

import java.util.List;

public interface AccountManagementService {
    List<Operation> getAllOperations();
    void saveMoney(String userId, String amount);
    void withdrawMoney(String amount);

}
