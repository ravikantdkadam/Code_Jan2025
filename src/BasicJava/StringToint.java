package BasicJava;

public class StringToint {

	public static void main(String[] args) {
		
		// String to int -you can convert a string to an integer using the Integer.parseInt() or Integer.valueOf() method.
		
		
		String number="123";   // String 
		
		
		int num=Integer.parseInt(number);    // int 
		
		
		System.out.println(num);
		
		

		// int to String -you can convert an int to a String using several methods. Here are the most common ways:
		//1.	Using String.valueOf(int)
		//2.	Using Integer.toString(int)

		
	   int age=35;
	   
	   String s_age=Integer.toString(age);    // String 
	   
	   
	   System.out.println(s_age);
		
	

	}

}
