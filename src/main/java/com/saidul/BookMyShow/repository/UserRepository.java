package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, ObjectId> {
}
