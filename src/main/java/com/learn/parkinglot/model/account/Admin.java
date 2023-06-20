package com.learn.parkinglot.model.account;

import com.learn.parkinglot.service.ParkingLotService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Admin extends Account{

    private String name;
    private String email;
    private String phoneNumber;
    private Address address;

    ParkingLotService parkingLotService;

    public Admin() {
        parkingLotService = new ParkingLotService();
    }


}
