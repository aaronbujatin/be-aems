package com.aaronbujatin.beaems.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("bookings")
public class Booking {

    @Id
    private String id;
    private String officiant;
    private String ceremony;
    private String reception;
    private String caterer;
    private String tablesAndChairs;
    private String photographer;
    private String videographer;
    private String cakeBaker;
    private String stationer;
    private String lightsAndSounds;
    private String musicians;
    private String bridalCar;
    private String florist;
    private String makeUpArtist;


}
