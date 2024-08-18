package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.SeatStatus;
import com.saidul.BookMyShow.model.constant.SeatType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNumber;
    private SeatStatus seatStatus;
    private SeatType seatType;
}
