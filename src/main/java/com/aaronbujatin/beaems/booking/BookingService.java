package com.aaronbujatin.beaems.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookingService {

    private final BookingRepository bookingRepository;


    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }




}
