package CoreJavaPracticeLab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ex26 {

	public List<String> modifyElement(List<String> list, String element)
	{
		try{
		list.set(list.indexOf(element), element.substring(0, (element.length()+1)/2));
		
		}catch(Exception e)
		{
			System.out.println("String you are searching is not found in list...");
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException
	{
		ex26 obj = new ex26();
		
		List<String> list = new ArrayList<String>();
		String element = "Hello";
		String element2= "Kolkata";
		String element3 = "Lovely";
		list.add(element);
		list.add(element2);
		list.add(element3);
		
		String element1 = "Bye";
		System.out.println(obj.modifyElement(list, element1));
	}
}


