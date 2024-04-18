package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("hello");

		try {
			int i = 9 / 0;
			System.out.println("selenium");
		} 
		
		catch (ArithmeticException e) {
			System.out.println("some exception is coming...");
		}
		
		finally {
			System.out.println("i am in finally block");
		}
		
		//when to use finally block?
		
		//make the connection with DB(SQL): username/pwd
		//hit the SQL: select * from Employee;
		
		//try-catch
		//String result = get the results from DB/table
		
		//finally{}
		//close the db connection
		
		//use the results in script
		
		//continue code
		//logout
		
		
		//file system:
		
		
		//final finally{} finalize()
		

	}

}


