package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.PaymentMode;
import com.saidul.BookMyShow.model.constant.PaymentStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document
public class Payment extends BaseModel{
    private String paymentId;
    private LocalDateTime timeOfPayment;
    private double amount;
    private Ticket ticket;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
