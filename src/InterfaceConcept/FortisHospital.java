package InterfaceConcept;

//child -- parent class (1) --- parent interfaces(n)
public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical{
	
	
	int speed;

	//US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}
	

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	//UK
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
		
	}

	//India
	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH -- radiologyServices");
		
	}

	
	//FH - individual
	public void OPTServices() {
		System.out.println("FH -- OPTServices");

	}
	
	
	public void pathologyServices() {
		System.out.println("FH -- pathologyServices");

	}

	//common method
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}
	
	public static void billing() {
		System.out.println("FH - billing");
	}
	
	@Override
	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");
	}

	//WHO
	@Override
	public void covidVaccincation() {
		System.out.println("FH -- covidVaccincation");
		
	}
	

}
