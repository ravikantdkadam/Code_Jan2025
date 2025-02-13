package BasicOops;

public class Runtimepolymorphisam {
	
	// Method overriding is best example of Runtime polymorphisam

	public static void main(String[] args) {
		
		Runtimepolymorphisam r1= new Runtimepolymorphisam();
		r1.calculation();
		

	}
	

   public void calculation() {    // non static method 
	   
	   int a=10;
	   
	   
	   int b =a/0;
	   
   }
	
	
	
	

}
