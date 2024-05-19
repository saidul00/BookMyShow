package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.TicketStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document
public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    private Show show;
    private List<ShowSeat> seats;
    private TicketStatus ticketStatus;
}
