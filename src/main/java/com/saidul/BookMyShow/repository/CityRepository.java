package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.City;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CityRepository extends MongoRepository<City, ObjectId> {
    public City findCityByName(String city);
}
