package javasessions;

public class StringConctenation {

	public static void main(String[] args) {

		//String - class in java
		String s = "hello world";
		String s1 = "100";
		String s2 = "a";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(x+a);//Hello100
		System.out.println(a+b+x+y);//300HelloSelenium
		System.out.println(x+y+a+b+x+y);//HelloSelenium100200HelloSelenium
		
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println(s1+s2);
		
		double d1 = 12.33;
		double d2 = 23.44;
		System.out.println(x+y+d1+d2);//HelloSelenium12.3323.44
		System.out.println(x+y+(d1+d2));//HelloSelenium35.77
		
		System.out.println(a+b+d1+d2+x+y+a+b);//335.77HelloSelenium100200
		
		char c = 'a';
		String t = "Hello";
		System.out.println(c+t);
		System.out.println(t+c+'b');//Helloab
		System.out.println('a'+""+'b'+t);//abHello
		
		System.out.println('a'+'b'+100+t);//295Hello
		
		int p = 100;
		int q = 200;
		
		System.out.println("the value of p is: " + p);
		System.out.println("the value of q is: " + q);
		System.out.println("sum of p and q is: " + (p*q));
		
		
		System.out.println('0' + 'a' + 'A' + "Hello");//48+97+65 = 210Hello
		System.out.println("Hello"+ '0' + 'a' + 'A');//Hello0aA
		
		System.out.println('0' + 'a' + 'A' + "Hello"+ '0');//210Hello0
		System.out.println(1*1*10/2+"Hello");
		
		
		
		
		
		
		
	}

}
