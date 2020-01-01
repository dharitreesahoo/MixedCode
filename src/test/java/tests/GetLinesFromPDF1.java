package tests;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class GetLinesFromPDF1 extends PDFTextStripper {

static List<String> lines = new ArrayList<String>();

public GetLinesFromPDF1() throws IOException {
}

public static String searchAValueInLine(String strText) throws InvalidPasswordException, IOException {

PDDocument document = null;
String line1 = null;
String fileName = "G:\\Shared\\Dharitree\\NetOx\\SFR Law Form.pdf";
try {
document = PDDocument.load(new File(fileName));
PDFTextStripper stripper = new GetLinesFromPDF1();
stripper.setSortByPosition(true);
stripper.setStartPage(0);
stripper.setEndPage(document.getNumberOfPages());
Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
stripper.writeText(document, dummy);

// print lines
for (String line : lines) {
// System.out.println(line); // to print whole text
if (line.contains(strText)) {
// System.out.println(line);
line1 = line;
}
}
} finally {
if (document != null) {
document.close();
}
}
return line1;

}

public static String searchAValueInNextLine(String strText) throws InvalidPasswordException, IOException {

PDDocument document = null;
String line1 = null;
String fileName = "G:\\Shared\\Dharitree\\NetOx\\SFR Law Form.pdf";
try {
document = PDDocument.load(new File(fileName));
PDFTextStripper stripper = new GetLinesFromPDF1();
stripper.setSortByPosition(true);
stripper.setStartPage(0);
stripper.setEndPage(document.getNumberOfPages());
Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
stripper.writeText(document, dummy);

// print lines
/*
* for (String line : lines) { // System.out.println(line); // to
* print whole text if (line.contains(strText)) { //
* System.out.println(line); } }
*/
for (int i = 0; i < lines.size(); i++) {
if (lines.get(i).contains(strText)) {
i = i + 2;
line1 = lines.get(i);
}
}

} finally {
if (document != null) {
document.close();
}
}
return line1;

}

public static String deleteAllSpcialCharacter(String strText) throws InvalidPasswordException, IOException {

PDDocument document = null;
String line1 = null;
String fileName = "G:\\Shared\\Dharitree\\NetOx\\SFR Law Form.pdf";
try {
document = PDDocument.load(new File(fileName));
PDFTextStripper stripper = new GetLinesFromPDF1();
stripper.setSortByPosition(true);
stripper.setStartPage(0);
stripper.setEndPage(document.getNumberOfPages());
Writer dummy = new OutputStreamWriter(new ByteArrayOutputStream());
stripper.writeText(document, dummy);

// print lines

for (String line : lines) { // System.out.println(line); // to
line.replaceAll("[$]", "");
System.out.println(line);
}

} finally {
if (document != null) {
document.close();
}
}
return line1;

}

@Override
protected void writeString(String str, List<TextPosition> textPositions) throws IOException {
lines.add(str);
// you may process the line here itself, as and when it is obtained
}

public static void main(String[] args) throws IOException {
String borrower1 = searchAValueInLine("Borrower  1");
// System.out.println(borrower1);

String loanNumber = searchAValueInLine("Lo a  n #");
// System.out.println(loanNumber);

String gurantor1 = searchAValueInLine("Guarantor 1: ");
// System.out.println(gurantor1);

String loanScore = searchAValueInLine("Loan Score: ");
// System.out.println(loanScore);

String LTV = searchAValueInLine("Effective LTV: ");
// System.out.println(LTV);

String CLTV = searchAValueInLine("Effective CLTV");
// System.out.println(CLTV);

String totalHousingExpense = searchAValueInNextLine("Total Qualifying Housing Expense:");
// System.out.println(totalHousingExpense);

String appliedCreditScore = searchAValueInLine("Credit Scores:750   ");
//System.out.println(appliedCreditScore);

String lines = deleteAllSpcialCharacter("Credit Scores:750   ");
//System.out.println(appliedCreditScore);




}

}