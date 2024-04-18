package OOP_Encapsulation;

public class LoginPage {

	private String userName;
	private String password;
	
	// setter
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String userName) {
		if (isValidUserName(userName)) {
			System.out.println("user enters un: " + userName);
			System.out.println("user enters pwd: " + password);
			System.out.println("user is logged in");
		}

	}

	private boolean isValidUserName(String userName) {
		System.out.println("checking user name is valid or not...");
		if (userName.length() >= 3) {
			System.out.println("username is valid");
			return true;
		} else {
			System.out.println("username is not valid");
			return false;
		}
	}

}
