package BasicOops;

public class CompileTimeMorphisam {
	
	
	// One object showing different behavior at different stages is called as polymorphisam 
	
	// Compile time Polymorphisam- method declaration is binding with method definition at compilation time based on arguments.
	
	// Method overloading is best example of Compile time polymorphisam.

	public static void main(String[] args) {
		
		int name="Vishwatech";   // compilation error 
		
		System.out.println("This is main method" );

	}
	
	
	public void sum() {        // method Declaration
	
	System.out.println("This is regular method") ;          // Method definition
	
	}
	
	public void sum() {        // method Declaration
		
		System.out.println("This is regular method") ;          // Method definition
		
		}
	

//Compile time errors:
//	Missing semicolons 
//	Missing any brackets 
//	Missing double quotes
//	Missing data type
//	Misspelling of identifiers and keywords


}
