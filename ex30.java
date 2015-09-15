package CoreJavaPracticeLab;

import java.io.IOException;

public class ex30 {

	public Boolean validateCode(String code)
	{
		Boolean flag =false;
		if(code.startsWith("Cod")||code.startsWith("COd")||code.startsWith("COD")||code.startsWith("CoD"))       {     
		if(code.length()==6  && Character.isUpperCase(code.charAt(0)))  
				        //Satisfies 1, 2 and 4
		{
			if(Character.isDigit(code.charAt(3))||Character.isDigit(code.charAt(4))||Character.isDigit(code.charAt(5)))
			{
				int countLower = 0;
				int countUpper = 0;
				for (int i = 0; i < code.length(); i++)
				{
					if(Character.isUpperCase(code.charAt(i)))
					{
						countUpper++;
					}
					else if(Character.isLowerCase(code.charAt(i)))
					{
						countLower++;
					}
				}
				if(countUpper>countLower)
				{
					flag=true;
				}
			}
		}
		}
		return flag;
	}
	public static void main(String[] args) throws IOException
	{
		ex30 obj = new ex30();
				
		String code = "CoD1lP";
		
		System.out.println("Code entered : "+code);
			System.out.println("Validity : " + obj.validateCode(code));
		
	}
}
