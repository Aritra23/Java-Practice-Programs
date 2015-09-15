package CoreJavaPracticeLab;

public class ex46 {

	public Boolean checkPalindrome(String string)
	{
		Boolean flag=false;
		StringBuffer buffer = new StringBuffer(string);
		if(string.equals(buffer.reverse().toString()))
		{
			flag = true;
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		ex46 obj = new ex46();
		String input = "MALAYALAM";
		System.out.println("String '"+input+"' is Palindrome : " + obj.checkPalindrome(input));
	}
}


