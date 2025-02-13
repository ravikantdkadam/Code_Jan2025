package BasicJava;

public class StaticMethodConcept {

	public static void main(String[] args) {
		
		
		System.out.println("This is a main method");
		
		sumcal();    // call the static method from same class
		

	}
	
	public static void sumcal() {    // static method 
		
		int a=25;
		
		int b=60;
		
		int sum=a+b;
		
		
		System.out.println(sum);
		
		
		System.out.println("This is static regular method ");
		
		
	}
	
	
	
	
	

}
