package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Seat;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SeatRepository extends MongoRepository<Seat, UUID> {
}
