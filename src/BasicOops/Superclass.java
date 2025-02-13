package BasicOops;

public class Superclass {

	
		    public static void main(String[] args) {
		        try {
		            int a = 10;
		            int b = 0;
		            int result = a / b;
		            System.out.println("Result: " + result);
		        } catch (Exception e) { // Superclass first (wrong order)
		            System.out.println("Caught Exception: " + e);
		        } catch (ArithmeticException e) { // Unreachable code (Compilation Error)
		            System.out.println("Caught ArithmeticException: " + e);
		        }
		    }
		
	}


