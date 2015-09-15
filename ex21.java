package CoreJavaPracticeLab;

import java.io.*;
import java.util.*;


public class ex21 {

	public Map<String, String> getStates(String data, char del1, char del2)
	{
		Map<String, String>  map = new TreeMap<String, String>();
		StringTokenizer token = new StringTokenizer(data, Character.toString(del2));
		
		while(token.hasMoreTokens())
		{
			String del= Character.toString(del1) + Character.toString(del1);
			StringTokenizer temp = new StringTokenizer(token.nextToken(),del);
			map.put(temp.nextToken(), temp.nextToken());
		}
		return map;
	}
	
	public static void main(String[] args) throws IOException
	{
		ex21 obj = new ex21();
		
			
		String del11 = "||";
		char del1 = del11.charAt(0);
		
		String del21 = "-";
		char del2 = del21.charAt(0);
		
		
		String data = "tamilnadu||chennai-karanataka||bengaluru";
		
		Map<String, String> map = new TreeMap<String, String>(obj.getStates(data, del1, del2));
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext())
		{
			String temp = it.next();
			
			System.out.println(temp + "\t" + map.get(temp));
		}
	}
}


