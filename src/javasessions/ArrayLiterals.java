package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		//ArrayLiterals:
		int i[] = {10,20,30,40,10,1};//0-5
		
		i[0] = 300;
		
		//iterate: O(n)
		//update/fetch: O(1) 
		//delete: O(n)
		
		System.out.println(i[0]);//300
		System.out.println(i.length);//6
		System.out.println(i[5]);
		//System.out.println(i[i.length]);//AIOB
		System.out.println(i[i.length-1]);//1
		
		char ch[] = {'a','e','i','o','u'};
		System.out.println(ch[0]);
		
		for(int k=0; k<ch.length; k++) {
			System.out.println(ch[k]);
		}
		
		String product[] = {"macbook", "imac", "canon", ""};
		System.out.println(Arrays.toString(product));
		
		//int ---> Integer
		//float ---> Float
		Object data[] = {"Nakul", 30, 12.33, 'm', true};
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
		
	}

}
