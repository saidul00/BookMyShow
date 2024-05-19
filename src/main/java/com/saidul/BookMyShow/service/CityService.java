package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public  boolean deleteCity(int cityId){
        cityRepository.deleteById(cityId);
        return true;
    }
    public City getCityByName(String cityName){
        City city = cityRepository.findCityByName(cityName);
        return city;
    }

    public City getCityById(int cityId){
        City city = cityRepository.findById(cityId).get();
        return city;
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }
}
