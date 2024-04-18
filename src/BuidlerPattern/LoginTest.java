package BuidlerPattern;

public class LoginTest {

	public static void main(String[] args) {

		LoginPage user1 = new LoginPage("hima", "hima@123");
		
		user1.doLogin();
		
		LoginPage user2 = new LoginPage();
		user2.doLogin();
		
		
	}

}
