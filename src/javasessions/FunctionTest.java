package javasessions;

import java.util.ArrayList;

public class FunctionTest {

	// PSVM(String a[])

	// WAF: function Name: getStudentMarks
	// input Param: studenName (String)
	// return: marks (int)
	// student not found --> return something

	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);

		int marks = -1;
		if (studentName.trim().equalsIgnoreCase("devika")) {
			// return 90;
			marks = 90;
		} 
		else if (studentName.equalsIgnoreCase("ravi")) {
			// return 95;
			marks = 95;
		} 
		else if (studentName.equalsIgnoreCase("naveen")) {
			// return 10;
			marks = 10;
		} 
		else {

			System.out.println("student name not found...plz pass the right student name " + studentName);
			// return -1;
		}

		return marks;

	}

	public int getMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);

		switch (studentName.toLowerCase().trim()) {
		case "devika":
			return 95;
		case "ravi":
			return 90;
		case "naveen":
			return 10;

		default:
			System.out.println("student name not found...plz pass the right student name " + studentName);
			return -1;
		}

	}

	// WAF: launchBrowser (name)
	// input param: String browserName
	// return: true/false (boolean)

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name : " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched");
			return true;
		case "firefox":
			System.out.println("firefox is launched");
			return true;
		case "edge":
			System.out.println("edge is launched");
			return true;

		default:
			System.out.println("plz pass the right browser...." + browserName);
			return false;
		}
	}

	// WAF:
	// function name: getDevicesList
	// input param: empName
	// return: ArrayList<String> devicesList

	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting devices list for emp: " + empName);

		ArrayList<String> devicesList = new ArrayList<String>();// vc=10,pc=0

		switch (empName.toLowerCase().trim()) {
		case "pallavi":
			devicesList.add("Macbook Pro");
			devicesList.add("Macbook Air");
			devicesList.add("iPhone");
			break;

		case "sudheer":
			devicesList.add("Windows Lenovo");
			devicesList.add("Samsung s10");
			break;

		case "saida":
			devicesList.add("Airtel SIM");
			break;

		default:
			System.out.println("plz pass the right emp name....emp name not found...." + empName);
			break;
		}
		
		return devicesList;
	}

	public static void main(String args[]) {

		FunctionTest obj = new FunctionTest();
		int m1 = obj.getMarks("devika");
		System.out.println(m1);

		if (m1 == -1) {
			System.out.println("no need to print the marksheet");
		} else {
			System.out.println("print marksheet");
		}

		boolean isLaunched = obj.launchBrowser("ie");
		System.out.println(isLaunched);
		if (isLaunched) {
			System.out.println("enter the URL");
		}
		
		ArrayList<String> actDevList = obj.getDevicesList("naveen");
		System.out.println(actDevList);
		System.out.println(actDevList.size());
		
		
		
		
	}

}
