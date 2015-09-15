package CoreJavaPracticeLab;

public class ex4 {
	
	boolean checkNumber(int number)
	{
		int tmp = number;
		int counter = 0;
		for(;tmp>0;counter++)
		{	
			tmp = tmp/10;
		}
		tmp = number;
		for(int i=0;i<counter;i++)
		{
			if(tmp%10<(tmp/10)%10)
			{
				System.out.println("Number entered is : " +  number);
				return false;
			}
		}
		System.out.println("Number entered is : " +  number);
		return true;
		
		}

}
