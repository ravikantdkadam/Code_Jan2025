package BasicJava;

public class JavaMemory {

	public static void main(String[] args) {
		
		
		String s1= "Welcome";   // Literals
		
		
		String s2 = new String ("Welcome");  // object 
		
		
		
		
		String s3= "Welcome";
		
		
		
		String s4 = new String ("Welcome");  // object 
		
		
		
		
		
		

		System.out.println(s1==s3);  //true  // == assignment operator will verify the memory location
		
		System.out.println(s2==s4);  // false 
		
		
		System.out.println(s1.equals(s3));  // true
		
		System.out.println(s1.equals(s2));  //true=====> equals method will verify the string contents
		
		

		
		
		
		
		
		
		

	}

}
