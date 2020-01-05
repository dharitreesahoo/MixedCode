package pages;

import java.io.IOException;
import java.util.TreeMap;

import util.PDFUtil;

public class PDFValidationPage {

	public TreeMap<String, String> group1Vlidation(String fileName) throws IOException {
		PDFUtil pdf = new PDFUtil();
		TreeMap<String, String> map1 = pdf.getGroup1FromPDF(fileName);
		//System.out.println(map1);
		return map1;
	}

	public TreeMap<String, String> group2Vlidation(String fileName) throws IOException {
		PDFUtil pdf = new PDFUtil();
		TreeMap<String, String> map1 = pdf.getGroup1FromPDF(fileName);
	//	System.out.println(map1);
		return map1;
	}

	public TreeMap<String, String>  group3Vlidation(String fileName) throws IOException {
		PDFUtil pdf = new PDFUtil();
		TreeMap<String, String> map1 = pdf.getGroup1FromPDF(fileName);
		System.out.println(map1);
		TreeMap<String, String> map2 = pdf.getGroup2FromPDF(fileName);
		System.out.println(map1.get("e"));
		return map2;
	}

	public static void main(String[] args) throws IOException {

	}

}
