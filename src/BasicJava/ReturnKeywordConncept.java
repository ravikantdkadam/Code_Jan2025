package BasicJava;

public class ReturnKeywordConncept {

	public static void main(String[] args) {
	
		login("rvkadm525@gmail.com","Vishwatech@789",456);    // arguments 
		
		 sum(50,100);
		 

	}

public static void login(String username, String password,int otp) {  //Static method with void keyword -not return anything 
		
	
		System.out.println(username);
		
		System.out.println(password);
		
		System.out.println(otp);
		
	}
	
	
	public static int sum(int a, int b) {   // void -int premitive datatype
		
		int sum=a+b;
		
		System.out.println("Addition of a and b is :"+sum);
		
		return sum;
		
		// dont write anycode after return keyword - Compiler will not reach out after return keyword 
		
	}
	
	
	
}
