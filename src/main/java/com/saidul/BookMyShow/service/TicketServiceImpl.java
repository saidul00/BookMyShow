package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.dto.ExceptionResponseDTO;
import com.saidul.BookMyShow.dto.TicketRequestDTO;
import com.saidul.BookMyShow.dto.TicketResponseDTO;
import com.saidul.BookMyShow.exception.ShowSeatUnavailableException;
import com.saidul.BookMyShow.model.ShowSeat;
import com.saidul.BookMyShow.model.Ticket;
import com.saidul.BookMyShow.model.constant.ShowSeatStatus;
import com.saidul.BookMyShow.repository.TicketRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    private ShowSeatServiceImpl showSeatService;
    @Autowired
    private PaymentService paymentService;


    @Transactional(isolation = Isolation.SERIALIZABLE)
    public TicketResponseDTO bookTicket(TicketRequestDTO ticketRequestDTO) {

        //checking if seat status available
        for (ObjectId seatId : ticketRequestDTO.getShowSeatIds()){
            ShowSeat seat = showSeatService.getShowSeat(seatId);
            if(!seat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new ShowSeatUnavailableException("Seat is unavailable");
            }
        }
        //update seat state to locked
        for (ObjectId showSeatId : ticketRequestDTO.getShowSeatIds()){
            ShowSeat seat = showSeatService.getShowSeat(showSeatId);
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(seat);
        }
        paymentService.startPayment(ticketRequestDTO.getShowSeatIds());
        return new TicketResponseDTO();
    }
}
