package CoreJavaPracticeLab;

import java.io.IOException;

public class ex44 {

	public  String getNumber(int i)
	{
		String string = "";
		StringBuffer buf = new StringBuffer(Integer.toString(i));
		i=Integer.parseInt(buf.reverse().toString());
		while(i!=0)
		{
			int temp = i%10;
			switch(temp)
			{
			case 0 :
				string = string + "zero";
				break;
			case 1 :
				string = string + "one";
				break;
			case 2 :
				string = string + "two";
				break;
			case 3 :
				string = string + "three";
				break;
			case 4 :
				string = string + "four";
				break;
			case 5 :
				string = string + "five";
				break;
			case 6 :
				string = string + "six";
				break;
			case 7 :
				string = string + "seven";
				break;
			case 8 :
				string = string + "eight";
				break;
			case 9 :
				string = string + "nine";
				break;
			}
			string = string + " ";
			i=i/10;
		}
		return string;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex44 obj = new ex44();
		int number = 123;
		System.out.println(obj.getNumber(number));
		
	}
}
