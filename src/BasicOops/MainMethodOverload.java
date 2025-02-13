package BasicOops;

public class MainMethodOverload {
	
	// Can we overload main method -YES We can 

	public static void main(String[] args) {
		
   System.out.println("This is main method ");
	
   main(15);
   main(15,25);
	
	
	}

	
	public static void main(int a) {
		
		   System.out.println("This is main method with same parameter with diffrent datatype");
			
			
			
			}

	
	public static void main(int a, float b) {
		
		   System.out.println("This is main method with different parameter");
			
			
			
			}
	
	
	
	public static void main(float a, int b) {
		
		   System.out.println("This is main method with different parameter");
			
			
			
			}
	

}
