package StringManipulation;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {

		//immutable
		String tr = "Hello";
		tr.concat("selenium");//HelloSelenium
		tr.concat("testing");//HelloSeleniumTesting
		System.out.println(tr);
		
		//mutable
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("selenium");
		sb.append("testing");
		System.out.println(sb);
		
	}

}
