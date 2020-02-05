package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class FirstDayOfMonth {
	public static void main(String[] args) throws ParseException {
		String dt="12/02/2020";
		String targetDate = getFirstOfMonth(dt);
	}
public static String getFirstOfMonth(String strDate) throws ParseException
{
	
	String strBeforeMonth = strDate.split("/")[0];
	String strBeforeYear= strDate.split("/")[2];
	
	
	org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
	DateTime dateTime = formatter.parseDateTime(strDate);
	DateTime d1 = dateTime.plusMonths(1).withDayOfMonth(1);
	
	System.out.println(d1);
	String year = d1.toString().split("-")[0];
	String month = d1.toString().split("-")[1];
	String day = d1.toString().split("-")[2];
	String fullDate = month+"/"+day+"/"+year;
	System.out.println(day);
	if(day.substring(0, 2).equals("01") )
	{
		System.out.println("date is 1st only");
	}
	System.out.println("Before month"+Integer.parseInt(strBeforeMonth));
	System.out.println("Aftermonth"+Integer.parseInt(month));
	int monthDiff = Integer.parseInt(month)-Integer.parseInt(strBeforeMonth);
	if(monthDiff==1)
	{
		System.out.println("month is next month only");
	}
	if(strBeforeMonth.equals("12"))
	{
		year = strBeforeYear;
	}else{
		int yearNew = Integer.parseInt(strBeforeYear)+1;
	}
	
	return fullDate;
	
	
	 /*SimpleDateFormat sourceDateFormat = new SimpleDateFormat("yyyy-dd-mm");
	 Date date = sourceDateFormat.parse(strDate);
	 SimpleDateFormat targetDateFormat = new SimpleDateFormat("mm-dd-yyyy");
	 String targetDate = targetDateFormat.format(date);*/
	 //return targetDate;


}
}
