package CoreJavaPracticeLab;


import java.io.IOException;


public class ex23 {

	public String changeString(String string, char option)
	{
		switch (option)
		{
			case 'A':
			case 'a':
				string = string+string;
				break;
			case 'B':
			case 'b':
				String temp = "";
				for(int i=0; i<string.length(); i++)
				{
					if(i%2==0)
					{
						temp=temp+string.charAt(i);
					}
					else
					{
						temp=temp+"*";
					}
				}
				string = temp;
				break;
			case 'C':
			case 'c':
				temp = "";
				for(int i=0;i<string.length(); i++)
				{
					if(!(temp.contains(Character.toString(string.charAt(i)))))
					{
						temp = temp + string.charAt(i); 
					}
				}
				string = temp;
				break;
			case 'D':
			case 'd':
				for(int i = 0; i<string.length(); i=i+2)
				{
					string = string.substring(0, i) + string.substring(i, i+1).toUpperCase() + string.substring(i+1);
				}
				break;
		}
		return string;
	}
	public static void main(String[] args) throws IOException
	{
		ex23 obj = new ex23();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String string = "--Hello everyone, Welcome to JAVA ||";
		String option1 = "d";
		System.out.println(" Choose an option: \nA: Add the String to itself\n" +
				"B: Replace alternate positions with *\n" +
				"C: Remove duplicate characters in the String\n" +
				"D: Change alternate characters to upper case");
		
		char option = option1.trim().charAt(0);
		
		System.out.println(obj.changeString(string, option));
	}
}


