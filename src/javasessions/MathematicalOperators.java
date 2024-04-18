package javasessions;

public class MathematicalOperators {

	public static void main(String[] args) {

		System.out.println(10/2);
		System.out.println(9/2);//4.5--> 4
		System.out.println(9/2.0f);
		System.out.println(9.0/2);
		System.out.println(9/2f);
		System.out.println(9.0/2.0);
		
		System.out.println(12.36/4);
		
		//System.out.println(9/0);//AE
				
		System.out.println(0/9);//0
		System.out.println(0/12.33);//0.0

		//System.out.println(0/0);//ArithmeticException: / by zero
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		
		System.out.println(0.0/0.0);//NaN - Not a number
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		
		//System.out.println(0/0);//AE
		
		System.out.println('a'/'a');
		//System.out.println('a' / 0);//97/0 = AE
		
		System.out.println(0 / 'a');
		
		System.out.println(10 % 2);
		System.out.println(9 % 2);
		System.out.println(100 % 5);
		System.out.println(100 % 3);
		System.out.println(17 % 3);
		
		System.out.println(9.2 % 2);
		
		System.out.println(0 % 10);
		//System.out.println(10 % 0);//AE
		
		System.out.println(2 % 10);
		System.out.println(5 % 10);
		System.out.println(7 % 10);
		
		System.out.println("Hi I love \"Java\" coding");
		//Hi I love "Java" coding
		
		System.out.println("Hi I love 'Java' coding");

		//-128 to 127 --> 128+127+1=256
		byte b1 = 100;
		byte b2 = 20;
		
		int b3 = b1+b2;
		System.out.println(b3);
		
		short v1 = 1000;
		short v2 = 2000;
		
		int v3 = v1+v2;
		
		byte b4 = (byte) 300;
		System.out.println(b4);
		
		int l = 1000;
		int f = 2000;
		int total = l+f;
		
		
		byte j = 'a';//97
        System.out.println(j);
        
        
        System.out.println(0.1+0.1);
        System.out.println(0.1+0.2);
        
        
        float w1 = 12.33f;
        float w2 = 12.44f;
        float w3 = w1+w2;
        
        System.out.println("hi I love " + "Java " + "coding");
        
        
		
				
	}

}
