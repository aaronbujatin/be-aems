package com.aaronbujatin.beaems.rexelle;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@Document("rexelle")
public class Rexelle {


    private String id;
    private String organizerName;
    private LocalDate bookingDate;
    private String eventName;
    private String bookingStatus;
    private String bookingSource;
    private String clientName;
    private String clientContactNumber;
    private String email;
    private String address;
    private LocalDate weddingDate;
    private String weddingType;
    private String themeStyle;
    private String ceremonyVenue;
    private String receptionVenue;
    private String expectedNumberOfGuest;
    private String groomName;
    private String groomContactNumber;
    private String brideName;
    private String brideContactNumber;
    private String srar;
    private String packageSelected;
    private List<String> addOnsService;
    private String paymentStatus;
    private String paymentMethod;
    private double amountPaid;




}
