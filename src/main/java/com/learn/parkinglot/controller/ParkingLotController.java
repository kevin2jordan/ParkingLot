package com.learn.parkinglot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking")
public class ParkingLotController {

    @GetMapping("/welcome")
    public String welcomeMsg() {
        return "Welcome to the parking lot";
    }
}
