package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.model.ShowSeat;
import com.saidul.BookMyShow.model.Ticket;
import com.saidul.BookMyShow.model.constant.ShowSeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private ShowSeatService showSeatService;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception {
        for (int seatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(seatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new Exception("Seat is not available for Booking");
            }
        }
        for (int showSeatId : showSeatIds){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }
        startPayment(showSeatIds);
        return new Ticket();
    }
    public boolean startPayment(List<Integer> showSeatIds){
        return true;
    }
}
