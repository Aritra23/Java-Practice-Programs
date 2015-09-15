package CoreJavaPracticeLab;

import java.util.*;
import java.util.Collections;


public class ex8 {

	int getSecondSmallest(int []numberArray )
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i<numberArray.length; i++)
		{
			list.add(numberArray[i]);
		}
		Collections.sort( list);
		return list.get(1);
	}
	

}
