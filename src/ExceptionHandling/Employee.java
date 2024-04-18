package ExceptionHandling;

public class Employee {

	// amazon -- cart()
	public void m1(int a, int b) {
		System.out.println("m1 method");
		m2(a,b);
	}

	// amazon -- payment()
	public void m2(int a, int b)  {
		System.out.println("m2 method");
		try {
			m3(a,b);
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("AE is coming...");
		}
	}

	// HDFC bank server -- method
	public void m3(int a, int b) throws ArithmeticException {
		System.out.println("m3 method");
		int i = a/b;//AE
		System.out.println("payment");
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.m1(9,0);

		System.out.println("Bye!!");

	}

}
