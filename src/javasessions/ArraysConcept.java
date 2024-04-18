package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		//Array: non primitive data type
		//can store similar kind of data types 
		
		//two major limitations:
		//1. size is fixed: Static Array
		//2. it can store only similar type of data: you can use Object array to solve this problem
		
		
		//1. using new keyword:
		int i[] = new int[4];//0-3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//AIOB
		
		
		System.out.println(i.length);//4
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException - AIOB
		//System.out.println(i[-1]);//AIOB
		
		System.out.println(i);//address of the array -- random string
		System.out.println(Arrays.toString(i));
		
		//print the value from the array: for loop:
		for(int k=0; k<=3; k++) {
			System.out.println(i[k]);//10 20 30 40
				if(i[k] == 20) {
					System.out.println("Hi");
					break;
				}
				System.out.println("Bye");
		}
		
		//
		short sh[] = new short[3];//0 to 2
		System.out.println("length = " + sh.length);
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (sh.length-1));

		System.out.println(Arrays.toString(sh));
		sh[0] = 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 30;
		System.out.println(Arrays.toString(sh));
		sh[1] = 40;
		System.out.println(Arrays.toString(sh));
		
		for(int p=0; p<sh.length; p++) {
			System.out.println(sh[p]);//10 40 30
		}
		
		
		//char array:
		char ch[] = new char[4];//0-2
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 100;
		
		System.out.println(ch[3]);
		System.out.println(Arrays.toString(ch));
		
		//float array:
		float fh[] = new float[2];
		fh[0] = 12.33f;
		fh[1] = 100;
		System.out.println(Arrays.toString(fh));
		
		//emp data: name(String), age(int), salary(double), gender(char), isPermanent(boolean):
		//Object Array: it can store any kind of data types
		
		Object empData[] = new Object[5];
		empData[0] = "Shilpa";
		empData[1] = 30;
		empData[2] = 25.55;
		empData[3] = 'f';
		empData[4] = true;
		
		System.out.println(Arrays.toString(empData));
		
		System.out.println(empData.length);
		
		
		Object empData1[] = new Object[5];
		empData1[0] = "Ravi";
		empData1[1] = 35;
		empData1[2] = 25.55f;
		empData1[3] = 'm';
		empData1[4] = false;
		System.out.println(Arrays.toString(empData1));

		
		//String array:
		String product[] = new String[3];
		product[0] = "Macbook pro";
		product[1] = "Macbook Air";
		product[2] = "iPad";

		for(int x=0; x<=product.length-1; x++ ) {
			System.out.println(product[x]);
				if(product[x].equals("Macbook Air")) {
					System.out.println("Out of stock");
					break;
				}
		}
		
		//
		for(int y=product.length-1; y>=0; y--) {
			System.out.println(product[y]);
		}
		
		
		//booking uber: 100 cab[100] -->  
		//ecomm -- users reg --> new customers ---> 
		//static array:
		//bookmyshow.com --> Animal -- 200 seats --> 
		//flight booking --> 300 seats -- 
		//month array --> 0 to 11 -- 12
		//emp drop down --> dynamic 
		
		
		String cars[] = new String[3];
		System.out.println(Arrays.toString(cars));

		for(int z=0; z<=cars.length-1; z++) {
			cars[z] = "Naveen";
		}
		System.out.println(Arrays.toString(cars));

		
		
		
	}

}
