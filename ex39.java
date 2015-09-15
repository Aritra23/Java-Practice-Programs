package CoreJavaPracticeLab;

import java.io.IOException;

public class ex39 {

	public String getFormats(int n)
	{
		String string="";
		string = string + "Binary format : " + Integer.toBinaryString(n) + "\n" + 
		"Octal format : " + Integer.toOctalString(n) +"\n"+ "Hex Format : " + Integer.toHexString(n);
		return string;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex39 obj = new ex39();
		int n =10;
		System.out.println("Number entered : " +n);
		System.out.println(obj.getFormats(n));
	}
}


