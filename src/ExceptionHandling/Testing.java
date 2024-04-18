package ExceptionHandling;

public class Testing {

	public static void main(String[] args) {

		waitTime(3000);
		waitTime(3000);
		waitTime(3000);
		waitTime(3000);
		waitTime(10000);

	}

	public static void waitTime(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

		}
	}

}


