package saikeerthana;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	
		
		public static void main(String args[]){
			Employee e1 = new Employee("Siddhu", 1);
			Employee e2 = new Employee("Siddhu", 1);
			System.out.println(e1.equals(e2));
	 
			Set<Employee> hashSet = new HashSet<>();
			hashSet.add(e1);
			hashSet.add(e2);		
			System.out.println("HashSet Elements: " + hashSet);
	 
			Map<Employee, String> hashMap = new HashMap<>();
			hashMap.put(e1, "First site");
			hashMap.put(e2, "Second site");
			System.out.println("HashMap Elements: " + hashMap);
		}
		
	
}
