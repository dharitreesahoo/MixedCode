package tests;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import java.awt.Color;
import com.pdftron.common.PDFNetException;
import com.pdftron.pdf.*;
import java.text.DecimalFormat;

public class GetLinesFromPDF {

	static List<String> lines = new ArrayList<String>();
    public GetLinesFromPDF() throws IOException {
    }
    /**
     * @throws IOException If there is an error parsing the document.
     */
    public static void main(String[] args) {
    	   // Example 2. Extract text content based on the
    	try {
            PDFDoc doc = new PDFDoc((input_path + "newsletter.pdf"));
            doc.initSecurityHandler();

            // Example 1. Extract all text content from the document

            ElementReader reader = new ElementReader();
            //  Read every page
            for (PageIterator itr = doc.getPageIterator(); itr.hasNext(); ) {
                reader.begin(itr.next());
                DumpAllText(reader);
                reader.end();
            }

            // Example 2. Extract text content based on the
            // selection rectangle.
            System.out.print("\n----------------------------------------------------");
            System.out.print("\nExtract text based on the selection rectangle.");
            System.out.println("\n----------------------------------------------------");

            Page first_page = doc.getPageIterator().next();
            String s1 = ReadTextFromRect(first_page, new Rect(27, 392, 563, 534), reader);
            System.out.print("\nField 1: " + s1);

            s1 = ReadTextFromRect(first_page, new Rect(28, 551, 106, 623), reader);
            System.out.print("\nField 2: " + s1);

            s1 = ReadTextFromRect(first_page, new Rect(208, 550, 387, 621), reader);
            System.out.print("\nField 3: " + s1);

            // ...
            doc.close();
            System.out.println("Done.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    PDFNet.terminate();
}


static void printStyle(TextExtractor.Style s) {
    Color rgb = s.getColor();
	String rgb_hex =  String.format("%02X%02X%02X;", rgb.getRed(), rgb.getGreen(), rgb.getBlue() );
	DecimalFormat df = new DecimalFormat("#.#");
    System.out.print(" style=\"font-family:" + s.getFontName() + "; "
            + "font-size:" + df.format(s.getFontSize()) + ";"
            + (s.isSerif() ? " sans-serif; " : " ")
            + "color:#" + rgb_hex + "\"");
}
}
}
