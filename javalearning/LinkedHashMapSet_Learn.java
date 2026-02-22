package javalearning;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapSet_Learn {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> heros = new LinkedHashMap<String, String>();

		heros.put("Iron Man", "Tony Stark");
		heros.put("Bat Man", "Bruce Wanye");
		heros.put("Super Man", "Clark");
		heros.put(null, null);
		heros.put(null, null);
		heros.put("Cyborge", null);
		
		System.out.println(heros);
		
		System.out.println();
		
		
		HashMap<String, String> superhero = new HashMap<String, String>();
		
		superhero.put("Iron Man", "Tony Stark");
		superhero.put("Bat Man", "Bruce Wanye");
		superhero.put("Super Man", "Clark");
		superhero.put(null, "Clark");
		superhero.put("He", null);
		superhero.put("She", null);
		
		System.out.println(superhero);
		

	}

}
