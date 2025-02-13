package BasicOops;

//final keyword is used as access modifier to restriction on variable , methods and classes

public final class finalkeywordConcept {
	
 final int age=50;
	
	
	public static void main(String[] args) {
		
		finalkeywordConcept f1= new finalkeywordConcept();
		f1.sum();
			
	}

	public final void sum() {
		
		//age =20;   // mnodify the variable which declared with final keyword 
		
		System.out.println(age);
		
	}

}
