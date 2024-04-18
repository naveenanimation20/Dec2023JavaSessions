package javasessions;

public class MaxNumber {

	public static void main(String[] args) {

		// find out the max number...three diff numbers:

		int a = 300;
		int b = 600;
		int c = 1000;

		if (a > b && a > c) {// false &&
			System.out.println("a is greatest");
		} else if (b > c) {// false
			System.out.println("b is greatest");
		} else {
			System.out.println("c is greatest");
		}

		// && -- short circuit operator
		// || and |

		// numbers are the same

		//
		int marks = 11;
		if (marks <= 100) {

			if (marks >= 80 && marks <= 90) {// false &&
				System.out.println("Grade A");

			} else {
				if (marks >= 95) {
					System.out.println("Grade A++");
					if (marks == 100) {
						System.out.println("eligible for schorlship");
					}
				} else {

					if (marks >= 0 && marks <= 10) {// true && false
						System.out.println("FAILed");
					} else if (marks >= 11 && marks <= 30) {// true && true
						System.out.println("Grade C");
					}

				}
			}
		} else {
			System.out.println("plz pass the right marks");
		}

		//
		int salary = 60;
		if (salary <= 100 | salary <= 10 | salary <= 5) {// true or false or false = true
			System.out.println("PASS");
		}

		// && ||
		// |
		// button on the page:
		// 1. isVisible
		// 2. isEnabled
		// 3. isClickable

		// if(isVisible & isEnabled & isClickable)//T&T&F
		// ---print/log -- useful for logging purpose
		// if(isVisible && isEnabled && isClickable)//F

		// if(isVisible | isEnabled | isClickable)
		// if(isVisible || isEnabled || isClickable)

		
		

	}

}
