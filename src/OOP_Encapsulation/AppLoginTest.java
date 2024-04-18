package OOP_Encapsulation;


public class AppLoginTest {

	public static void main(String[] args) {

		//reg page: first time
		LoginPage lp = new LoginPage("sameer", "sameer@123");		
		lp.doLogin(lp.getUserName());
		
		
		lp.setPassword("sameer@456");
		
		lp.doLogin(lp.getUserName());
		
		
		Utility.checkBrowserVersion();
		
		
		
	}

}
