package CoreJavaPracticeLab;


import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex11 {

	String getDayofWeek(String date, String dateFormat) throws ParseException
	{
		SimpleDateFormat obj = new SimpleDateFormat(dateFormat);
		Calendar c = Calendar.getInstance();
		c.setTime(obj.parse(date));
		String[] days =
		{ "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY",
				"SATURDAY" };
		System.out.println(days[c.get(Calendar.DAY_OF_WEEK)]);
		return date;
	}

	public static void main(String[] args) throws IOException, ParseException
	{

		Ex11 obj = new Ex11();
		
		System.out.println(obj.getDayofWeek("05/12/2013", "dd/MM/yy"));
	}
}


