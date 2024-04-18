package javasessions;

public class MethodOverloading {
	
	//MethodOverloading
	//Poly(many)+morphism(forms): compile time polymorphism (static binding)

	public void search(int a) {
		System.out.println(a);
	}

	public void search(int price, String color) {

	}

	public void search(int price, String color, String name) {

	}

	
	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.search(10);//call by value/argument
		
		
		
	}

}
