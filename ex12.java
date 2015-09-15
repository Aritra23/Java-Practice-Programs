package CoreJavaPracticeLab;

public class ex12 {

	public boolean validateUserName(String userName)
	{
		boolean flag = false;

		if (userName.endsWith("_job") && userName.length() >= 12)
		{
			flag = true;
		} else
		{
			flag = false;
		}
		System.out.println("Entered string is : " + userName);
		return flag;
	}
}
