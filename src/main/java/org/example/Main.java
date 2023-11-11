package org.example;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException, InvalidFormatException {
        XWPFDocument document = new XWPFDocument();
        new Title("Wucheplan").generate(document);
        new Subtitle("5. und 6. Klassen").generate(document);
        new Subtitle("Woche 2. Juli 2022 bis 7. Juli 2022").generate(document);
        new Subtitle("Aufgaben f\u00FCr ______________").generate(document);
        new TaskImage().generate(document);
        new TaskTable().generate(document);
        try {
            FileOutputStream out = new FileOutputStream("C:/Temp/test.docx");
            document.write(out);
            out.close();
            document.close();
        } catch(Exception ex) {

        }
    }
}