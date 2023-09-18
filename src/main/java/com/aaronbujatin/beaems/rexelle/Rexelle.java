package com.aaronbujatin.beaems.rexelle;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Document("rexelle")
public class Rexelle {


    private String id;
    private LocalDate bookingDate;
    private String eventName;

}
