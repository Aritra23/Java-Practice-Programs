package CoreJavaPracticeLab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ex15 {

	public List<String> removeElements(List<String> list1, List<String> list2)
	{
		list1.retainAll(list2);
		return list1;
	}

	public static void main(String[] args) throws IOException
	{
		ex15 obj = new ex15();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("Hello");
		list1.add("Hi");
		list1.add("Hello-1");
		list1.add("Hi-1");
		list2.add("Hello");
		list2.add("Hi-2");
		list2.add("Hello-1");
		list2.add("Hi-3");
		System.out.println(obj.removeElements(list1, list2));
	}
}


