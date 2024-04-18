package ExceptionHandling;

public class AppTest {
	
	public static void main(String a[]) {
		
		String browser = "ie";
		
		if(browser.equals("chrome")) {
			System.out.println("open chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("open ff");
		}
		else if(browser.equals("safari")) {
			System.out.println("open safari");
		}
		else {
			System.out.println("plz pass the right browser...");
			throw new MyException("WRONGBROWSEREXCEPTION");
		}
		
		System.out.println("launch URL");
		
	}
	
	
	

}
