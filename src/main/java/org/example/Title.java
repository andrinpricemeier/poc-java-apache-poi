package org.example;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Title {
    private final String title;
    public Title(final String title) {
        this.title = title;
    }
    public void generate(final XWPFDocument document) {
        XWPFParagraph title = document.createParagraph();
        XWPFRun titleRun = title.createRun();
        titleRun.setText(this.title);
        titleRun.setBold(true);
        titleRun.setFontSize(48);
    }
}
