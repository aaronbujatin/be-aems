package com.aaronbujatin.beaems.util;
import com.vladsch.flexmark.ast.Paragraph;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

@Service
public class PdfGeneratorService {

    public void generateWeddingContractPdf() {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                // Set font and font size
                contentStream.setFont(PDType1Font.HELVETICA, 14);

                String imagePath = "G:\\Downloads\\be-aems\\be-aems\\src\\main\\resources\\images\\sweet-serenity-pdf-logo.png";
                BufferedImage image = ImageIO.read(new File(imagePath));
                PDImageXObject pdImage = PDImageXObject.createFromFile(imagePath, document);
                contentStream.drawImage(pdImage, 25, 570, 220, 220);

                contentStream.beginText();
                contentStream.newLineAtOffset(435, 690);
                contentStream.setNonStrokingColor(Color.decode("#681B16"));
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 20);
                contentStream.showText("Rodriguez, Rizal");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(450, 620);
                contentStream.setNonStrokingColor(Color.decode("#F480E8"));
                contentStream.setFont(PDType1Font.HELVETICA, 20);
                contentStream.showText("09212924650");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(442, 600);
                contentStream.setNonStrokingColor(Color.decode("#681B16"));
                contentStream.setFont(PDType1Font.HELVETICA, 11);
                contentStream.showText("sweetserenity@gmail.com");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(413, 580);
                contentStream.setNonStrokingColor(Color.decode("#681B16"));
                contentStream.setFont(PDType1Font.HELVETICA, 11);
                contentStream.showText("https://sweet-serenity.vercel.app");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(190, 510);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.HELVETICA, 20);
                contentStream.showText("Wedding Planning Contract");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 490);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("Agreement mode by (Client name here) between Sweet Serenity Wedding Event Planning and the");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 475);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("bride (bride name here) and the groom (groom name here).");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 445);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 14);
                contentStream.showText("CHANGE/CANCELLATIONS");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 430);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("Any changes/cancellation made to this contract must be made in writing and signed by all parties.");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 405);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("In the event the wedding couple is forced to change the date of the wedding, every effort will be made by");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 390);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("Sweet Serenity Event Planning to transfer location reservations, sub-contractors and The Wedding Coordinator");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 375);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("support to the new date. The wedding couple agrees that in the event of a date change any expenses including");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 360);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("but not limited to deposits and fees that are non-refundable and non-transferable are the sole responsibility of");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 345);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("the wedding couple. There may also be additional charges above and beyond those set in the original contract.");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 330);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("The wedding couple further understands that last minute changes can impact the quality of the event and");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 315);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("that The Wedding Coordinator is not responsible for these compromises in quality. If the bridal");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 300);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("couple changes the date/location of the wedding and the wedding planner is unavailable to provide services,");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 285);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("then the wedding planner is released from all contract obligations and shall in no way be held responsible");
                contentStream.endText();

                contentStream.beginText();
                contentStream.newLineAtOffset(50, 270);
                contentStream.setNonStrokingColor(Color.BLACK);
                contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
                contentStream.showText("or liable for non-performance. The couple also forfeits all costs for non-compliance with this agreement.");
                contentStream.endText();
            }

            document.save("wedding_contract.pdf"); // Save the PDF
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
