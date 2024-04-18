package MapConcept;

import java.util.LinkedHashMap;

public class LinkedHashMapConcept {

	public static void main(String[] args) {

		//it maintains the insertion order
		LinkedHashMap<String, String> empData = new LinkedHashMap<String, String>();

		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");

		
		System.out.println(empData);
		
		
		
	}

}
