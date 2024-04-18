package javasessions;

public class MainMethodOverloading {

	// PSVM(string[]) -- JVM
	public static void main(String[] args) {
		System.out.println("Hiii");

		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "Selenium");
		MainMethodOverloading.main("cypress", "Selenium");

	}


	public static void main(int i) {
		System.out.println("hello " + i);
	}

	public static void main(int i, String s) {
		System.out.println("naveen " + i + s);
	}

	public static void main(String i, String s) {
		System.out.println("naveen " + i + s);
	}

}
