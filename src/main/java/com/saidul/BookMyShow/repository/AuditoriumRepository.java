package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Auditorium;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.bson.types.ObjectId;

public interface AuditoriumRepository extends MongoRepository<Auditorium, ObjectId> {
}
