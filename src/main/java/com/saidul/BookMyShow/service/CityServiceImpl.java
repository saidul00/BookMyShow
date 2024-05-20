package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.CityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;
import com.saidul.BookMyShow.dto.TheatreRequestDTO;
import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.bson.types.ObjectId;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityRepository cityRepository;

    public CityResponseDTO createCity(CityRequestDTO cityRequestDTO){
        City savedCity = cityRepository.save(CityRequestDTO.from(cityRequestDTO));
        return CityResponseDTO.from(savedCity);
    }

    public  boolean deleteCity(ObjectId cityId){
        cityRepository.deleteById(cityId);
        return true;
    }

    public CityResponseDTO getCityByName(String cityName){
        City city = cityRepository.findCityByName(cityName);
        return CityResponseDTO.from(city);
    }

    public City getCityById(ObjectId cityId){
        City city = cityRepository.findById(cityId).get();
        return city;
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }
}
