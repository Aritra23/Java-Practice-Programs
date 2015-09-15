package CoreJavaPracticeLab;

import java.util.Arrays;

public class ex24 {

	public Boolean checkPositive(String string)
	{
		char []temp = string.toCharArray();
		Arrays.sort(temp);
		Boolean answer = false;
		String tempString = new String(temp);
		if(string.equals(tempString))
		{
			answer = true;
		}
		return answer;
	}
	
	
}


