package CoreJavaPracticeLab;

import java.io.IOException;

public class ex36 {

	public int getPrimeSum(int n)
	{
		int counter = 0;
		int sum = 0;
		int number = 2;
		while(counter<n)
		{
			Boolean flag = true;
			for(int i=2; i<=number/2; i++)
			{
				if(number%i==0)
				{
					flag = false;
				}
			}
			if(flag == true)
			{
				sum=sum+number;
				counter++;
			}
			number++;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex36 obj = new ex36();
		int range = 10;
		System.out.println("Sum of first 10 prime numbers : " + obj.getPrimeSum(range));
	}
}


