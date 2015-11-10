package net.rakugakibox.html2pdf;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.xhtmlrenderer.pdf.ITextRenderer;

public class HtmlToPdfApplication {

    public static void main(String[] args) throws Exception {

        String html = args[0];
        String pdf = args[1];

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(html);
        renderer.layout();
        try (OutputStream out = new FileOutputStream(pdf)) {
            renderer.createPDF(out);
        }

    }

}
