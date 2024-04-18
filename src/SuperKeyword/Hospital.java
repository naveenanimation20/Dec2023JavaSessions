package SuperKeyword;

public class Hospital implements Medical{

	int min_fee = 50;

	public void treatment() {
		
		System.out.println(min_fee + Medical.min_fee);
		
		covid();
		
		bloodTest();
		
	}

	@Override
	public void covid() {
		System.out.println("hospital -- covid");
	}
	
	
	
	
	
	
}
