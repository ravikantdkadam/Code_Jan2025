package BasicOops;

public class ICICIBank implements RBI,UKRBK{
	
	public static void main(String[] args) {
		ICICIBank  i1= new ICICIBank();
		
		i1.eduloan();
		i1.homeloan();
		i1.personaloan();
		i1.mutualfund();
		i1.eduloanUk();
		i1.homeloanUk();
		i1.personalloanUk();
		
	}

	@Override
	public void eduloan() {
		
		System.out.println("RBI ---------------eduloan");
		
		
	}

	@Override
	public void homeloan() {
		System.out.println("RBI ---------------homeloan");
	}

	@Override
	public void personaloan() {
		System.out.println("RBI ---------------personalloan");
		
	}
	
	
	public void mutualfund() {
		
		System.out.println("ICICI ---------------personalloan");
		
	}

	@Override
	public void eduloanUk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeloanUk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void personalloanUk() {
		// TODO Auto-generated method stub
		
	}

	
}
