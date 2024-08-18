package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.CreateCityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;
import com.saidul.BookMyShow.exception.CityAlreadyExistException;
import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.bson.types.ObjectId;

import java.util.Optional;

@Service
public class CityServiceImpl implements CityService{
    private final CityRepository cityRepository;
    public CityServiceImpl(CityRepository cityRepository){
        this.cityRepository=cityRepository;
    }

    public CityResponseDTO createCity(CreateCityRequestDTO createCityRequestDTO) {
        Optional<City> cityOptional = cityRepository.findCityByName(createCityRequestDTO.getName());
        if(cityOptional.isPresent()){
            throw new CityAlreadyExistException("City: " + createCityRequestDTO.getName() + ", already exist");
        }

        City savedCity = cityRepository.save(CreateCityRequestDTO.from(createCityRequestDTO));
        return CityResponseDTO.from(savedCity);
    }

    public  boolean deleteCity(ObjectId cityId){
        cityRepository.deleteById(cityId);
        return true;
    }

    public CityResponseDTO getCityByName(String cityName){
        Optional<City> cityOptional = cityRepository.findCityByName(cityName);
        return CityResponseDTO.from(cityOptional.get());
    }

    public City getCityById(ObjectId cityId){
        City city = cityRepository.findById(cityId).get();
        return city;
    }
    public City saveCity(City city){
        return cityRepository.save(city);
    }
}
