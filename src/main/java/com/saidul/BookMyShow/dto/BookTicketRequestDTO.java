package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class BookTicketRequestDTO {
    private List<Integer> showSeatIds;
    private Integer userId;
}
