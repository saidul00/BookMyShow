package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface PaymentRepository extends MongoRepository<Payment, UUID> {
}
