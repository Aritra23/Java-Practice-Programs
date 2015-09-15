package CoreJavaPracticeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ex22 {

	public List<Integer> checkPerfectCouple(Map<Integer, String> names)
	{
		Set<Integer> keySet = names.keySet();
		Iterator<Integer> it = keySet.iterator();
		List<Integer> list = new ArrayList<Integer>();
		while (it.hasNext())
		{
			Integer key = (Integer) it.next();
			String firstName = names.get(key).substring(0, names.get(key).indexOf("-"));
			String secondName = names.get(key).substring(names.get(key).indexOf("-")+1);
			Boolean flag1 = true;
			Boolean flag2 = true;
			for(int i = 0; i<firstName.length(); i++)
			{
				if(!secondName.contains(Character.toString(firstName.charAt(i))))
				{
					flag1 = false;
				}
			}
			for(int i = 0; i<secondName.length(); i++)
			{
				if(!firstName.contains(Character.toString(secondName.charAt(i))))
				{
					flag2 = false;
				}
			}
			if(flag1 == true && flag2 == true)
			{
				list.add(key);
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex22 obj = new ex22();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<Integer, String> names = new HashMap<Integer, String>();
		System.out.println("Enter 4 IDs.");
		System.out.println("Enter the ID");
		int tempInt = new Integer(Integer.parseInt(br.readLine()));
		int i=0;
		while(i < 4)
		{
			i++;
			System.out.println("Enter the names");
			String tempString = new String(br.readLine());
			names.put(tempInt, tempString);
			System.out.println("Enter the ID");
			tempInt = Integer.parseInt(br.readLine());
		}
		
		List<Integer> list = new ArrayList<Integer>(obj.checkPerfectCouple(names));
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

