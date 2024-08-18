package com.saidul.BookMyShow.controller;

import com.saidul.BookMyShow.dto.TheatreRequestDTO;
import com.saidul.BookMyShow.dto.TheatreResponseDTO;
import com.saidul.BookMyShow.service.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
public class TheatreController {
    @Autowired
    private TheatreServiceImpl theatreService;

    @PostMapping
    public ResponseEntity<TheatreResponseDTO> createTheatre(@RequestBody TheatreRequestDTO theatreRequestDTO){
        return ResponseEntity.ok(
                theatreService.createTheatre(theatreRequestDTO)
        );
    }
}
