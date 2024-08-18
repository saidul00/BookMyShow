package com.saidul.BookMyShow.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Document

public class Show extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private Film film;
    private Auditorium auditorium;
    private List<ShowSeat> showSeats;
}
