package WebDriver_Arch;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("Firefox is launched");
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("launch url : " + url);
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public String getURL() {
		return "https://www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("click on element : " + eleName);
	}

	@Override
	public void sendKeys(String eleName, String value) {
		System.out.println("entering value in : " + eleName + " value " + value);
	}

	@Override
	public void close() {
		System.out.println("browser is clsoed");
	}

	@Override
	public void findElement(String eleName) {
		System.out.println("find element : " + eleName);
	}

	@Override
	public void findElements() {
		System.out.println("find elements on the page");
	}
	

}
