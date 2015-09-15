package CoreJavaPracticeLab;

public class ex5 {

	Boolean checkNumber(int n)
	{
		while(n/2!=0)
		{
			if(n%2!=0 && n!= 1)
				return false;
			n=n/2;
		}
		return true;
	}
}
