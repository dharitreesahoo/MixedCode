package tests;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.testng.annotations.Test;



public class PDFRead {
	//Reads the portion of PDF file based onthe area od rectangle
	 @Test
	    public void run() throws IOException {
	        try{
	            PDDocument document = PDDocument.load(new File("D:/NewWorkspace/MixCode/resources/ticket.pdf"));

	            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	            stripper.setSortByPosition( true );
	            Rectangle rect = new Rectangle( 10, 200, 320, 60 );
	            stripper.addRegion( "class1", rect );
	            PDPage firstPage = document.getPage(0);
	            stripper.extractRegions( firstPage );
	            System.out.println( "Text in the area:" + rect );
	            System.out.println( stripper.getTextForRegion( "class1" ) );
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	    }

}
