package CoreJavaPracticeLab;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ex45 {

	public String updatePrices(HashMap<String, String> productDetails, HashMap<String, Integer> salesDetails, int rate, String category)
	{
		String s = "{";
		Set<String> keySet= productDetails.keySet(); 
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext())
		{
			String temp = it.next();
			int tempInt=salesDetails.get(temp);
			if(category.equals(productDetails.get(temp)))
			{
				tempInt = (int) (tempInt*((100.0 + rate)/100.0));
			}
			s= s + "\""+temp+"\":"+tempInt;
			if(it.hasNext())
			{
				s=s+",";
			}
		}
		s= s + "}";
		return s;
	}
	public static void main(String[] args) throws NumberFormatException
	{
		ex45 obj = new ex45();
		
		
		System.out.println("Enter the products and categories");
		
		HashMap<String, String> productDetails = new HashMap<String, String>();
		
		productDetails.put("lux","soap");
		productDetails.put("pears","soap");
		productDetails.put("colgate","paste");
		productDetails.put("samsung","electronics");
		productDetails.put("sony","electronics");
		
		System.out.println("Enter the products and prices.");
		HashMap<String, Integer> salesDetails = new HashMap<String, Integer>();
		salesDetails.put("lux",1000);
		salesDetails.put("colgate",500);
		salesDetails.put("pears",2000);
		salesDetails.put("sony",100);
		salesDetails.put("samsung",600);
		
		int rate = 10;		
		String category = "electronics";
		String string = obj.updatePrices(productDetails, salesDetails, rate, category);
		System.out.println(string);
	}
}
