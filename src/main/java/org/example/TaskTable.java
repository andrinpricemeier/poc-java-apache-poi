package org.example;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TaskTable {
    public void generate(final XWPFDocument document) throws IOException, InvalidFormatException, URISyntaxException {
        XWPFTable tab = document.createTable();
        tab.setWidthType(TableWidthType.PCT);
        tab.setWidth("100%");
        XWPFTableRow row = tab.getRow(0);
        XWPFParagraph image = row.getCell(0).getParagraphs().get(0);
        image.setAlignment(ParagraphAlignment.CENTER);
        XWPFRun imageRun = image.createRun();
        imageRun.setTextPosition(20);
        Path imagePath = Paths.get(ClassLoader.getSystemResource("wucheplaner_computer.png").toURI());
        imageRun.addPicture(Files.newInputStream(imagePath),
                XWPFDocument.PICTURE_TYPE_PNG, imagePath.getFileName().toString(),
                Units.toEMU(50), Units.toEMU(50));


    }
}
