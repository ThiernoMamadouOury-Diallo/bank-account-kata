package com.socgen.itec.bank.account.kata;

import com.socgen.itec.bank.account.kata.model.Operation;
import com.socgen.itec.bank.account.kata.model.Operations;
import com.socgen.itec.bank.account.kata.service.AccountManagementService;
import com.socgen.itec.bank.account.kata.service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.ArrayList;
import java.util.List;

import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AccountService.class)
public class AccountServiceTest {

    private AccountService accountService;
    private AccountManagementService accountManagementService;
    @Before
    public void setUp(){
        accountManagementService = PowerMockito.mock(AccountManagementService.class);
        accountService = new AccountService(accountManagementService);
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
        when(accountManagementService.getAllOperations()).thenReturn(operationList);

        Operations actualOPerations = accountService.getOperations("User1");


        //Then
        assert actualOPerations.getOperations().equals(expectedOperations.getOperations());
        assert actualOPerations.toString().equals(expectedOperations.toString());


    }
}
