package CoreJavaPracticeLab;

public class ex10 {

	int modifyNumber(int number)
	{
		String stringNumber = new String(Integer.toString(number));
		StringBuffer tempBuffer = new StringBuffer();
		for (int i = 0; i < stringNumber.length() - 1; i++)
		{
			String temp = "";
			temp = "" + (stringNumber.charAt(i));
			String temp2 = "";
			temp2 = "" + (stringNumber.charAt(i + 1));

			int tempNumb = Math.abs(Integer.parseInt(temp)
					- Integer.parseInt(temp2));

			tempBuffer = tempBuffer.append(tempNumb);
		}
		tempBuffer.append(stringNumber.charAt(stringNumber.length() - 1));
		System.out.println("Number entered : " + number);
		return Integer.parseInt(tempBuffer.toString());
	}
}
