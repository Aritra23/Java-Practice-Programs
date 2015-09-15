package CoreJavaPracticeLab;

import java.io.*;
import java.util.*;


public class ex43 {

	public List<String> getMaxSold(HashMap<String, String> productDetails, HashMap<String, Integer> salesDetails)
	{
		List<String> list = new ArrayList<String>();
		Set<String> keySetPd = productDetails.keySet();
		Iterator<String> itPd = keySetPd.iterator();
		HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
		while(itPd.hasNext())
		{
			String key = itPd.next();
			if(!tempMap.containsValue(productDetails.get(key)))
			{
				tempMap.put(productDetails.get(key),0);
			}
		}
		Set<String> keySetTm = tempMap.keySet();
		Iterator<String> itTm = keySetTm.iterator();
		while(itTm.hasNext())
		{
			String key = itTm.next();
			String tempMax="";
			int maxPrice = 0;
			keySetPd = productDetails.keySet();
			itPd = keySetPd.iterator();
			while(itPd.hasNext())
			{
				String keyPd = itPd.next();
				if( key.equals(productDetails.get(keyPd)) && salesDetails.get(keyPd) > maxPrice )
				{
					maxPrice = salesDetails.get(keyPd);
					tempMax = keyPd;
				}
			}
			list.add(tempMax);
		}
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) throws IOException
	{
		ex43 obj = new ex43();
		
		HashMap<String, String> productDetails = new HashMap<String, String>();
		
			productDetails.put("lux","soap");
			productDetails.put("pears","soap");
			productDetails.put("colgate","paste");
			productDetails.put("samsung","electronics");
			productDetails.put("sony","electronics");
		
		HashMap<String, Integer> salesDetails = new HashMap<String, Integer>();
			salesDetails.put("lux",1000);
			salesDetails.put("colgate",500);
			salesDetails.put("pears",2000);
			salesDetails.put("sony",100);
			salesDetails.put("samsung",600);
		
		
		List<String> list = new ArrayList<String>(obj.getMaxSold(productDetails, salesDetails));
		Iterator<String> it = list.iterator();
		System.out.println("Products that have highest price in each category :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
