package CoreJavaPracticeLab;

import java.io.*;
import java.text.*;
import java.util.*;



public class ex41 {

	public Boolean validateAge(String date) throws ParseException
	{
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance(); 
		Calendar currentDate = Calendar.getInstance();
		cal.setTime(sim.parse(date));
		Boolean flag = false;
		if(cal.get(Calendar.YEAR) + 21 < currentDate.get(Calendar.YEAR))
		{
			flag = true;
			
		}
		else if (cal.get(Calendar.YEAR) + 21 == currentDate.get(Calendar.YEAR))
		{
			if(cal.get(Calendar.MONTH) < currentDate.get(Calendar.MONTH))
			{
				flag = true;
			}
			else if( (cal.get(Calendar.MONTH) == currentDate.get(Calendar.MONTH)) && (cal.get(Calendar.DAY_OF_MONTH) <= currentDate.get(Calendar.DAY_OF_MONTH)))
			{
				flag = true;
			}
		}
		return flag;
	}
	public static void main(String[] args) throws IOException, ParseException
	{
		ex41 obj = new ex41();

		String date = "05/10/1990";
		System.out.println("Date of Birth : " + date);
		System.out.println("Entered age is greater than 21 : " + obj.validateAge(date));
	}
}


