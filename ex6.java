package CoreJavaPracticeLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ex6 {

	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks )
	{
		HashMap<Integer, String> studentGrade = new HashMap<Integer, String>();
		Set<Integer> s = studentMarks.keySet();
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext())
		{	
			int tempObject = it.next();
			if(studentMarks.get(tempObject) >= 90)
			{
				studentGrade.put(tempObject, "Gold");
			}
			else if(studentMarks.get(tempObject)>= 80 && studentMarks.get(tempObject)< 90)
			{
				studentGrade.put(tempObject, "Silver");	
			}
			else if(studentMarks.get(tempObject) >= 70 && studentMarks.get(tempObject) < 80)
			{
				studentGrade.put(tempObject, "Bronze");
			}
		}
		System.out.println(studentGrade);
		
		return studentGrade;
}
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> studentMarks = new HashMap<Integer, Integer>();
		HashMap<Integer, String> studentGrade = new HashMap<Integer, String>();
		int studentCount;
		for(studentCount=1; studentCount<=5; studentCount++)
		{
			System.out.println("Enter the Registration Number for student " + studentCount );
			int tempName = Integer.parseInt(br.readLine());
			System.out.println("Enter the marks scored by " + tempName );
			int tempMarks = Integer.parseInt(br.readLine());
			studentMarks.put(tempName,tempMarks);
		}
		studentGrade=getStudents(studentMarks);
		
		Set<Integer> keySet = studentGrade.keySet();
		Iterator<Integer> it = keySet.iterator();
		System.out.println("ID      Grade");
		System.out.println("***************");
		
		while(it.hasNext())
		{	
			Object tempObject = it.next();
			System.out.println(tempObject + "\t" + studentGrade.get(tempObject));
			if(it.hasNext()!= true)
				
			{
				System.out.println(" Others : Sorry, No Medals");
			}	
			
		}
		
		
		}	
	}


