package CoreJavaPracticeLab;

import java.util.*;
import java.io.*;

public class ex38 {

	public List<Integer> getFactors(int n)
	{
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n/2; i++)
		{
			if(n%i==0)
			{
				list.add(i);
			}
		}
		list.add(n);
		return list;
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex38 obj = new ex38();
		
		int n = 100;
		List<Integer> list = new ArrayList<Integer>(obj.getFactors(n));
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}


