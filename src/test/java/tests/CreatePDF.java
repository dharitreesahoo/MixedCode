package tests;

import java.awt.Color;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.testng.annotations.Test;
///////////////heoooooooooooooooo


public class CreatePDF {
	//Reads the portion of PDF file based onthe area od rectangle
	 @Test
	    public void run() throws IOException {
		//Loading an existing document
	      File file = new File("D:/PDFEx/ticket.pdf");
	      PDDocument document = PDDocument.load(file);
	        
	      //Retrieving a page of the PDF Document
	      PDPage page = document.getPage(0);

	      //Instantiating the PDPageContentStream class
	      PDPageContentStream contentStream = new PDPageContentStream(document, page);
	       
	      //Setting the non stroking color
	      contentStream.setNonStrokingColor(Color.DARK_GRAY);

	      //Drawing a rectangle 
	      contentStream.addRect(200, 650, 100, 100);

	      //Drawing a rectangle
	      contentStream.fill();

	      System.out.println("rectangle added");

	      //Closing the ContentStream object
	      contentStream.close();

	      //Saving the document
	      File file1 = new File("D:/PDFEx/colorbox.pdf");
	      document.save(file1);

	      //Closing the document
	      document.close();
	   }
}

