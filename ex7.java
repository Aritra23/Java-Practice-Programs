package CoreJavaPracticeLab;

public class ex7 {

	String alterString(String input)
	{
		String outputString = new String();
		
		for(int counter = 0; counter < input.length(); counter++)
		{
			char temp = input.charAt(counter);
			switch(temp)
			{
			case 'A':
				break;
			case 'a':
				break;
			case 'E':
				break;
			case 'e':
				break;
			case 'I':
				break;
			case 'i':
				break;
			case 'O':
				break;
			case 'o':
				break;
			case 'U':
				break;
			case 'u':
				break;
			default:
				temp++;
			}
			outputString += temp;
		}
		return outputString;
	}
	
}
