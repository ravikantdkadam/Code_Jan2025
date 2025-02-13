package BasicJava;

public class ParametersAndArguments {

	public static void main(String[] args) {
		
	login("rvkadm525@gmail.com","Vishwatech@789",456);    // arguments 
	
	ParametersAndArguments para1=new ParametersAndArguments();  // object of class
	
	para1.forgotpass("abc@gmail.com");

	}
	

	public static void login(String username, String password,int otp) {  //Static method // passed the parameter in method 
		
	
		System.out.println(username);
		
		System.out.println(password);
		
		System.out.println(otp);
		
	}
	
	public void forgotpass(String retypeemail) {   // nonstatic method 
		
		System.out.println("For reset password enter the email :"+retypeemail);
		
		
	}
	
	
}
