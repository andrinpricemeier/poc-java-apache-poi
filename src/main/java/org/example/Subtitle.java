package org.example;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Subtitle {
    private final String subtitle;
    public Subtitle(final String subtitle) {
        this.subtitle = subtitle;
    }
    public void generate(final XWPFDocument document) {
        XWPFParagraph title = document.createParagraph();
        XWPFRun titleRun = title.createRun();
        titleRun.setFontFamily("Arial");
        titleRun.setText(this.subtitle);
        titleRun.setFontSize(24);
        titleRun.addBreak();
        titleRun.addBreak();
    }
}
