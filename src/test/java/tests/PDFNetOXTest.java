package tests;

import java.io.IOException;
import java.util.TreeMap;

import org.testng.annotations.Test;

import pages.PDFValidationPage;

public class PDFNetOXTest {
	PDFValidationPage pdfValidationPage;
	
	String fileName = "C:/Users/home/Downloads/Help Card - NPTR 1052 - Org movement.pdf";
	@Test
	public void test1ValidateLoanNumber() throws IOException
	{
		pdfValidationPage = new PDFValidationPage();
		TreeMap<String, String> data = pdfValidationPage.group1Vlidation(fileName);
		System.out.println(data.get("color"));
		
	}

	/*@Test
	public void test1ValidateLoanAmount() throws IOException
	{
		pdfValidationPage = new PDFValidationPage();
		TreeMap<String, String> data = pdfValidationPage.group1Vlidation(fileName);
		System.out.println(data.get("item1"));
		
	}*/
}
