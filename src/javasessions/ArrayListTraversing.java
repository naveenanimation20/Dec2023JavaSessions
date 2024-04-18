package javasessions;

import java.util.ArrayList;

public class ArrayListTraversing {

	public static void main(String[] args) {

		
		ArrayList<String> footerLinksList = new ArrayList<String>(30);
		//vc=30, pc=0
		
		footerLinksList.add("Login");//0
		footerLinksList.add("Register");//1
		footerLinksList.add("Forgot Pwd");//2
		footerLinksList.add("Wish List");//3
		//pc=4,vc=26
		//pc=30,vc=0
		//vc=30/2=15
		
		
		
		System.out.println(footerLinksList.size());//4

		System.out.println(footerLinksList);
		
		System.out.println(footerLinksList.get(0));
		System.out.println(footerLinksList.get(3));
		//System.out.println(footerLinksList.get(4));//IndexOutOfBoundsException - IOB
		//System.out.println(footerLinksList.get(-1));//IOB

		
		//to print all the values of arraylist: for loop:
		
		System.out.println("-----");
		//index loop:
		for(int i=0; i<=footerLinksList.size()-1; i++) {
			System.out.println(footerLinksList.get(i));
		}
		
		System.out.println("-----");
		//for each:
		for(String e : footerLinksList) {
			System.out.println(e);
		}
		
		//
		ArrayList<String> pageList = new ArrayList<String>();//vc=10
		//maintains order: order based AL
		pageList.add("Login");//0
		pageList.add("Register");//1
		pageList.add("Forgot Pwd");//2
		pageList.add("Wish List");//3 ---pc=4, vc=6
		System.out.println(pageList.size());//4

		
		//pageList.add(5, "contact us");//IOB
		
		//pageList.add(0, "Naveen");
		
		//pageList.set(2, "Naveen");
		
		pageList.remove(1);//pc=3, vc=7
		
		System.out.println(pageList.get(1));
		
		System.out.println(pageList.size());//3
		
		
		//vc=1, pc=1....vc=pc/2 = 0 --> 10
		
		
		ArrayList<String> v1 = new ArrayList<String>(10);
		
		

		
	}

}
