package BasicJava;

public class ControlStatment {

	public static void main(String[] args) {
		
		//if statment 
		
		int num=5;
		
		if (num>10) {  // false
			
			System.out.println("number is less than 10");
		}
		
		System.out.println("out of if code block ");
		
		
	System.out.println("======================================================================================");	
		
		// if else statement 
		
		int age=35;
		
		if(age>50)    //false
		{
			System.out.println(" less age");  // if -block of code 
		}
		else 
		{
			System.out.println("more age ");   // else -block of code
			
		}
		
		System.out.println("======================================================================================");	
		
			
		// else if statement 
		
		int x=40;
		
		if(x<18) {
			System.out.println("small age");
			
		}
		else if (x>18 && x<50) {
			
			System.out.println("medium age");
	
		}
		
		else {
			
			System.out.println("more age");
		}
		
		
		
		System.out.println("======================================================================================");	
		
		
		// Nested if 
		
		
		
		String Un="abc";
		String pw="xyz";
		
		if (Un=="abc") {
			
                 if (pw=="xyz") {
				
				System.out.println("Login successful");
				
				
			     }
			     else {
				
				System.out.println("wrong password");
			     }	
			
			
		}
		
	
		else {
			
			System.out.println("wrong username");
		}
		
		
		System.out.println("======================================================================================");
		
		
		
		// Switch Statement 
		
		
		//Switch statement - instead of number of if else statement we can use switch statement 
		
		
		int day=15;   // variable declaration
		
		switch(day)    // switch expression 
		{
		
		case 1:
			
			System.out.println("monday");

		break;
		
        case 2:
			
			System.out.println("Tuesday");

		break;
		
        case 3:
			
			System.out.println("Wednesday");

		break;
		
        case 4:
		
		System.out.println("Thurseday");

		break;
		
        case 5:
		
		System.out.println("Friday");

		break;
		
        case 6:
		
		System.out.println("Saturday");

		break;
		
        case 7:
    		
    		System.out.println("Sunday");

    		break;
    		
		
        default:
		
		System.out.println("This is out of calender");

		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
