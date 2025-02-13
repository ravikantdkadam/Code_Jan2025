package BasicOops;

   abstract class Car {
	
	// A method without implementation of body this method is called Abstract method 
	// Abstract method should be declared inside the abstract class.
	   
	// We can add the concrete(non abstract) methods 
	   
     // We can't create object of abstarct class
	   

	
	public abstract void tata();  // abstract method 
	
	
	void bmw() {   // non abstarct method 
		
		System.out.println("This is non abstarct method(concrete method) ");
	}
	
     abstract void honda();    // abstarct method 

}
