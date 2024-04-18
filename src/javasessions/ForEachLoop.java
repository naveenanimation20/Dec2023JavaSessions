package javasessions;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int i[] = {10,20,30,40,10,1};
		
		//index based loop:
		for(int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("------");
		
		//for each:
		for(int e : i) {
			System.out.println(e);
		}
		
		//double array:
		double d[] = {1.1, 3.4, 9.8, 12.33};
		for(double e : d) {
			System.out.println(e);
		}
		
		//
		String product[] = {"macbook", "imac", "canon"};
		for(String s : product) {
			System.out.println(s);
			break;
		}
		
		//
		Object data[] = {"Nakul", 30, 12.33, 'm', true};
		for(Object e : data) {
			System.out.println(e);
		}
		
		
		//
		System.out.println("----------");
		int num[] = {10,20,30,40,10,1};
		//0-10
		//1-20
		
		System.out.println(num[2]);
		
		
		int count=num.length-1;//5
		for(int e : num) {
			e=count;//4
			//System.out.println(count + "-" + e);//0 - 10
			System.out.println(num[e]);//1 10
			count--;//4
		}
		
		
		//
		short sh[] = {100,200,322,344};
		for(short e : sh) {
			System.out.println(e);
		}
		
		//a-z: 
		//A-Z
		//0-9
		

		
		
		
		

	}

}
