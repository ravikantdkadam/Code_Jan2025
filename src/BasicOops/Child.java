package BasicOops;

public class Child extends Father {

	public static void main(String[] args) {
		
		
		Child c1= new Child();     // object of child class
		
		c1.bike();
		c1.car();
		c1.home();
		c1.money();
		c1.farm();

		
//		Father c1= new Child();     // child class object can run by the father class- Child property should not implement 
//		c1.car();
//		c1.home();
//		c1.money();
//		c1.farm();
		

	}
	
	public void bike() {
		
		System.out.println("bike-------child");
		
		
	}
	

}
