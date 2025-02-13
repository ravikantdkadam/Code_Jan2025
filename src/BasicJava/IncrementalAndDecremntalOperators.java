package BasicJava;

public class IncrementalAndDecremntalOperators {

	public static void main(String[] args) {
		

		//Post increment: Here First print the value of variable and then it will increase by 1 
		
		
		int x=5;
		
		int y=x++;   //post increment
		
	
		System.out.println("value of x is :"+x);    //2
		System.out.println("value of y is :"+y);     //1

		
		System.out.println("====================================================================================================");
		
		

		//Post decrement: Here First print the value of variable and then it will decreased by 1 
		
		
		
		int m=1;
		
		int n=m--;
		
		
		System.out.println("value of m is :"+m);   //0
		System.out.println("value of n is :"+n);   //1

		
		
		System.out.println("=====================================================================================================");
		
		
		
		//Pre increment: Here First increase value of variable and then it will print
		
		
		int a=1;
		
		
		int b=++a;
		
		
		
		System.out.println("value of a is :"+a);  //2
		
       System.out.println("value of b is :"+b);   //2
		
	  
       System.out.println("=====================================================================================================");
		

       
     //Pre Decrement: Here First decrees value of variable and then it will print
       
       
       int e=1;
       
       int f=--e;
       
       
       System.out.println("value of e is :"+e);    //0
       System.out.println("value of f is :"+f);    //0
       
       
       
       
       
       
       
	}

}
