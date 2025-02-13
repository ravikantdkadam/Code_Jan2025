package BasicJava;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//Loops - loops are used for the Repetitive statement execution
		// It is preTest Loop
		
		
		// while loop
		
		int i=1;     // Initialization
		
		while(i<=5) {              				  // condition
			
			System.out.println("iteration"+i);
			
			i++; 					  // incremental operator 
			
		}
	
System.out.println("=============================================================================================");


// do- while loop 
//It is post test loop 
	// In do while execute the loop body at least once 


int m=1;     //Initialization


do {
	
	System.out.println("iteration"+m);   // block of code 
	
	m++;
}

while(m<=10) ;  // condition 


System.out.println("=============================================================================================");
	
	//for loop 

for(int a=1; a<=5;a++ ) {           // initlization,conditional,incremental
	
	System.out.println("a="+a);                // block of code 
	
}

System.out.println("=============================================================================================");
	
for(int a=10; a>=1;a-- ) {           // initlization,conditional,incremental
	
	System.out.println("a="+a);                // block of code 
	
}



System.out.println("=============================================================================================");
	
	// for each loop


//For each loop will execute the statement for each element in collection which is taken from array 


int [] arr= {10,20,30,40,50,60};


//for (datatype element:arrays) {
	
	
//}

for (int number:arr) {
	
	System.out.println(number);
}


System.out.println("=============================================================================================");

String name[] ={"ravi","Akshay","Divya"};


for (String b:name)  
{
    
    System.out.println("the value of b is " +b);
    
} 




















	
}
}