package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.ShowSeat;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ShowSeatRepository extends MongoRepository<ShowSeat, ObjectId> {
}
