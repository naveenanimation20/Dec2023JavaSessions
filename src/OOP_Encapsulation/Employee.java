package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private boolean isActive;

	//setter
	public Employee(String name, int age, double salary, boolean isActive) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
	}
	
	//setter
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	// public getter/setter:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
