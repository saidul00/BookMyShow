package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.model.Theatre;
import com.saidul.BookMyShow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private CityServiceImpl cityServiceImpl;
    public Theatre saveTheatre(String name, String address, UUID cityId){
        Theatre theatre = new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);
        Theatre savedTheatre = theatreRepository.save(theatre);

        City city = cityServiceImpl.getCityById(cityId);
        List<Theatre> theatres = city.getTheatreList();
        theatres.add(savedTheatre);
        city.setTheatreList(theatres);
        cityServiceImpl.saveCity(city);
        return savedTheatre;
    }
}
