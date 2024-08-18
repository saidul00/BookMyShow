package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Seat;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface SeatRepository extends MongoRepository<Seat, ObjectId> {
}
