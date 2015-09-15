package CoreJavaPracticeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex9 {

	ArrayList<String> modifyStrings(String s1, String s2)
	{
		ArrayList<String> list = new ArrayList<String>();
		String temp = new String();
		
		
		for(int i = 0; i<s1.length(); i++)
		{
			temp = temp + ((i%2 != 0)?s1.charAt(i):s2); 
		}
		list.add(temp);
		
		int lastIndex = s1.lastIndexOf(s2);
		if(lastIndex!= -1)
		{	
			StringBuffer tempOne = new StringBuffer(temp.substring(lastIndex, lastIndex+s2.length()));
			temp = s1.substring(0,lastIndex) + tempOne.reverse() +s1.substring(lastIndex+s2.length());
			
		}
		else
		{
			temp +=  s2;
		}
		
		list.add(temp);
		
		if(s1.indexOf(s2)!=-1)
		{
			temp = s1.substring(0,s1.indexOf(s2)) + s1.substring(s1.indexOf(s2)+s2.length());
		}
		else
		{
			temp = s1;
		}
		list.add(temp);
		
		temp = ((s2.length() % 2 == 0)?s2.substring(0,s2.length()/2):s2.substring(0,(s2.length()/2) + 1)) + s1 + s2.substring((s2.length()/2));
		
		list.add(temp);
		
		temp = s1;
		for(int i = 0;i<s2.length();i++)
		{
			temp = temp.replace(s2.charAt(i), '*');
		}
		
		list.add(temp);
		return list;
	}
	public static void main(String[] args) throws IOException
	{
		Ex9 obj = new Ex9();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string 1");
		String s1 = new String(br.readLine());
		System.out.println("Enter string 2");
		String s2 = new String(br.readLine());
		
		System.out.println(obj.modifyStrings(s1, s2));
	}
}


