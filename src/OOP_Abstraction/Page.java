package OOP_Abstraction;

public abstract class Page{
	
	public Page() {
		this(20);
		System.out.println("Page -- const...");
	}
	
	public Page(int i) {
		System.out.println("Page -- const..." + i);
	}
	
	
	//we can not create the object of abstract class
	//we can have abs.. methods and non abs.. methods
	//no default methods allowed in abs.. class
	//abs class can have only non abs methods also
	//can we create the constructor of the abs.. class?? - yes
	
	
	//no abs.. methods -- 0% abstraction
	//only abs... methods -- 100% abstraction
	//abs + non abs methods -- partial abstraction
	//0 to 100% abstraction
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadingTime() {
		System.out.println("page -- loading time - 20 secs");
	}

	public static void displayLogo() {
		System.out.println("Page -- display logo");
	}
	
	public final void footers() {
		System.out.println("Page -- footers");
	}
	
	
	
	

}
