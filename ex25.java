package CoreJavaPracticeLab;

import java.io.*;
import java.util.*;

public class ex25 {

	public char[] mergeData(List<Character> list1, List<Character> list2)
	{
		
		list1.addAll(list2);
		char temp[] = new char[list1.size()];
		for (int i =0; i<list1.size(); i++)
		{
			temp[i] = list1.get(i);
		}
		return temp;
	}
	public static void main(String[] args) throws IOException
	{
		ex25 obj = new ex25();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		String s = "a";
		String s1 = "b";
		String s3 = "c";
		String s4 = "d";
		list1.add(s.charAt(0));
		list1.add(s1.charAt(0));
		list1.add(s1.charAt(0));
		list2.add(s3.charAt(0));
		list2.add(s4.charAt(0));
		list2.add(s1.charAt(0));
		char[] temp = obj.mergeData(list1, list2);
		System.out.println(temp);
	}
}


