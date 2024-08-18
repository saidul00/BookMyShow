package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Show;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ShowRepository extends MongoRepository<Show, ObjectId> {
}
