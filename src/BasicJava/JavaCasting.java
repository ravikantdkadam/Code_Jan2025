package BasicJava;

public class JavaCasting {

	public static void main(String[] args) {
		
		// Widening Casting - Converting smaller primitive DataType into larger primitive DataType
		
		int a=24;     // 4 byte 
		
		
		double num=a;     // 8 byte 
		
		System.out.println(num);   //24
		
		
		
		// Narrowing Casting - Converting larger primitive DataType into smaller primitive DataType(Manually)
		
		
		
		long rollnum=123;   // 8 byte 
		
		
		int number=(int) rollnum;   // 4 byte 
		
		
		System.out.println(number);  // 123
		
	

	}

}
