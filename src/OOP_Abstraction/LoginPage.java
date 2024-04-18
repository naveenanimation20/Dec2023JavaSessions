package OOP_Abstraction;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Lp -- const...");
	}
	
	public LoginPage(int i) {
		System.out.println("Lp -- const..." + i);
	}
	
	

	@Override
	public void title() {
		System.out.println("LP - title");
	}

	@Override
	public void url() {
		System.out.println("LP - url");
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Login page -- loading time - 5 secs");
	}
	
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " " + pwd);
	}

	


}
