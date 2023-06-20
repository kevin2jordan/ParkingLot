package com.learn.parkinglot.model;

import com.learn.parkinglot.exception.InvalidParkingTicketException;
import com.learn.parkinglot.model.enums.ParkingSpaceType;
import com.learn.parkinglot.model.parkingspot.ParkingSpace;
import com.learn.parkinglot.strategy.DefaultPricingStrategy;
import lombok.Getter;
import lombok.Setter;


import java.time.Duration;
import java.util.Date;

@Getter
@Setter
public class ExitGate {

    private String exitGateId;

    public ExitGate(String exitGateId) {
        this.exitGateId = exitGateId;
    }

    public ParkingTicket scanAndVacateParkingLot(ParkingTicket parkingTicket) {
        ParkingSpace parkingSpace = ParkingLot.INSTANCE.vacateParkingSpace(parkingTicket.getParkingSpaceId());
        if(parkingSpace == null) {
            throw new InvalidParkingTicketException("Invalid parking ticket");
        }
        parkingTicket.setExitDate(new Date());
        parkingTicket.setTotalCost(calculateCost(parkingSpace.getParkingSpaceType(), parkingTicket));
        return parkingTicket;
    }

    private Double calculateCost(ParkingSpaceType parkingSpaceType, ParkingTicket parkingTicket) {
        Duration duration = Duration.between(parkingTicket.getEntryDate().toInstant(), new Date().toInstant());
        long hours = duration.toHours();
        if(hours == 0){
            hours = 1;
        }
        return hours* new DefaultPricingStrategy().getPrice(parkingSpaceType);
    }
}
