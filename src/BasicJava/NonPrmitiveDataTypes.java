package BasicJava;

public class NonPrmitiveDataTypes {

	public static void main(String[] args) {
		//•	Memory size of Non primitive data types are not fixed. 
		//	String ,Arrays, Collection, Interfaces and Classes are the Non Primitive data types.
		// Note: Identifier starts with upper case 
		
		
		// String = Alphanumeric+numeric+special char

		String classname="Vishwatech";
		
		String email="rvkadam25@vishwatech-solutions.com";
		
		
		System.out.println("The class name is :"+classname);// The class name is :Vishwatech
		
		System.out.println("My email address is :"+email);// My email address is :rvkadam25@vishwatech-solutions.com
		
		
		String fristname="Ravikant";
		String lastname="kadam";
		
		
		//String fullname=fristname+" "+lastname; 
		
		String fullname=fristname.concat(lastname);
		
	System.out.println(fullname);  // Ravikant kadam

		System.out.println(fristname);    // String is immutable- Original string value is not getting changed even we perform any action on string 
		
	
		
	}

}
