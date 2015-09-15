package CoreJavaPracticeLab;


public class ex13Main {

	/**
	 * @param args
	
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
 
		ex13 obj = new ex13();


		int length = 5;
		int counter = 0;
		String []stringarr = {"Hello","Good","Bye","abc","JAVA"}	;
		
		
		System.out.print("The array is : " );
		for(int i = 0; i<stringarr.length ; i++)
		{
			System.out.print(" " + stringarr[i] + " ");
		}
		while (counter < length)
		{
				counter++;
		}

		String[] modifiedArray = obj.getArrayList(stringarr);
		System.out.println("\n" );
		for (counter = 0; counter < stringarr.length; counter++)
		{
			
			System.out.println( modifiedArray[counter]);
		}

	}


	}

