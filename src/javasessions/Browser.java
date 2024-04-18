package javasessions;

public class Browser {
	
	String name;//class var
	
	public void m1() {
		int i = 10;//local var
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
		System.out.println("hi");
	}
	
	public void m3() {
		System.out.println("m3 method");
		//m1();
	}
	
	
//	public static void t1() {
//		System.out.println("t1 method");
//		t2();
//	}
//	
//	public static void t2() {
//		System.out.println("t2 method");
//		t3();
//	}
//	
//	
//	public static void t3() {
//		System.out.println("t3 method");
//		t1();
//	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 20;//local var
		Browser obj = new Browser();
		obj.m1();//stackoverflow
		k = k+20;
		//Browser.t1();
	


	}

}
