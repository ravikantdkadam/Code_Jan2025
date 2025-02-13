package BasicOops;

public class Encapsulation {
	
//	1.	Encapsulation: Wrapping up of data and methods in single unit
//	2.	All variable should be private 
//	3.	For every variable have to create 2 methods 1.setters and 2.getters method---means 1 
//	4.	Variables can be operated through only methods 

   private int a =10;
  
   private String name ="Vishwatech";
  
	
  public static void main(String[] args) {
		
	}


public int getA() {   // getter- to get the value of variable 
	return a;
}


public void setA(int a) {    // to set the value of variable 
	this.a = a;                      // global variable = local variable using this keyword 
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


}
