package CoreJavaPracticeLab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ex34 {

	public String[] getEmployees(List<String> branch1, List<String> branch2)
	{
		branch1.retainAll(branch2);
		String[] temp = new String[branch1.size()];
		Collections.sort(branch1);
		Iterator<String> it = branch1.iterator();
		int i =0;
		while(it.hasNext())
		{
			temp[i] = it.next();
			i++;
		}
		return  temp;
	}
	public static void main(String[] args) throws IOException
	{
		ex34 obj = new ex34();
		
		List<String> branch1 = new ArrayList<String>();
		branch1.add("Poulami");
		branch1.add("Vanishree");
		branch1.add("Bhakti");
		branch1.add("Riya");
		branch1.add("Pallavi");
		List<String> branch2 = new ArrayList<String>();
		branch2.add("Akash");
		branch2.add("Riya");
		branch2.add("Pallavi");
		branch2.add("Poulami");
		String temp[] = obj.getEmployees(branch1, branch2);
		System.out.println("Employee(s) who work in both the departments : ");
		for (int i = 0; i < temp.length; i++)
		{
			System.out.println(temp[i]);
		}
	}
}
