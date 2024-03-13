package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FilmShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private FilmShow filmShow;
    @ManyToOne
    private  Seat seat;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}
