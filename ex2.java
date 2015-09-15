package CoreJavaPracticeLab;

public class ex2 {

	int calculateDifference(int n)
	{
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int difference = 0;
		
		for(int i=1;i<n+1;i++)
		{
			sumOfSquares = sumOfSquares + i*i;
			squareOfSum = squareOfSum + i;
		}
		squareOfSum = squareOfSum*squareOfSum;
		difference =  squareOfSum - sumOfSquares;
		System.out.println(squareOfSum);
		System.out.println(sumOfSquares);
		return difference;
}
}
