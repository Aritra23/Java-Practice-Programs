package CoreJavaPracticeLab;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ex29 {

	public List<String> getValues(Map<Integer, String> map)
	{
		List<String> list = new ArrayList<String>();
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext())
		{
			list.add(map.get(it.next()));
		}
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) throws IOException
	{
		ex29 obj = new ex29();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Apple");
		map.put(2,"Cattle");
		map.put(3,"Battle");
		map.put(5,"Whale");
		map.put(4,"Shark");
		List<String> list = obj.getValues(map);
		System.out.println("The Hashmap in a sorted order : ");
		System.out.println(list);
	}
}


