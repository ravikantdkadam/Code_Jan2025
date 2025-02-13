package BasicOops;

public class smallCar extends Car{

	public static void main(String[] args) {
		
		smallCar c= new smallCar();
		
		c.bmw();
		c.tata();
		c.honda();
		

	}

	@Override
	void tata() {
		System.out.println("This is tata car");
		
	}

	@Override
	void honda() {

       System.out.println("This is honda car ");
		
	}

}
