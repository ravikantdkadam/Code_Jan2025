package BasicJava;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String name="vishwatech";
		
		String city="PUNE";
		
		// length() method 
		
		int namelength=name.length();
		
		System.out.println("The length of string are :"+namelength);  //The length of string are :10
		
		
		// toUpperCase() method 
		
		name.toUpperCase();
		
		System.out.println(name.toUpperCase());  // VISHWATECH
		
		// toLowerCase() method
		
		city.toLowerCase();
		System.out.println(	city.toLowerCase());   //pune
			
		
		//indexOf() method
		
		name.indexOf('t');
		
		System.out.println("The index of t charcter is: "+name.indexOf('t'));  // The index of t charcter is: 6
		
		// concat () method
		
		name.concat(city);
		
		System.out.println(name.concat(city));   // vishwatechPUNE
		
		
		// contains() method
		
		
		name.contains("wat");
		
		System.out.println(name.contains("wat")); // true
		
		//isBlank();
		
		name.isBlank();
		
		
		System.out.println(name.isBlank());   // false
		
		
		
		// isEmpty();  returns true if length of string is 0
		
		name.isEmpty();
		
		
		System.out.println("validate string is empty or not"+name.isEmpty());  //false
		
		//equals() method              ----------------------------------VVVVVIMP
		
		
		name.equals(city);    // two strings can compare using equals method
		
		System.out.println(name.equals(city));    // false
		
		
		//CharAt() methods;                  ----------------------------------VVVVVIMP
		
		name.charAt(5);
		
		System.out.println(name.charAt(5));  // a
		
		System.out.println("==============================================================================");
		
		
		//
		
		
	    String college="MIT";
	    String school="MiT";
		
	    System.out.println(college.equals(school)); // false
	    
	    
	    
		System.out.println(college.compareToIgnoreCase(school));
		
		
		
	// 
		
		
		String fname=" ";
		String lname=" ";
		
		
		String fullname=fname+" "+lname;
		
		
		System.out.println(fullname);
		
		System.out.println(fullname.isBlank());  //true
	
	}

}
