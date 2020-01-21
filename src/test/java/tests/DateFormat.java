package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String arg[]){

	    try{

	    SimpleDateFormat sourceDateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    Date date = sourceDateFormat.parse("01-08-2018");
	    SimpleDateFormat targetDateFormat = new SimpleDateFormat("d-MM-yyyy");
	    System.out.println(targetDateFormat.format(date));

	    }catch(ParseException e){
	        e.printStackTrace();
	    }
	  } 

	}

