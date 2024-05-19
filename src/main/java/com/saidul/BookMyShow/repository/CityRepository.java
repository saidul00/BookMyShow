package com.saidul.BookMyShow.repository;

import com.saidul.BookMyShow.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CityRepository extends MongoRepository<City, UUID> {
    public City findCityByName(String city);
}
