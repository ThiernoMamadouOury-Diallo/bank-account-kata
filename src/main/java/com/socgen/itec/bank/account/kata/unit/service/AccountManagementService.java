package com.socgen.itec.bank.account.kata.unit.service;

import com.socgen.itec.bank.account.kata.model.Operation;

import java.util.List;

public interface AccountManagementService {
    List<Operation> getAllOperations();

}
