package BasicJava;

public class MethodConcept {
	
public static void main(String[] args) {
		
		int a=10;
		
		int b =a*10;
		
		System.out.println("MainMethod");
		
		sum();   // call method from main method 
		StaticMethodConcept.sumcal();    // call method from another class

		NonStaticMethodConcept  ref=new NonStaticMethodConcept();   // object of class
		
		
		ref.nonstatic1();
		
		
		
	}
	
	
	
	public static void sum() {     // Method Declaration-----Static Method
		
		int m=50;
		
		int sum=m+10;
		
		System.out.println(sum);
		
		
	
		
	}
	

	public void mul() {    // non-Static method
		
		int x=10;
		
		int y=10*10;
		
		
		System.out.println(y);
		
		
	}


	
}
