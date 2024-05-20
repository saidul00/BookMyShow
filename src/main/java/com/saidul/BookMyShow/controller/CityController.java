package com.saidul.BookMyShow.controller;
import com.saidul.BookMyShow.dto.CityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;
import com.saidul.BookMyShow.model.City;
import com.saidul.BookMyShow.service.CityService;
import com.saidul.BookMyShow.service.CityServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.bson.types.ObjectId;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping
    public ResponseEntity<CityResponseDTO> createCity(@RequestBody CityRequestDTO cityRequestDTO){
        return ResponseEntity.ok(
                cityService.createCity(cityRequestDTO)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCity(@PathVariable("id") ObjectId cityId){
        boolean isDeleted = cityService.deleteCity(cityId);
        return ResponseEntity.ok(isDeleted);
    }

    @GetMapping("/{name}")
    public ResponseEntity<CityResponseDTO> getCity(@PathVariable("name") String cityName){
        return ResponseEntity.ok(
                cityService.getCityByName(cityName)
        );
    }
}
