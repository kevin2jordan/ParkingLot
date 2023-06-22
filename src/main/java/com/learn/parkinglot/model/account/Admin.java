package com.learn.parkinglot.model.account;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADMIN_TBL")
public class Admin extends Account{

    private String name;
    private String email;
    private String phoneNumber;
}
