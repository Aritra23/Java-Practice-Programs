package CoreJavaPracticeLab;

import java.io.IOException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ex16 {

	Map<Integer, Integer> getSquares(int[] numbers)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; i++)
		{
			map.put(numbers[i], numbers[i]*numbers[i]);
		}
		return map;
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex16 obj = new ex16();
				
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(obj.getSquares(numbers));
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> it = keyset.iterator();
		while (it.hasNext())
		{
			int temp = (Integer) it.next();
			System.out.println(temp + "\t" + map.get(temp));
			
		}
	}
}


