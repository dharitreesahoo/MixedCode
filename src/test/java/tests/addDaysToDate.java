package tests;

import java.time.format.DateTimeFormatter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class addDaysToDate {
	//add dependnecy to add date
/*	<dependency>
	<groupId>joda-time</groupId>
	<artifactId>joda-time</artifactId>
</dependency>*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dt="05-13-2020";
		
		addDaysToDate(dt ,65 );
		
	}
public static void addDaysToDate(String strDate , int days)
{
	
	org.joda.time.format.DateTimeFormatter formatter = DateTimeFormat.forPattern("MM-dd-yyyy");
	DateTime dateTime = formatter.parseDateTime(strDate);

	DateTime oneDayPlus = dateTime.plusDays(days);
	String oneDayPlusString = oneDayPlus.toString(formatter);
	System.out.println(oneDayPlusString);

}
}
