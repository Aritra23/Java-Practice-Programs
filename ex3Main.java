package CoreJavaPracticeLab;

public class ex3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 ="EARTH";
		StringBuffer sb1=new StringBuffer(s1);
		StringBuffer sb2=new StringBuffer();
		sb1.reverse();
		System.out.println("original string :" + s1);
		System.out.println("reversed string :" +sb1);
		sb2.append(s1).append("|").append(sb1);
		String output=sb2.toString();
		System.out.println("String and its Mirror : " + output);
		
		
	}

}
