package CoreJavaPracticeLab;

import java.io.IOException;

public class ex40 {

	public String getSum(double number)
	{
		String string = Double.toString(number);
		String tempString = string.substring(string.indexOf('.')+1);
		string = string.substring(0,string.indexOf('.'));
		int left = 0;
		int right = 0;
		for (int i = 0; i < string.length(); i++)
		{
			left = left + Integer.parseInt(Character.toString(string.charAt(i)));
		}
		for (int i = 0; i < tempString.length(); i++)
		{
			right = right + Integer.parseInt(Character.toString(tempString.charAt(i)));
		}
		string = left + ":" + right;
		return string;
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex40 obj = new ex40();
		double n = 150.56;
		System.out.println(obj.getSum(n));
		
	}
}


