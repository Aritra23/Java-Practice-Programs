package CoreJavaPracticeLab;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex33 {

	public Boolean compareDates(String purchaseDate, String sellingDate) throws ParseException
	{
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		Calendar purchase = Calendar.getInstance();
		purchase.setTime(sim.parse(purchaseDate));
		
		Calendar selling = Calendar.getInstance();
		purchase.setTime(sim.parse(sellingDate));
		
		Boolean flag = false;
		if(purchase.after(selling))
		{
			flag=true;
		}
		return flag;
	}
	
	public static void main(String[] args) throws IOException, ParseException
	{
		ex33 obj = new ex33();
		
		String purchaseDate = "05/10/2013";
		String sellingDate = "10/12/2013";
		System.out.println("Purchase date : " + purchaseDate);
		System.out.println("Selling date : " + sellingDate);
		System.out.println("Sale date after purchase date : ");
		System.out.println(obj.compareDates(purchaseDate, sellingDate));
	}
}
