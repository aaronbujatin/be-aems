package com.aaronbujatin.beaems.util;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/generate")
public class PdfGeneratorController {

    private final PdfGeneratorService pdfGeneratorService;

    @GetMapping("/view")
    public String viewWeddingContract() throws IOException {
//        String filePath = "G:\\Downloads\\be-aems\\be-aems\\src\\main\\resources\\pdfs\\wedding_contract.pdf";
//
//        FileInputStream fileInputStream = new FileInputStream(filePath);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_PDF);
//        headers.add("Content-Disposition", "inline; filename=wedding_contract.pdf");
//
//        InputStreamResource pdfFile = new InputStreamResource(fileInputStream);
//
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(pdfFile);

        pdfGeneratorService.generateWeddingContractPdf();
        return "Wedding contract PDF generated successfully!";
    }
}
