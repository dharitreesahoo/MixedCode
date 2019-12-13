package tests;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.testng.annotations.Test;



public class PDFRead2 {

	public static String getData(int x,int y,int x1,int y1) throws IOException {
		String data = null;
		try {

			PDDocument document = PDDocument.load(new File("D:/NewWorkspace/MixCode/resources/ticket.pdf"));
			PDFTextStripperByArea stripper = new PDFTextStripperByArea();
			stripper.setSortByPosition(true);
			Rectangle rect = new Rectangle(x, y, x1, y1);
			stripper.addRegion("class1", rect);
			PDPage firstPage = document.getPage(0);
			stripper.extractRegions(firstPage);
			// System.out.println( "Text in the area:" + rect );
			//System.out.println(stripper.getTextForRegion("class1"));
			data = stripper.getTextForRegion("class1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	    
	    public static void main(String[] args) throws IOException {
	    	String data = getData(10, 200, 320, 10 );
	    	System.out.println(data);
	    	String data1 = getData(300, 10, 400, 100 );
	    	System.out.println(data1);
		}
}

