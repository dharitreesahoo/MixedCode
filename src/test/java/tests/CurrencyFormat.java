package tests;

import java.text.DecimalFormat;

public class CurrencyFormat {

	public static void main(String[] args) {
		String number = "1000.574";
		double amount = Double.parseDouble(number);
		DecimalFormat formatter = new DecimalFormat("#,##.00");

		System.out.println(formatter.format(amount));
		// TODO Auto-generated method stub

	}

}
