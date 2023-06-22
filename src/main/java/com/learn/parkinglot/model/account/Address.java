package com.learn.parkinglot.model.account;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADDRESS_TBL")
public class Address extends Account{

    @Id
    private int id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
