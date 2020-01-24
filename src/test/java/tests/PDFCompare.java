package tests;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;

import de.redsix.pdfcompare.PdfComparator;

public class PDFCompare {

	public static void main(String[] args) throws IOException {
		
		BasicConfigurator.configure();
		String file1 = "D:\\CapgeminiDocument\\paySlips\\NovemberPaylip.pdf";
		String file2 = "D:\\CapgeminiDocument\\paySlips\\OctoberPayslip.pdf";
		// TODO Auto-generated method stub
		new PdfComparator(file1, file2).compare().writeTo("d:/diffOutput.pdf");
		
	}

}
