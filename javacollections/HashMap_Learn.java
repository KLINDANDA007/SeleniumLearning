package javacollections;

import java.util.HashMap;

public class HashMap_Learn {

	public static void main(String[] args) {
		
		HashMap<Integer, String> employees = new HashMap<Integer, String>();
		
		// put() used to add elements and the first insert key and value are called  ENTRY
		employees.put(1, "Venky");
		employees.put(2, "Rukesh");
		employees.put(3, "Dinesh");
		employees.put(4, "Rajesh");
		employees.put(5, "Pavin");
		
		System.out.println("Employee list : "+ employees);
		
		// Putall() - Used to copy all the elements to new 
		HashMap<Integer, String> employer = new HashMap<Integer, String>();
		employer.putAll(employees); // Used to copy values 
		System.out.println("Copied values : "+employer);
		
		// clear() - to remove/delete values 
		employer.clear();
		System.out.println(employer);
		
		// containskey() - To check whether it has the key, if not present returns false
		System.out.println("Contains Key : "+employees.containsKey(1));
		
		// containsValue() - To check whether it has the key, if not present returns false
		System.out.println("Contains Value : "+employees.containsValue("Pavin"));
		
		// isEmpty() - checks whether the map is empty or not
		System.out.println("The map is empty  or not ? "+ employees.isEmpty());
		
		// clone() - used to clone the map
		System.out.println("The cloned map is : "+ employees.clone());
		
		// Fetch set of keys in the map (NOTE : here it's not list of keys but set of keys)
		// Because List can allow duplicate but set won't. Keys should be unique
		System.out.println("Key set is : "+ employees.keySet());
		
		// values() - used to get all the values in map
		System.out.println("Values is : "+employees.values());
		
		// Fetch the value
		System.out.println(employees.get(3));
		
		// entryset() - to get all the key with value means
		System.out.println(employees.entrySet());
		
		

	}

}
