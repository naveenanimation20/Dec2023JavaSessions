package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

//		try {
//			Thread.sleep(5000);// CE -- checked exception
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
//
//		try {
//			FileInputStream file = new FileInputStream("/users/test.xml");// CE
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}

		try {

			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "Naveen";// NPE -- unchecked exception - runtime

			int i = 9 / 0;// AE
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");

		} catch (ArithmeticException e) {
			//reporting/custom log
			System.out.println("AE exception is coming....");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("NPE exception is coming....");
			e.printStackTrace();
		} 
//		catch (Exception e) {
//			System.out.println("exception is coming....");
//			e.printStackTrace();
//		}

		System.out.println("bye!");

	}

}
