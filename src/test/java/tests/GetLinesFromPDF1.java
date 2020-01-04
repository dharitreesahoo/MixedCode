package tests;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import edu.emory.mathcs.backport.java.util.Collections;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class GetLinesFromPDF1 extends PDFTextStripper {

	static List<String> lines = new ArrayList<String>();

	public GetLinesFromPDF1() throws IOException {
	}

	public static TreeMap<String, String> getGroup1FromPDF(String fileName)
			throws InvalidPasswordException, IOException {

		PDDocument document = null;
		String line1 = null;
		TreeMap sorted;
		try {
			document = PDDocument.load(new File(fileName));
			PDFTextStripper stripper = new GetLinesFromPDF1();
			stripper.setSortByPosition(true);
			stripper.setStartPage(0);
			stripper.setEndPage(document.getNumberOfPages());
			Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
			stripper.writeText(document, dummy);
			// System.out.println(lines);

			// ***********************************************************
			List<String> list3 = lines.subList(1, 5);
			Collections.sort(list3);
			HashMap<String, String> map1 = new HashMap<String, String>();
			int i = 0;
			map1.put("a", list3.get(i));
			map1.put("f", list3.get(i + 1));
			map1.put("w", list3.get(i + 2));
			map1.put("t", list3.get(i + 3));
			map1.put("q", list3.get(i + 4));
			map1.put("b", list3.get(i + 5));
			map1.put("j", list3.get(i + 6));
			map1.put("w", list3.get(i + 7));
			map1.put("i", list3.get(i + 8));
			map1.put("e", list3.get(i + 9));
			map1.put("h", list3.get(i + 10));
			map1.put("u", list3.get(i + 11));

			sorted = new TreeMap<>();
			// Copy all data from hashMap into TreeMap
			sorted.putAll(map1);
			// Display the TreeMap which is naturally sorted
			System.out.println(sorted.get("e"));

		} finally {
			if (document != null) {
				document.close();
			}
		}

		return sorted;

	}

	public static TreeMap<String, String> getGroup2FromPDF(String fileName)
			throws InvalidPasswordException, IOException {

		PDDocument document = null;
		String line1 = null;
		TreeMap sorted;
		try {
			document = PDDocument.load(new File(fileName));
			PDFTextStripper stripper = new GetLinesFromPDF1();
			stripper.setSortByPosition(true);
			stripper.setStartPage(0);
			stripper.setEndPage(document.getNumberOfPages());
			Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
			stripper.writeText(document, dummy);
			// System.out.println(lines);

			// ***********************************************************
			List<String> list3 = lines.subList(1, 5);
			Collections.sort(list3);
			HashMap<String, String> map1 = new HashMap<String, String>();
			int i = 0;
			map1.put("a", list3.get(i));
			map1.put("f", list3.get(i + 1));
			map1.put("w", list3.get(i + 2));
			map1.put("t", list3.get(i + 3));
			map1.put("q", list3.get(i + 4));
			map1.put("b", list3.get(i + 5));
			map1.put("j", list3.get(i + 6));
			map1.put("w", list3.get(i + 7));
			map1.put("i", list3.get(i + 8));
			map1.put("e", list3.get(i + 9));
			map1.put("h", list3.get(i + 10));
			map1.put("u", list3.get(i + 11));

			sorted = new TreeMap<>();
			// Copy all data from hashMap into TreeMap
			sorted.putAll(map1);
			// Display the TreeMap which is naturally sorted
			System.out.println(sorted.get("e"));

		} finally {
			if (document != null) {
				document.close();
			}
		}

		return sorted;

	}

	@Override
	protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
		lines.add(str);
		// you may process the line here itself, as and when it is obtained
	}

	//******************************************************************
	//Page label**************
	public static void main(String[] args) throws IOException {
		String fileName = "C:/Users/home/Downloads/Help Card - NPTR 1052 - Org movement.pdf";
		TreeMap<String, String> map1 = getGroup1FromPDF(fileName);
		System.out.println(map1.get("e"));
		
		TreeMap<String, String> map2 = getGroup2FromPDF(fileName);
		System.out.println(map1.get("e"));

	}
	
	//Test Label**********************************88
	//Create a page Object and call the getGroup1FromPDF method
	//store in Treemap
	

}