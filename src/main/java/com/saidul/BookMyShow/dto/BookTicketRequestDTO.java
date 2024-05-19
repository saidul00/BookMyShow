package com.saidul.BookMyShow.dto;

import com.saidul.BookMyShow.model.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
public class BookTicketRequestDTO {
    private List<UUID> showSeatIds;
    private UUID userId;
}
