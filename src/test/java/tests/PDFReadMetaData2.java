package tests;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.pdfbox.util.PDFTextStripperByArea;
import org.testng.annotations.Test;



public class PDFReadMetaData2 {
	public static void main(String[] args) throws IOException {
		 try (PDDocument pdfDocument = PDDocument.load(new File("C:/Users/home/Downloads/Help Card - NPTR 1052 - Org movement.pdf"))) {

	        	pdfDocument.getClass();

	            if (!pdfDocument.isEncrypted()) {
				
	                PDFTextStripperByArea pdfTextStripperByArea = new PDFTextStripperByArea();
	                pdfTextStripperByArea.setSortByPosition(Boolean.TRUE);

	                PDFTextStripper pdfTextStripper = new PDFTextStripper();

	                String pdfFileInText = pdfTextStripper.getText(pdfDocument);
	              
	                String lines[] = pdfFileInText.split("\\r?\\n");
	                for (String line : lines) {
	                    System.out.println(line);
	                }

	            }

	        }

	    }
	

	}
		
	
