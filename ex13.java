package CoreJavaPracticeLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex13 {

	public String[] getArrayList(String[] elements)
	{
		String[] modifiedArray = new String[elements.length];
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < elements.length; i++)
			list.add(elements[i]);

		Collections.sort(list);
		for (int i = 0; i < list.size(); i++)
		{
			modifiedArray[i] = ((i < (list.size() + 1) / 2) ? list.get(i)
					.toUpperCase() : list.get(i).toLowerCase());
		}

		return modifiedArray;
	}
}
