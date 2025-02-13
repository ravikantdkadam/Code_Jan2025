package BasicJava;

public class ImmutableAndMutable {

	public static void main(String[] args) {
		
		// String is immutable class - can not change the original value of string 
		
		
		String fname= "Ravikant";
		
		System.out.println(fname.concat("Kadam"));  // RavikantKadam
		
		
		System.out.println(fname);  // Ravikant
		
		
		
		
    StringBuffer sb= new StringBuffer("Ravikant");	//String buffer mutable class 
    
      System.out.println("String buffer append: "+sb.append("Kadam"));  // append ---like concat
		
      System.out.println(sb);  // RavikantKadam    
      

		

	}

}
