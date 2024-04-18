package javasessions;

public class User {

	//category - blueprint - class -- prototype, template
	//instance -- object
	//Human -- class --properties: name, eyes, address, nose, height
	//Laptop -- class: name, size, color, price
	
	//class variables : data member
	String name;
	int age;
	String city;
	String telephone;
	double salary;
	boolean isActive;
	
	
	
	public static void main(String[] args) {
		

		//create the object of the class: using new keyword
		User u1 = new User();
		
		//User: class
		//u1 --> object reference name
		//new User(); --> Object
		
		u1.name = "Gunel";
		u1.age = 30;
		u1.city = "Bangalore";
		u1.telephone = "9876543212";
		u1.salary = 12.33;
		u1.isActive = true;
		
		System.out.println(u1.name);
		System.out.println(u1.isActive);
		
		
		User u2 = new User();
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.city);
		System.out.println(u2.salary);
		System.out.println(u2.isActive);
		
		User u3 = new User();
		u3.name = "Devika";
		u3.salary = 64.55;
		u3.isActive = true;
		
		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.city);
		System.out.println(u3.salary);
		System.out.println(u3.isActive);
		System.out.println(u3.telephone);
		
		
		System.out.println(u3);
		
		//no reference object
		new User().name = "Tom";
		new User().age = 40;
		
		//null reference object
		User u4 = new User();
		u4 = null;
		//u4.name = "Naveen";//null.name -- NullPointerException -- NPE
		
		u4 = new User();
		
		u4.name = "Tom";
		System.out.println(u4.name);
		
		
		
		System.gc();//this method will call gc -- there is no gurantee

				
		
	}

}
