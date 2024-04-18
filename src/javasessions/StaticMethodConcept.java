package javasessions;

public class StaticMethodConcept {
	
	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	public void sendMail() {
		System.out.println("send mail");
	}
	
	

	public static void main(String[] args) {
		//call static var and methods:
		//1. by using class name:
		StaticMethodConcept.name = "Tom";
		System.out.println(StaticMethodConcept.name);
		
		StaticMethodConcept.getInfo();
		
		//call non static method: create the object
		StaticMethodConcept obj = new StaticMethodConcept();
		obj.age = 10;
		obj.sendMail();
		
		//2. can access static vars and methods using obj ref name, but with a warning: not recommended
		System.out.println(obj.name);
		obj.getInfo();
		
		//3. can I access static var and method directly? - without class name
		System.out.println(name);
		getInfo();
	}

}
