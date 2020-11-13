package week4Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayLists {

	public static void main(String[] args) {
		
		//#1
		List<String> employeeNames = new ArrayList <String>();
		employeeNames.add("Rob"); 
		employeeNames.add("Krystal"); 
		employeeNames.add("Tim"); 
		employeeNames.add("Kip"); 
		employeeNames.add("Val");
		
		for (String employeeName : employeeNames) {
			System.out.println(employeeName);
		}
		
		//#2
		Set<Integer> ids = new HashSet <Integer>(); 
		ids.add(123); 
		ids.add(557); 
		ids.add(886); 
		ids.add(990); 
		ids.add(828);
		
		for (Integer id : ids) {
			System.out.println(id);
		}
		
		//#3
		Map<Integer,String> employeeMap = new HashMap<Integer, String>(); 
		
		//#5
		int i =0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i++)); 
		}

		//#6
		Set<Integer> employeeKeys = employeeMap.keySet();
		for (Integer key : employeeKeys) {
			System.out.println(key + ":" + employeeMap.get(key));
		}
		
		//#7
		StringBuilder idsBuilder = new StringBuilder(); 
		
		//#8
		for(Integer id : employeeMap.keySet()) {
			idsBuilder.append(id).append("-");
		}
		
		//#9
		System.out.println(idsBuilder.toString());

		//#10
		StringBuilder namesBuilder = new StringBuilder(); 
		
		//#11
		for(String employee : employeeMap.values()) {
			namesBuilder.append(employee).append(" "); 
			
		}
		
		//#12
		System.out.println(namesBuilder);
	}

}
