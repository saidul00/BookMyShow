package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Payment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PaymentRepository extends MongoRepository<Payment, ObjectId> {
}
