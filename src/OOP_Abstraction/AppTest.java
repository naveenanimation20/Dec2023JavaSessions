package OOP_Abstraction;

public class AppTest {

	public static void main(String[] args) {

		
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.pageLoadingTime();
		lp.doLogin("admin", "admin");
		Page.displayLogo();
		lp.footers();
		
		System.out.println("--------");
		
		//top casting:
		//child class object can be referred by parent abs.. class ref variable
		
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.pageLoadingTime();
		pg.footers();
		
		//down casting: NA
		
		
		
	}

}
