package com.saidul.BookMyShow.service;

import com.saidul.BookMyShow.model.ShowSeat;
import com.saidul.BookMyShow.repository.ShowSeatRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatServiceImpl implements ShowSeatService{
    @Autowired
    private ShowSeatRepository showSeatRepository;
    public ShowSeat getShowSeat(ObjectId showSeatId){
        return showSeatRepository.findById(showSeatId).get();
    }

    public ShowSeat saveShowSeat(ShowSeat seat){
        return showSeatRepository.save(seat);
    }
}
