package CoreJavaPracticeLab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex31 {

	public int sumOfFactorials(int n)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		int count1 = 0;
		int count2 = 1;
		
		list.add(0); 
		list.add(1);
		
		while(list.size()<n)
		{
			list.add(count2 = count1+count2);
			count1=count2-count1;
		}
		
		Iterator<Integer> it=list.iterator();
		int sum = 0;
		while (it.hasNext())
		{
			int temp = it.next();
			
			if(temp==0 || temp==1)
			{
				sum=sum+1;
			}
			else if(temp>1)
			{
				int tempProduct = 1;
				while(temp>1)
				{
					tempProduct = tempProduct*temp;
					temp--;
				}
				sum = sum + tempProduct;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		ex31 obj = new ex31();
		
		String input = "6";
		System.out.println("Sum of Factorials : ");
		System.out.println(obj.sumOfFactorials(Integer.parseInt(input)));
	}
}
