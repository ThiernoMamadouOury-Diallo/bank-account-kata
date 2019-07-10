package com.socgen.itec.bank.account.kata.constants;

import com.socgen.itec.bank.account.kata.model.UserBalance;

import java.math.BigDecimal;

public enum UserData {
    USER_1("1", new BigDecimal(50));

    private final String userID;
    private final BigDecimal balance;


    public String getUserID() {
        return userID;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    UserData(final String userID, final BigDecimal balance){
        this.userID = userID;
        this.balance = balance;

    }
    public static UserBalance getUser(){
        UserBalance userBalance = initUser(UserData.USER_1.userID, UserData.USER_1.balance);

        return userBalance;
    }
    public static UserBalance initUser(String userID, BigDecimal balance){
        UserBalance userBalance = new UserBalance();
        userBalance.setUserId(userID);
        userBalance.setBalance(balance);
        return userBalance;

    }

}
