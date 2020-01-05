package util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import edu.emory.mathcs.backport.java.util.Collections;
import tests.GetLinesFromPDF1;

public class PDFUtil extends PDFTextStripper {
	
	static List<String> lines = new ArrayList<String>();

	public PDFUtil() throws IOException {
	}

	public static TreeMap<String, String> getGroup1FromPDF(String fileName)
			throws InvalidPasswordException, IOException {

		PDDocument document = null;
		String line1 = null;
		TreeMap sorted;
		try {
			document = PDDocument.load(new File(fileName));
			PDFTextStripper stripper = new PDFUtil();
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
			map1.put("loanNumber", list3.get(i));
			map1.put("loanAmount", "400");
			map1.put("loanPurchase", "discounr");
			map1.put("color", "green");
			//map1.put("q", list3.get(i + 4));
			/*map1.put("b", list3.get(i + 5));
			map1.put("j", list3.get(i + 6));
			map1.put("w", list3.get(i + 7));
			map1.put("i", list3.get(i + 8));
			map1.put("e", list3.get(i + 9));
			map1.put("h", list3.get(i + 10));
			map1.put("u", list3.get(i + 11));*/

			sorted = new TreeMap<>();
			// Copy all data from hashMap into TreeMap
			sorted.putAll(map1);
			// Display the TreeMap which is naturally sorted
			//System.out.println(sorted.get("e"));

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
			PDFTextStripper stripper = new PDFUtil();
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

}
