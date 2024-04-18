package OOP_Inheritance;

public class Car extends Vehicle {
	
	//final class -- can not be a parent -- can not be inherited
	//final methods -- can not be overridden but can be inherited
	//final var: constant var -- value can not be changed
	
	

	int maxSpeed = 100;
	
	static int price = 1000;
	
	final static int minSpeed = 10;

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}

	@Override
	public void billing() {
		System.out.println("Car - billing");
	}
	
	
	public static void carDisplay() {
		System.out.println("Car -- display");
	}
	
	private void show() {
		System.out.println("car --- show");
	}
	
	public void showCar() {
		show();
	}
	
	
	
	public final void RunFourWheels() {
		System.out.println("car -- run four wheels");
	}
	
	public static final void loadCar() {
		System.out.println("car -- run four wheels");
	}
	
	

	

}
