package BasicJava;

public class LogicalOperators {

	public static void main(String[] args) {
	
	/*	&& Logical and : Return true if both statements are true
		int x=5;

		    System.out.println(X>3 && x<10)     //  T and T :   true 
		||  Logical Or:  Return true if one of the statement is true 
		       System.out.println(X>3 || x>10)     // T Or F   :true
		!   logical not : Reverse the result returns false if result is true
   */
		
		int a =10;
		
		int b=20;
		
		
		System.out.println((b>a)  && (a<b));   // true------ should have both condition True
		
		
		
		System.out.println((a>b)||(a<b));    //true
		
		System.out.println(!(a<b));         //false
		
		
		
		
	}

}
