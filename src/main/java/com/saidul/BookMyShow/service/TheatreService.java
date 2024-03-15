package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.model.Theatre;
import com.saidul.BookMyShow.repository.CityRepository;
import com.saidul.BookMyShow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private CityService cityService;
    public Theatre saveTheatre(String name, String address, int cityId){
        Theatre theatre = new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);
        Theatre savedTheatre = theatreRepository.save(theatre);

        City city = cityService.getCityById(cityId);
        List<Theatre> theatres = city.getTheatreList();
        theatres.add(savedTheatre);
        city.setTheatreList(theatres);
        cityService.saveCity(city);
        return savedTheatre;
    }
}
