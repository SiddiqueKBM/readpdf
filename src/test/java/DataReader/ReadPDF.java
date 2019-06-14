package DataReader;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadPDF {

    @Test
    public void readPDFTest() throws IOException {

        // Option:---> 01
//        URL url = new URL("file:///Users/kbmsiddique/Downloads/ZayaTsendjav-Resume.pdf");
        URL url = new URL("file:///Users/kbmsiddique/Desktop/JPMC_DE/Consent.pdf");
        InputStream is = url.openStream();
        BufferedInputStream fileParse = new BufferedInputStream(is);
        PDDocument document = null;

        document = PDDocument.load(fileParse);
        String pdfContent = new PDFTextStripper().getText(document);
        System.out.println(pdfContent);

//        Assert.assertTrue(pdfContent.contains("TECHNICAL SKILLS"));
//        Assert.assertTrue(pdfContent.contains("Capital One, Manhasset, NY"));

        Assert.assertTrue(pdfContent.contains("JP Morgan Chase & Co"));
        Assert.assertTrue(pdfContent.contains("Siddique"));


    }

}
