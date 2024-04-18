package BuidlerPattern;

//caller class
public class AppTest {

	//called method/user
	public static void main(String[] args) {

		EcommApplication app = new EcommApplication();
		
		
		app.login("naveen", "naveen123")
				.search("Apple Macbook Pro")
					.addToCart("Apple Macbook Pro")
						.payment("7171 8787 8888 9999", 123)
							.getOrderId()
								.logout();
				
		System.out.println("-----");
		//
		app.login("naveen", "naveen123")
				.search("tshirt", "black")
					.logout();
		
		System.out.println("-----");
		app.login("vendor", "vendor123")
			.search("samsung", "white", 1000)
				.addToCart("samsung")
					.payment("121212121@hdfc")
						.getOrderId()
								.logout();
		
		System.out.println("-----");
		app.login("naveen", "naveen123")
					.logout();
		
		System.out.println("-----");

		app.login("naveen", "naveen123");
		
		System.out.println("-----");

		app.logout();
		
		System.out.println("-----");

		app.login("naveen", "naveen123")
				.search("Apple Macbook Pro")
					.search("Iphone 14")
						.search("HP laptop", "white")
								.logout();
		
		
		System.out.println("-----");
		
		EcommApplication obj = app.login("naveen", "naveen123").search("Apple Macbook Pro");
				
		EcommApplication obj1 = obj.search("iph");
		
		

		
	}

}
