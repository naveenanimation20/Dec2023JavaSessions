package OOP_Inheritance;

public class Audi extends Car {

	public void theftSafety() {
		System.out.println("Audi -- theftSafety");
	}

	@Override
	public void engine() {
		System.out.println("Audi -- engine");
	}

}
