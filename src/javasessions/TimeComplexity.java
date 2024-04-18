package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC: 
		
		//larger data: 1 to 10M
		
		//BIG O -> O
		
		int i = 10; //O(1)
		System.out.println(i);//10
		//O(1) - constant time
		
		//20 secs --> 0.000001
		for(int k=1; k<=100000; k++) {
			System.out.println(k);
		}
		
		//1 + n +n + n => 3n+1 --> Linear Equation
		//3n+1 --> 3n --> n --> O(n) 
		
		int p = 0;
		while(p<10) {
			System.out.println(p);
			p++;
			System.out.println("hi");
		}
		//linear eq: 1+n+n+n+n => 4n+1 => 4n --> O(n)
		
		short sh[] = {100,200,322,344};
		for(short e : sh) {
			System.out.println(e);
			
		}
		//O(n)
		//1+n+n=> 2n+1-> 2n --> O(n)
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				System.out.println(x+""+y);
			}
		}
		
		//(1+n+n)(1+n+n+n+n)=> (1+2n)(1+3n) => 1+3n+2n+6n^2 => 6n^2+5n+1 --> Quadratic eq
		//6n^2+5n+1 --> 6n^2+5n --> n(6n+5) --> n(6n) --> 6n^2 --> O(n^2)
		
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				for(int z = 1; z<=5; z++) {
					System.out.println(x+""+y+""+z);

				}
			}
		}
		//(n)(n)(n) --> n^3
		//n^3+n^2+n+1 - cubic --> O(n^3)
		
		
	}

}
