package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = null;

		try {
			if (data == null) {
				throw new Exception("DATANOTFOUND");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
