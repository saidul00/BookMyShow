package com.saidul.BookMyShow.model;

import com.saidul.BookMyShow.model.constant.ShowSeatStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class ShowSeat extends BaseModel{
    private int price;
    private Show show;
    private  Seat seat;
    private ShowSeatStatus showSeatStatus;
}
