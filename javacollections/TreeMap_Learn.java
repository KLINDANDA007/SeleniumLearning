package javacollections;

import java.util.TreeMap;

public class TreeMap_Learn {

	public static void main(String[] args) {
		
		TreeMap<String, String> places = new TreeMap<String, String>();
		
		places.put("Uthiramerur", "Kanchipuram");
		places.put("Walajabadh", "Kanchipuram");
		places.put("Magaral", "Kanchipuram");
		places.put("Uthiramerur", "Chengalpattu");
//		places.put(null, "Kanchipuram"); // Null will not allow
		
		System.out.println(places);
		
		

	}

}
