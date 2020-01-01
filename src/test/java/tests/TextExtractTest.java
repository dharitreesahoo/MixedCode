package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// This sample illustrates the basic text extraction capabilities of PDFNet.
public class TextExtractTest {

    public static void main(String[] args) throws IOException {
    	File f=new File("C:/Users/home/Downloads/Help Card - NPTR 1052 - Org movement.pdf");

        OutputStream oos = new FileOutputStream("d:/test1.txt");

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

