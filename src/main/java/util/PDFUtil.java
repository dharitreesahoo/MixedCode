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

	public List<String> getListFromPDF(String fileName) throws InvalidPasswordException, IOException {

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

		} finally {
			if (document != null) {
				document.close();
			}
		}
		return lines;
	}

	@Override
	protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
		lines.add(str);
		// you may process the line here itself, as and when it is obtained
	}

}
