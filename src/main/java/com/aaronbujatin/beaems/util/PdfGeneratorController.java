package com.aaronbujatin.beaems.util;

import com.aaronbujatin.beaems.booking.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/generate")
public class PdfGeneratorController {

    private final PdfGeneratorService pdfGeneratorService;
    private final BookingRepository bookingRepository;

//    @GetMapping("/view/{id}")
//    public String viewWeddingContract(@PathVariable String id) throws IOException {
//        pdfGeneratorService.generateWeddingContractPdf(id);
//        return "Wedding contract PDF generated successfully!";
//    }

    @GetMapping("/view")
    public ResponseEntity<InputStreamResource> viewWeddingContract() throws IOException {
        String filePath = "src\\main\\resources\\pdfs\\wedding_contract.pdf";
        Path path = Paths.get(filePath);

        if (Files.exists(path)){
            FileInputStream fileInputStream = new FileInputStream(filePath);

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_PDF);
            headers.add("Content-Disposition", "inline; filename=wedding_contract.pdf");

            InputStreamResource pdfFile = new InputStreamResource(fileInputStream);
            return ResponseEntity.ok()
                    .headers(headers)
                    .body(pdfFile);
        } else {

        }

    }
}
