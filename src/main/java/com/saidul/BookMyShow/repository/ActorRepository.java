package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.Actor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ActorRepository extends MongoRepository<Actor, ObjectId> {
}
