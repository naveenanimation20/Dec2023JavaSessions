package MapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {

		//k,v
		HashMap<String, Integer> empMap = new HashMap<String, Integer>();
		
		
		empMap.put("Tom", 101);
		empMap.put("lisa", 200);
		
		System.out.println(empMap.size());
		
		System.out.println(empMap.get("Tom"));
		
		empMap.put("lisa", 300);

		System.out.println(empMap.get("lisa"));
		
		//non order based collection
		HashMap<String, String> empData = new HashMap<String, String>();

		empData.put("Tom", "SDET1");//k-v pair --> entryset
		empData.put("Peter", "SDET2");
		empData.put("Ravi", "SDET3");
		empData.put("Lisa", "SDET4");
		empData.put("Naveen", "SDET4");
		empData.put(null, "SDET Manager");
		empData.put(null, "SDET Director");
//		empData.put(null, null);
//		empData.put("Prateek", null);
//		empData.put("Usha", null);
		empData.put("Tom", "SDET1");
		
//		System.out.println("------");
//		String p = empData.remove("Naveen");
//		System.out.println(p);
//		
//		System.out.println("------");
//		System.out.println(empData);
		
//		boolean f = empData.remove("Lisa", "SDET4");
//		System.out.println(f);
//		System.out.println(empData);
		
		//empData.put("Ravi", "Tester");
		System.out.println(empData);
		
		
		
		
//		boolean flag = empData.containsKey("Naveen");
//		System.out.println(flag);

//		System.out.println(empData.get(null));
//		System.out.println(empData.get("Naveen"));
//		
		//System.out.println(empData);

		//null keys = 1
		//null values = multiple
		
		for(Map.Entry<String, String> entry : empData.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
//		
//		System.out.println("-----");
//		//foreach method:
//		empData.forEach((k,v) -> System.out.println(k + ":" + v));
//		
		

	}

}
