package com.saidul.BookMyShow.service;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService{
    @Override
    public boolean startPayment(List<ObjectId> showSeatIds) {
        return false;
    }
}
