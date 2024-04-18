package BuidlerPattern;

public class LoginPage {
	
	//class vars:
	//NS
	String userName;
	String password;
	
	
	public LoginPage() {
		userName = "admin";
		password = "admin@123";
	}
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	//NS --> NS
	public void doLogin() {
		System.out.println("enter username " + userName);
		System.out.println("enter passowrd " + password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
		
		

	}
	

}
