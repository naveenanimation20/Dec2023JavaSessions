package javasessions;

public class MethodChaining {

	//method overloading
//	public static void test() {
//
//	}
//
//	public static void test(int a) {
//
//	}
//	
//	public static void test(int a, String b) {
//
//	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
	}
	
	
	public static void t3() {
		System.out.println("t3 method");
		//create the object:
		MethodChaining obj1 = new MethodChaining();
		obj1.m1();
	}
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
		t1();
	}
		

	// PSVM - string[]
	public static void main(String[] args) {
		//MethodChaining.t1();
		MethodChaining obj = new MethodChaining();
		obj.m1();
		
		
		//s - s --> class name.method name/directly
		//NS -- NS --> directly
		//s - NS --> create the object
		//NS -- s --> class name.method name/directly
		
		//m -- s --> class name.method name/directly
		//m -- NS --> create the object
		

	}

}
