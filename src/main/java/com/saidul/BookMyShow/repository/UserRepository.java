package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UserRepository extends MongoRepository<User, UUID> {
}
