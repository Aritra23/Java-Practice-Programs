package CoreJavaPracticeLab;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex42 {

	public String getDate(int choice)
	{
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sim;
		String currentDate = "";
		switch (choice)
		{
		case 1:
			sim = new SimpleDateFormat("dd-MM-yyyy");
			currentDate = sim.format(cal.getTime());
			break;

		case 2:
			sim = new SimpleDateFormat("dd-MMM-yyyy");
			currentDate = sim.format(cal.getTime());
			break;

		case 3:
			sim = new SimpleDateFormat("dd/MM/yyyy");
			currentDate = sim.format(cal.getTime());
			break;

		case 4:
			sim = new SimpleDateFormat("MM/dd/yyyy");
			currentDate = sim.format(cal.getTime());
			break;

		case 5:
			sim = new SimpleDateFormat("yyyy");
			currentDate = sim.format(cal.getTime());
			break;

		case 6:
			sim = new SimpleDateFormat("MMM");
			currentDate = sim.format(cal.getTime());
			break;

		case 7:
			sim = new SimpleDateFormat("dd-mm-yyyy");
			Calendar newDate = Calendar.getInstance();
			newDate.setTime(cal.getTime());
			newDate.add(Calendar.DATE, 10);
			currentDate = sim.format(newDate.getTime());
			break;

		case 8:
			sim = new SimpleDateFormat("dd-mm-yyyy");
			newDate = Calendar.getInstance();
			newDate.setTime(cal.getTime());
			newDate.add(Calendar.DATE, -10);
			currentDate = sim.format(newDate.getTime());
			break;
			
		default:
			break;
		}
		return currentDate;
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex42 obj = new ex42();
		System.out.println("Current date in various formats : ");
		System.out.println("**************************************");
		int choice1 = 1; 
		System.out.println("dd-MM-yyyy  : " + obj.getDate(choice1));
		int choice2 = 2; 
		System.out.println("dd-MMM-yyyy : " + obj.getDate(choice2));
		int choice3 = 3; 
		System.out.println("dd/MM/yyyy  : " + obj.getDate(choice3));
		int choice4 = 4; 
		System.out.println("MM/dd/yyyy  : " + obj.getDate(choice4));
		int choice5 = 5; 
		System.out.println("yyyy        : " + obj.getDate(choice5));
		int choice6 = 6; 
		System.out.println("MMM         : " + obj.getDate(choice6));
		int choice7 = 7; 
		System.out.println("dd-mm-yyyy  : " + obj.getDate(choice7));
		int choice8 = 8; 
		System.out.println("dd-mm-yyyy  : " + obj.getDate(choice8));
		System.out.println("**************************************");

	}
}
