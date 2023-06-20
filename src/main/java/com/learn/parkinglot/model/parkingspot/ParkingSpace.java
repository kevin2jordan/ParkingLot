package com.learn.parkinglot.model.parkingspot;

import com.learn.parkinglot.model.enums.ParkingSpaceStatus;
import com.learn.parkinglot.model.enums.ParkingSpaceType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpace {

    private String parkingSpaceId;
    private ParkingSpaceStatus parkingSpaceStatus;
    private ParkingSpaceType parkingSpaceType;
    private String vehicleId;

    public ParkingSpace(String parkingSpaceId, ParkingSpaceType parkingSpaceType ) {
        this.parkingSpaceId = parkingSpaceId;
        this.parkingSpaceType = parkingSpaceType;
    }

    public void assignVehicleToParkingSpace(String vehicleId) {
        this.vehicleId = vehicleId;
        this.parkingSpaceStatus = ParkingSpaceStatus.BOOKED;
    }

    public void freeParkingSpace() {
        this.vehicleId = null;
        this.parkingSpaceStatus = ParkingSpaceStatus.AVAILIABLE;
    }
}
