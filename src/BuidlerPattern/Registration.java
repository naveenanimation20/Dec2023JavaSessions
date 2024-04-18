package BuidlerPattern;

public class Registration {
	
	//class vars
	String name;
	String tel;
	String pwd;
	
	
	public void userReg(String name, String tel, String pwd) {
		System.out.println("enter username  : " + name);
		System.out.println("enter phone  : " + tel);
		System.out.println("enter pwd  : " + pwd);

		this.name = name;
		this.tel = tel;
		this.pwd = pwd;

	}
	
	public void getUserInfo() {
		System.out.println(name + " " + tel + " " + pwd);
	}
	
	
	

	public static void main(String[] args) {

		Registration reg = new Registration();
		reg.userReg("Sana", "12121", "sana@123");
		reg.getUserInfo();
		
		//this keyword:
		//1. const + this
		//2. const.. calling
		//3. method + this
		//4. builder pattern ---> return this
		
	}

}
