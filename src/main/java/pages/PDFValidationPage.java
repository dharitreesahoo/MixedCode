package pages;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import edu.emory.mathcs.backport.java.util.Collections;
import util.PDFUtil;

public class PDFValidationPage {
	TreeMap sorted;
	PDFUtil pdf;

	public TreeMap<String, String> group1Vlidation(String fileName) throws IOException {
		pdf = new PDFUtil();
		List<String> list1 = pdf.getListFromPDF(fileName);
		List<String> list3 = list1.subList(1, 5);
		Collections.sort(list3);
		HashMap<String, String> map1 = new HashMap<String, String>();
		int i = 0;
		map1.put("loanNumber", list3.get(i));
		map1.put("loanAmount", "400");
		map1.put("loanPurchase", "discounr");
		map1.put("color", "green");
		sorted = new TreeMap<>();
		// Copy all data from hashMap into TreeMap
		sorted.putAll(map1);
		return sorted;
	}
	public TreeMap<String, String> group2Vlidation(String fileName) throws IOException {
		pdf = new PDFUtil();
		List<String> list1 = pdf.getListFromPDF(fileName);
		List<String> list3 = list1.subList(1, 5);
		Collections.sort(list3);
		HashMap<String, String> map1 = new HashMap<String, String>();
		int i = 0;
		map1.put("loanNumber", list3.get(i));
		map1.put("loanAmount", "400");
		map1.put("loanPurchase", "discounr");
		map1.put("color", "green");
		sorted = new TreeMap<>();
		// Copy all data from hashMap into TreeMap
		sorted.putAll(map1);
		return sorted;
	}

	public static void main(String[] args) throws IOException {

	}

}
