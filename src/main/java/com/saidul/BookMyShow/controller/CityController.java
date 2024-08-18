package com.saidul.BookMyShow.controller;
import com.saidul.BookMyShow.dto.CreateCityRequestDTO;
import com.saidul.BookMyShow.dto.CityResponseDTO;
import com.saidul.BookMyShow.exception.CityAlreadyExistException;
import com.saidul.BookMyShow.service.CityService;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city")
public class CityController {
    private final CityService cityService;
    public CityController(CityService cityService){
        this.cityService=cityService;
    }

    @PostMapping
    public ResponseEntity<CityResponseDTO> createCity(@RequestBody CreateCityRequestDTO createCityRequestDTO) throws CityAlreadyExistException {
        return ResponseEntity.ok(
                cityService.createCity(createCityRequestDTO)
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
