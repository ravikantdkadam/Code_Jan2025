package BasicOops;

public class finallykwywordconcept {
	
	
	public static void main(String[] args) {
		// Block of code in finally keyword always executed even try blcok thow error or not 
		// finally keyword always used with try catch block 
	
	try {


		int a=50;

		    int b=a/0;

		 System.out.println(b);

	}

	
	finally {
 System.out.println("This is finally blcok of code");

	
	}
	
	}	
	}

