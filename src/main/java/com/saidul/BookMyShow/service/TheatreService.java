package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.TheatreRequestDTO;
import com.saidul.BookMyShow.dto.TheatreResponseDTO;

public interface TheatreService {
    TheatreResponseDTO createTheatre(TheatreRequestDTO theatreRequestDTO);
}
