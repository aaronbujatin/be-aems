package com.aaronbujatin.beaems.booking;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking){
        return new ResponseEntity<>(bookingService.saveBooking(booking), HttpStatus.CREATED);
    }



}
