package CoreJavaPracticeLab;

import java.io.IOException;

public class ex32 {

	public String encryptString(String string)
	{
		String code="";
		for (int i = 0; i < string.length(); i++)
		{
			code = code + (char)(((string.charAt(i) + 9)>122)?((string.charAt(i)+9)%122 + 96) :(string.charAt(i)+9));
		}
		return code;
	}
	
	public static void main(String[] args) throws IOException
	{
		ex32 obj = new ex32();
		String s = "zebra";
		System.out.println("Enter a string to be encrypted");
		System.out.println(obj.encryptString(s));
	}
}
