package javasessions;

public class ANDOROperators {

	public static void main(String[] args) {

		
		boolean c1 = false;
		boolean c2 = false;
		boolean c3 = false;
		boolean c4 = false;
		
		//short circuit reason: true
//		if (c1 || c2 || c3 || c4) { 
//		    System.out.println("selenium");
//		}
//		else {
//			System.out.println("Bye");
//		}
		
//		if (c1 | c2 | c3 | c4) { //f | f | f | f ==>f
//		    System.out.println("selenium");
//		}

		//short circuit reason: false
//		if (c1 && c2 && c3 && c4) {//f
//		    System.out.println("selenium");
//		}
		
		if (c1 & c2 & c3 & c4) {//f & f & f & f ==> f
		    System.out.println("selenium");
		}
		
		
		
		
		
		
		
		//if(isDisplayed & isDisabled & isClickable){ //t & f & f ==> false
			
		//}
		//print / log --> 
		
		

		
		
	}

}
