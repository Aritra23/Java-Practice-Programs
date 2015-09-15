package CoreJavaPracticeLab;

import java.util.ArrayList;
import java.util.List;

public class ex14 {

	public List<String> removeElements(List<String> list1, List<String> list2)
	{
		list1.removeAll(list2);
		return list1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex14 obj = new ex14();
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list1.add("Hello");
		list1.add("Bye");
		list1.add("good");
		list2.add("Bye");
		list2.add("Everyone");
		list2.add("Good");
		System.out.println("Removing all the items in List1 which are contained in List2 : ");
		System.out.println(obj.removeElements( list1 , list2));
	}
}
