package com.learn.parkinglot.model.account;

import com.learn.parkinglot.model.enums.AccountStatus;
import lombok.Getter;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Account {

    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
    private AccountStatus accountStatus;
}
