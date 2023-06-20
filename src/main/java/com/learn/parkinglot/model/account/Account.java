package com.learn.parkinglot.model.account;

import com.learn.parkinglot.model.enums.AccountStatus;
import lombok.Getter;

@Getter
public class Account {

    private String accountId;
    private String userName;
    private String password;
    private AccountStatus accountStatus;
}
