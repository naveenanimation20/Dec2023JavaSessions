package StringManipulation;

public class StringLiteralsConstantPool {

	public static void main(String[] args) {

		String tr = "Hello";//immutable - can not be changed
		tr.concat("selenium");//HelloSelenium
		System.out.println(tr);//Hello
		
		//
		//String literals
		String s1 = "Hello";//1 - scp
		String s2 = "Hello";//0 
		
		//
		String s3 = new String("world");//1-heap, 1-scp
		
		String s4 = "world";//SCP
		String s5 = "Hello";
		
		String s6 = new String("selenium");//1-heap, 1-scp
		String s7 = "selenium";
		String s8 = new String("selenium");//1 heap

		System.out.println(s1==s2);//scp==scp -- true
		System.out.println(s4==s3);//scp==heap -- false
		System.out.println(s6==s8);//heap == heap -- false
		
		System.out.println(s6.equals(s8));//true
		System.out.println(s4.equals(s3));//true
		
		//
		String obj = new String("testing");//1-heap, 1-scp = 2
		String ob = new String("testing");//1-heap, scp=0
		System.out.println(obj==ob);//false
		System.out.println(obj.equals(ob));//true
		
		String o = "Testing";
		String p = "testing";
		String q = "testing";
		System.out.println(obj==o);//false
		System.out.println(o==p);//false
		System.out.println(p==q);//true
		System.out.println(obj.equals(p));
		System.out.println(obj.equals(o));//false
		System.out.println(obj.equalsIgnoreCase(o));//true
		
		

		
	}

}
