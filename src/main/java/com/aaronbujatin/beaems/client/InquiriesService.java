package com.aaronbujatin.beaems.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RequiredArgsConstructor
@Service
public class InquiriesService {


    private final InquiriesRepository userRepository;


    public Inquiries save(Inquiries user) {
        user.setStartDate(LocalDate.parse(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
        return userRepository.save(user);
    }

    public Inquiries findById(String id){
        return userRepository.findById(id).orElse(null);
    }

    public List<Inquiries> findAll(){
        return userRepository.findAll();
    }

    public String deleteById(String id){
        userRepository.deleteById(id);
        return "User id:" + id + " was successfully deleted";

    }

}
