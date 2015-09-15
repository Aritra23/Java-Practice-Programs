package CoreJavaPracticeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ex27
{
	public int findSum(int number)
	{	
		int counter = 0;
		int sum=0;
		int i=0;
		while(counter < number)
		{
			if(i%3==0 && i%8==0)
			{
				sum=sum+i;
				i++;
               counter++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex27 obj = new ex27();
		System.out.println("Enter the limit");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = obj.findSum(Integer.parseInt(br.readLine()));
		System.out.println(s) ;
		
	}
}