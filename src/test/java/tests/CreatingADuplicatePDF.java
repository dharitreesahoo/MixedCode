package tests;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.testng.annotations.Test;

public class CreatingADuplicatePDF {
public static void main(String[] args) throws IOException {
	File f=new File("D:/NewWorkspace/MixCode/resources/ticket.pdf");

    OutputStream oos = new FileOutputStream("D:/NewWorkspace/MixCode/resources/ticket1.pdf");

    byte[] buf = new byte[8192];

    InputStream is = new FileInputStream(f);

    int c = 0;

    while ((c = is.read(buf, 0, buf.length)) > 0) {
        oos.write(buf, 0, c);
        oos.flush();
    }

    oos.close();
    System.out.println("stop");
    is.close();

	
}

}
