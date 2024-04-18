package MapConcept;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {

		TreeMap<String, String> empData = new TreeMap<String, String>(Collections.reverseOrder());

		empData.put("Tom", "SDET1");
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put("Amit", "SDET5");
//		empData.put("arpit", "SDET6");
//		empData.put("ravi", "SDET6");
//		empData.put("1", "SDET7");
//		empData.put("2", "SDET8");
//		empData.put("$", "SDET8");
		//empData.put(null, "SDET Manager");//null key is not allowed
		empData.put("selenium", null);


		//System.out.println(empData);
		//k,v--set (entryset)
		for(Map.Entry<String, String> naveen : empData.entrySet()) {
			System.out.println(naveen.getKey() + ":" + naveen.getValue());
		}

		System.out.println("----");
		
		empData.forEach((k,v) -> System.out.println(k+":"+v));
		

		//streams + lambda - JDK 8 -- Selenium
		
	}

}
