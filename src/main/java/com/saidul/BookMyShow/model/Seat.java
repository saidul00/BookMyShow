package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.SeatStatus;
import com.saidul.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    @Column(name = "Seat_row")
    private int row;
    @Column(name = "Seat_col")
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
}
