package BasicOops;

public class Class_Objects_Constructor {
	
	
	//	// We can define data memeber, functions, static and nonstatic methods, objects ,constructors 
	
	int age =50;   // global variable 

	public static void main(String[] args) {
		
		System.out.println("This is main method ");
	
	String name ="vishwatech";     // local variable
	
	
	Class_Objects_Constructor ref= new Class_Objects_Constructor();   // object creation of class
	
	   ref.nsmethod();
	   
	   
	   GlobalandLocalVariable  g1= new GlobalandLocalVariable();
	   int s=g1.i;
	   
	   System.out.println("The value of s is "+s);
	   
	   

	}
	
	public static void smethod() {
		
		System.out.println("This is static method ");
		
		int a=10;
		int b= 50*a;
		
		
	}
	
	public void nsmethod() {
		
		System.out.println("This is non-static method ");
		
			
	}
	
	public  Class_Objects_Constructor() {      // constructor
		
		System.out.println("This is constructor");
	}
	
	
}