package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.TheatreRequestDTO;
import com.saidul.BookMyShow.dto.TheatreResponseDTO;
import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.model.Theatre;
import com.saidul.BookMyShow.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService{
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private CityServiceImpl cityService;
    public TheatreResponseDTO createTheatre(TheatreRequestDTO theatreRequestDTO){
        Theatre savedTheatre = theatreRepository.save(TheatreRequestDTO.from(theatreRequestDTO));

        City city = cityService.getCityById(savedTheatre.getCityId());
        List<Theatre> cityTheatreList = city.getTheatreList();
        cityTheatreList.add(savedTheatre);
        city.setTheatreList(cityTheatreList);
        cityService.saveCity(city);

        return TheatreResponseDTO.from(savedTheatre);
    }
}
