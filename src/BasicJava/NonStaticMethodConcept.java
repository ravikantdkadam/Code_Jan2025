package BasicJava;

public class NonStaticMethodConcept {

	public static void main(String[] args) {
		
		
		// Object - It is nothing but copy of class
		
		//  classname obj=new Classname();    // object of a class
		
		System.out.println("This is main Method ");
		
		
		NonStaticMethodConcept obj=new NonStaticMethodConcept();
		
		obj.nonstatic1();
		

	}

	
	public void nonstatic1() {         // Non Static Method 
		
		System.out.println("This is non static regular method ");
	}
	
	
	
	
}
