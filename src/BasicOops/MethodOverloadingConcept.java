package BasicOops;

public class MethodOverloadingConcept {

	
	// Method overloading is nothing but the same method name in same class with different parameters 
	
	
	// We can create method with same name and same parameters but with different datatype. --------------VVIMP

	
	public static void main(String[] args) {
		
		
		System.out.println("This is main Method");
		
		sum();
		sum("Vishwatech");
		
		sum(30);

	}
	
	public static void sum() {   
		
		
		System.out.println("This is zero paremeter method with same name ");
		
	}
	
	
	public static void sum(String name) {
		
		System.out.println("This is one paremeter method with same name "+name);
	
		
	}
	
 public static void sum(int a) {
		
		
	 System.out.println("This is two paremeter method with same name "+a);
		
	}
	

}
