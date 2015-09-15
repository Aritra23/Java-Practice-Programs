package CoreJavaPracticeLab;

public class ex1 {

	int calculateSum(int n)
	{
		int sum=0;
		for(int i=1,j=0;j<n;i++)
		{
			if (i%5==0 || i%3==0)
			{
				sum=sum+i;
				j++;
			}
		}
		return sum;
}
}
