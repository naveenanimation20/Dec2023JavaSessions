package javasessions;

public class FinalKeyword {
	
	 final int num = 20;//class var

	public static void main(String[] args) {

		
		final int i = 10;//local var		
		System.out.println(i);
		
		FinalKeyword obj = new FinalKeyword();
		System.out.println(obj.num);
		
		//constant vars
		final int DAYS_IN_WEEK = 7;
				
		int salary = 100 * DAYS_IN_WEEK;
		System.out.println(salary);
		
		
		
		
	}

}
