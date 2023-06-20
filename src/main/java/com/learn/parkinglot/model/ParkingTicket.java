package com.learn.parkinglot.model;

import com.learn.parkinglot.model.enums.TicketStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class ParkingTicket {

    private String parkingTicketId;
    private String licenseNumber;
    private String parkingSpaceId;
    private Date entryDate;
    private Date exitDate;
    private Double totalCost;
    private TicketStatus ticketStatus;
}
