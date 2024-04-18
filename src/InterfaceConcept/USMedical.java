package InterfaceConcept;

public interface USMedical extends WHO{
	
	public static final UKMedical ukmedical = null;
	
	
	int min_fee = 10;
	//interface variables are static and final by default
	
	
	//no method body is allowed -- abstract methods
	//only method declaration 
	//only method prototype
	//can not create the object of Interface
	//interface can not have buss logic
	//100% abstraction
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void pediaServices();

	public void emergencyServices();
	
	
	//after JDK 1.8, two major changes:
	
	//1. we can have static method with method body 
	
	public static void billing() {
		System.out.println("USM - billing");
	}

	//2. we can have a default method with method body:
	
	default void medicalInsurance() {
		System.out.println("USM -- medicalInsurance");
	}
	
	
	

}
