package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {

	// can not create a function/method inside a function
	// functions are parallel to each other
	// but can call a function from another function
	// NS functions -- data members of the class

	// 1st: function: no input and no return
	// input: no input - 0 parameter
	// return: void -- can not return anything
	public void test() {
		System.out.println("test method");

	}
	

	// 2nd: function: some input and no return
	// return type: void
	public void getBill(int days) { // 1 parameter
		System.out.println("getting billing info");
		int finalAmount = days * 100;
		System.out.println(finalAmount);// 1000
	}

	// 3rd: function with some input and return
	// return type: int
	public int sum(int a, int b) { // 2 params functions
		System.out.println("adding two numbers");
		int s = a + b;
		return s;
	}

	// 4th: function: no input and some return:
	// return type: String
	public String getInfo() {
		System.out.println("gettin information");
		String s = "Hello App";
		return s;
	}

	// return type: boolean
	public boolean isAppExist() {
		return true;
	}

	//
	public int calculateMarks(int marks, int extraMarks, int discMarks) {
		int finalMarks = marks + extraMarks - discMarks;
		return finalMarks;
	}
	
	
	public Object[] calculateNumbers(int marks, float extraMarks, int discMarks) {
		float finalMarks = marks + extraMarks - discMarks;
		String school = "IBM";
		boolean flag = true;
		Object finalInfo[] = {school, finalMarks, flag};
		return finalInfo;
	}

	// function can not have multiple returns
	// return should be the last statement in the function
	public int testing() {
		System.out.println("testing is done");
		return 100;
	}

	public void printName() {
		System.out.println("Naveen");
		return; // blank return -- void
	}

	public void lauchURL(String url) {
		System.out.println(url);
	}

	public String[] getDevices() {
		System.out.println("getting devices");
		String devices[] = { "Macbook Pro", "iPad", "iPhone14" };
		return devices;
	}

	public ArrayList<String> getUsersList() {
		System.out.println("getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("Shiva");
		userList.add("Ravi");
		userList.add("Leena");

		return userList;
	}

	public static void main(String[] args) {

		// call a function: create a object for non static functions
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();

		obj.getBill(10);// calling function by passing value: call by value - 10: value/argument
		obj.getBill(20);// 2000

		// System.out.println(obj.sum(10, 20));
		int m = obj.sum(10, 20);
		System.out.println(m);//30

		m = obj.sum(-10, 4);//-6
		System.out.println(m);

		String mesg = obj.getInfo();
		System.out.println(mesg);

		if (obj.isAppExist()) {
			System.out.println("login to app");
		}
		

		int f1 = obj.calculateMarks(70, 10, 5);
		System.out.println(f1);

		obj.lauchURL("https://www.google.com");

		String myDevices[] = obj.getDevices();
		System.out.println(Arrays.toString(myDevices));
		System.out.println(myDevices.length);

		ArrayList<String> myList = obj.getUsersList();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("Swapna");
		System.out.println(myList);
		System.out.println(myList.size());
		
		
		Object info[] =  obj.calculateNumbers(100, 12.33f, 10);
		System.out.println(Arrays.toString(info));
	}

}
