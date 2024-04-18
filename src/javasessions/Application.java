package javasessions;

public class Application {

	// duplicate methods are not allowed

	// method overloading:
	// when you have different methods:
	// 1. with the same name
	// 2. with different parameters (diff number of params) and diff type of params
	// 3. with the different sequence of the parameters in case of same number of
	// params
	// 4. return type doesn't matter

	public void test(String n) { // 1 param

	}

	public void test(String n, int p, int a) { // 1 param

	}

	public int test(int i) { // 1 param
		return 100;
	}

	public String test(double i) { // 1 param
		return "testing";
	}

	public void test(int l, String k) { // 2 params

	}

	public void test(String k, int l) { // 2 params

	}

	// ecomm app:
	public void login(String un) {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String role) {

	}

	//
	// search
	public void doSearch(String name) {

	}

	public void doSearch(String name, String color) {

	}

	public void doSearch(String name, String color, int price) {

	}

	// payment:
	public void makePayment(String paymentMethod) {

		switch (paymentMethod) {
		case "upi":

			break;

		case "paypal":

			break;

		default:
			break;
		}
	}

	public void makePayment(String cc, int cvv, int otp) {

	}

	// uber:
	public void booking(String st, String end) {

	}

	public void booking(String st, String end, String carType) {

	}

	public void booking(String st, String end, String carType, String paymentMethod) {

	}



	// caller / user method:
	public static void main(String[] args) {

		Application obj = new Application();
		obj.test(10);

		obj.login("admin", "admin");

	}

}
