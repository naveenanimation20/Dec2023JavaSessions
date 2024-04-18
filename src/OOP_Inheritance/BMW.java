package OOP_Inheritance;

public class BMW extends Car {

	int maxSpeed = 200;

	static int price = 5000;
	
	final int minSpeed = 50;


	// method overridding: poly+morphism(Run time - dynamic binding)
	// when you have a method in parent class and the same method in child class
	// also
	// with the same name
	// with the same number of parameters,
	// same type of params
	// same sequence of the parameters
	// same return type

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	@Override
	public void billing() {
		System.out.println("BMW - billing");
	}

	// static method can not be overridden
	// method hiding
	public static void carDisplay() {
		System.out.println("BMW -- display");
	}

	// private method can not be overridden
	private void show() {
		System.out.println("BMW --- show");
	}

	
	
	

}
