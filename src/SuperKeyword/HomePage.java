package SuperKeyword;

public class HomePage extends WebPage {

	public int speed = 50;

	public HomePage() {
		super(10);//super() should be the 1st statement of the child class const...
		System.out.println("HP -- default const...");
		super.calculateTimeOut();
		System.out.println(super.speed);
	}

	public HomePage(int i) {
		super(i+10);
		System.out.println("HP const.." + i);
	}
	
	@Override
	public void pagePanel() {
		System.out.println("home page panel");
	}
	
	
	public static void billing() {
		System.out.println("homepage -- billing");
	}
	

	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();
		System.out.println("homepage - calculateTimeOut 5");
		super.logo();//calling class logo method with super
		System.out.println(super.speed);//direct parent
		System.out.println(this.speed);//child
		
		super.pagePanel();
		
		super.billing();
		WebPage.billing();
		
		HomePage.billing();
		this.billing();//not recommended
		billing();
		
		
		super.pagePanel();
		
	}
	
	//super:
	//is used to call parent class const...it should be the first statement
	//super & this can not be together in the const...
	//is used to access parent class methods and vars
	

}

