package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> seats;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
