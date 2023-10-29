package com.aaronbujatin.beaems.booking;

import com.aaronbujatin.beaems.registration.RegistrationFee;
import com.aaronbujatin.beaems.registration.RegistrationFeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final RegistrationFeeRepository registrationPaymentRepository;

    public Booking save(Booking booking){
        booking.setBookingDate(LocalDate.now());
        booking.setEventName("PENDING");
        booking.setBookingStatus("PENDING");
        booking.setOrganizerName("PENDING");
        booking.setBookingSource("ONLINE");

        RegistrationFee registrationPayment = new RegistrationFee();
        registrationPayment.setCardNumber(booking.getRegistrationFee().getCardNumber());
        registrationPayment.setFullName(booking.getRegistrationFee().getFullName());
        registrationPayment.setExpirationDate(booking.getRegistrationFee().getExpirationDate());
        registrationPayment.setCvv(booking.getRegistrationFee().getCvv());
        registrationPayment.setAmountFee(booking.getRegistrationFee().getAmountFee());
        registrationPaymentRepository.save(registrationPayment);

        return bookingRepository.save(booking);
    }

    public Booking getBookingById(String id){
        return bookingRepository.findById(id).get();
    }

    public List<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }

    public List<Booking> getBookingByOrganizerName(String organizerName){
        return bookingRepository.findByOrganizerName(organizerName);
    }



}
