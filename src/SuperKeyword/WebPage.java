package SuperKeyword;

public class WebPage extends Page{

	//public final int speed = 10;

	public WebPage() {
		System.out.println("WP -- default const...");
	}

	public WebPage(int i) {
		System.out.println("WP const.." + i);
	}

	public void calculateTimeOut() {
		System.out.println("webpage - calculateTimeOut 20");
	}

	public final void logo() {
		System.out.println("webpage -- logo");
	}
	
	public static void billing() {
		System.out.println("webpage -- billing");
	}
	
	
	@Override
	public void pagePanel() {
		super.pagePanel();
		System.out.println("web page panel");
	}

}
