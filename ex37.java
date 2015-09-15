package CoreJavaPracticeLab;

import java.io.IOException;

public class ex37 {

	public String rearrangeCharacters(String string)
	{
		int count=0;
		for (int i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) == 'a')
			{
				count++;
			}
		}
		string = string.replaceAll("a", "");
		while(count>0)
		{
			string = "a"+string;
			count--;
		}
		return string;
	}
	
	public static void main(String[] args) throws IOException
	{
		ex37 obj = new ex37();
	    String string = "Hello all gals of MJ005";
		System.out.println(obj.rearrangeCharacters(string));
	}
}


