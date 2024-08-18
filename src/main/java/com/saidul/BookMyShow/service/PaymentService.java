package com.saidul.BookMyShow.service;

import org.bson.types.ObjectId;

import java.util.List;

public interface PaymentService {
    boolean startPayment(List<ObjectId> showSeatIds);
}
