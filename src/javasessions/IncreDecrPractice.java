package javasessions;

public class IncreDecrPractice {

	public static void main(String[] args) {

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);// 13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

//		int i = 0;
//		int j = i++ - --i + ++i - i--;
//		System.out.println(j);

//		boolean b1 = true;
//		b1++;
//		System.out.println(b1);

		int i = 19, j = 29, k=0;
		int m = i-- - j-- - k--;
		
		System.out.println("i=" + i);

		System.out.println("j=" + j);

		System.out.println("k=" + k);
		
		System.out.println(m);
		
		float f1 = 1.1f;
		float f2 = f1++;
		System.out.println(f1);//2.1
		System.out.println(f2);//1.1
		
		int ch = 'a';//97
		System.out.println((char)++ch);//98-->b
		
		int s1 = 11;
		int s2 = s1++;
		
		char ch1 = 97;
		
		
	}

}
