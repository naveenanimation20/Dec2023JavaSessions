package javasessions;

public class IncrementDecrementalOperators {

	public static void main(String[] args) {

		//++ and --
		
		//1. post increment
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int g = -98;
		int h = g++;
		System.out.println(g);
		System.out.println(h);
		
		int k = 10;
		System.out.println(k++);//10
		System.out.println(k);//11
		
		//2. pre increment:
		
		int x = 1;
		int y = ++x;
		System.out.println(x);//2
		System.out.println(y);//2
		
		int p = -99;
		int q = ++p;
		System.out.println(p);//-98
		System.out.println(q);//-98
		
		int total = 10;
		System.out.println(++total);
		System.out.println(total);
		
		//3. post decrement:
		
		int u = 2;
		int r = u--;
		System.out.println(u++);
		System.out.println(r);
		
		int s1 = 10;
		System.out.println(s1--);//10
		System.out.println(s1);//9
		
		//4. pre decrement:
		int m = 2;
		int n = --m;
		System.out.println(m);
		System.out.println(n);
		
		int t1 = -999;
		int t2 = --t1;
		System.out.println(t1);
		System.out.println(t2);
		
		int m1 = 5;
		int k1 = m1++ + ++m1;
			//   	
		System.out.println(m1);
		System.out.println(k1);
		
		
		
		
	}

}
