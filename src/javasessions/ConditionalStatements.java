package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// == >= > <= < !=
		System.out.println(x > y);

		if (x > y) {
			 System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		//
		if (true) {
			System.out.println("Hi");
		} else {// Dead code
			System.out.println("Bye");
		}

		//
		boolean flag = false;

		if (flag) {
			System.out.println("Hello");
		} else {
			System.out.println("World");
		}

		//
		int t1 = 100;
		int t2 = 100;

		if (t1 > t2) {
			System.out.println("t1 and t2 are gr than or equal");
		}

		//
		int p1 = 100;
		int p2 = 200;
		if (p1 != p2) {
			System.out.println("Selenium");
		}

		//
		
		
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome browser");
		}
		if(browser.equals("firefox")) {
			System.out.println("launch firefox browser");
		}
		if(browser.equals("edge")) {
			System.out.println("launch edge browser");
		}
		if(browser.equals("safari")) {
			System.out.println("launch safari browser");
		}
		else {
			System.out.println("plz pass the right browser....");
		}
		
		//url

//		String browser = "chrome";
//		
//		if (browser.equals("chrome")) {
//			System.out.println("launch chrome browser");
//		}
//		else if(browser.equals("firefox")) {
//			System.out.println("launch firefox browser");
//		}
//		else if(browser.equals("edge")) {
//			System.out.println("launch edge browser");
//		}
//		else if(browser.equals("safari")) {
//			System.out.println("launch safari browser");
//		}
//		else {
//			System.out.println("plz pass the right browser....");
//		}
		
	
		
	}

}
