package com.saidul.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "FILM_SHOW")

public class Show extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    @ManyToOne
    private Film film;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeats;
}
