package com.socgen.itec.bank.account.kata.unit.controller;

import com.socgen.itec.bank.account.kata.model.Operation;
import com.socgen.itec.bank.account.kata.model.Operations;
import com.socgen.itec.bank.account.kata.unit.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AccountManagement.class)
@PowerMockIgnore({"javax.crypto.*"})
public class AccountManagementTest {

    private AccountManagement accountManagement;
    private AccountService accountService;
    @Before
    public void setUp(){
        accountService = PowerMockito.mock(AccountService.class);
        accountManagement = new AccountManagement(accountService);
    }


    @Test
    public void getAllOperations(){
        //Given
        Operations expectedOperations = new Operations();

        List<Operation> operationList = new ArrayList<>();

        Operation operation = new Operation();
        operation.setOperation("Retrait");
        operation.setDate("08/08/2019");
        operation.setAmount("20");
        operation.setBalance("50");
        operationList.add(operation);

        expectedOperations.setUserId("User1");
        expectedOperations.setOperations(operationList);
        //When
        when(accountService.getOperations(any())).thenReturn(expectedOperations);

        Response response = accountManagement.getAllOperationsForUser("User1");
        Operations actualOperations = (Operations) response.getEntity();


        //Then
        assert actualOperations.getOperations().equals(expectedOperations.getOperations());
        assert actualOperations.toString().equals(expectedOperations.toString());


    }
}