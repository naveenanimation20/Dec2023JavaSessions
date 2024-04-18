package constructorconcept;

public class Employee {
	// class vars
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;

	// const... name will be same as the class name
	// const.. can not return anything/no void also/no return type
	// const.. can be overloaded
	// const ... will be called when you create the object of the class
	//const.. is used for initializing the class variables with the const.. local variables using this keyword
	//const... is used to restrict the object creation - depends on the use case
	//const... is used for initialization purpose only not for buss logic
	//but function is used for buss logic, which may or may not return
	//function can be called multiple time but constructor 
	//will be called only once when object created
	

//	public Employee() { // 0 param - default const...
//		System.out.println("emp - default const....");
//	}
//
//	public Employee(int i) { // 1 param 
//		System.out.println(i);
//	}
//	
//	public Employee(int i, String s) { // 2 params 
//		System.out.println(i + s);
//	}

	public Employee(String name, int age) {
		//should be the 1st statement
		this("testing", 40, 10);
		this.name = name;
		this.age = age;
		
	}

	public Employee(String name, int age, double salary) {
		System.out.println("hiiiii");
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee(String name, int age, double salary, boolean isActive, char gender) {
		//Employee j1 = new Employee("peter", 40);
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
		
		getInfo();//no need to create the object
		Employee.setInfo();//static method calling
	}
	
	//NS
	public void getInfo() {
		System.out.println("getting info");
		printInfo();
	}
	
	//NS
	public void printInfo() {
		System.out.println("print info");
		
	}
	
	public static void setInfo() {
		System.out.println("set info");
	}
	
	

	public static void main(String[] args) {
		Employee e1 = new Employee("Tom", 30);
		
		System.out.println(e1.name);//tom
		System.out.println(e1.age);//30
		System.out.println(e1.salary);//10.0
//		
//		Employee e2 = new Employee("preet", 25, 'm');
//		System.out.println(e2.name + " " + e2.age + " "+ e2.gender + " " + e2.salary + " " + e2.isActive);
//		
//		Employee e3 = new Employee("shiv", 30, 12.33, true, 'm');
		
		

	}

}
