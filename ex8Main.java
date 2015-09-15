package CoreJavaPracticeLab;

public class ex8Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex8 obj = new ex8();
		int []numberArray =	{23,56,34,12,78,42,16,5,43,20,45,9,10};
		
		
		System.out.print("The array is : " );
		for(int i = 0; i<numberArray.length ; i++)
		{
			System.out.print(" " + numberArray[i] + " ");
		}
		System.out.println("\n The second smallest number in the array is : " + obj.getSecondSmallest(numberArray));
	}
}


	


