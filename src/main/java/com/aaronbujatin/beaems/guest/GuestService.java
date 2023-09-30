package com.aaronbujatin.beaems.guest;


import com.aaronbujatin.beaems.util.QRCodeGenerator;
import com.google.zxing.WriterException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor
@Service
public class GuestService {

    @Autowired
    private JavaMailSender emailSender;

    private final GuestRepository guestRepository;


    public Guest saveGuest(Guest guest) throws IOException, WriterException, MessagingException {

        String qrCodeText = "Name: " + guest.getFirstName() + " " +  guest.getLastName() +
                "\nEmail: " + guest.getEmail() +
                "\nTable number: " + guest.getTableNumber() +
                "\nRelatedness: " + guest.getRelatedness();

        byte[] qrCodeImageBytes = QRCodeGenerator.generateQRCodeImage(qrCodeText, 300, 300);
        sendEmail(qrCodeImageBytes, guest);
        return guestRepository.save(guest);
    }

    public Guest getGuestById(String id){
        return guestRepository.findById(id).get();
    }

    private void sendEmail(byte[] qrCodeImageBytes, Guest guest) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(guest.getEmail());
        helper.setSubject("Your Guest QrCode");
        helper.setText("Dear " + guest.getFirstName() + " " + guest.getLastName() +",\n\nPlease find the attached QR code.");

        // Attach the QR code image to the email
        ByteArrayResource resource = new ByteArrayResource(qrCodeImageBytes);
        helper.addAttachment("qrcode.png", resource);

        emailSender.send(message);
    }


}