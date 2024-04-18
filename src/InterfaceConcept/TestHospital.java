package InterfaceConcept;


public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.physioServices();
		fh.dentalServices();
		fh.pathologyServices();
		fh.OPTServices();
		fh.emergencyServices();
		System.out.println(USMedical.min_fee);
		USMedical.billing();
		FortisHospital.billing();
		fh.covidVaccincation();
				
		
		System.out.println("------");
		
		//can not create the object of Interface
		//USMedical us = new USMedical();
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		uk.cardioServices();
		uk.dentalServices();
		uk.emergencyServices();
		
		//down casting:
		//FortisHospital fh1 = new USMedical();
		
		//interface to interface - explicit casting:
		//I1 and I2
		
		UKMedical uk1 = (UKMedical)us;
		uk1.cardioServices();
		uk1.dentalServices();
		uk1.emergencyServices();
		
	}

}
