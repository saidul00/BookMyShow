package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.ShowSeat;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ShowSeatRepository extends MongoRepository<ShowSeat, UUID> {
}
