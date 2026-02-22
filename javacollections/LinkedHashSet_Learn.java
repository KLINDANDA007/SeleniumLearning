package javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Learn {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>();
		
		linkedhashset.add("Do");
		linkedhashset.add("What");
		linkedhashset.add("You");
		linkedhashset.add("like");
		
		System.out.println(linkedhashset);
		
		System.out.println();
		
		linkedhashset.add("Got");
		linkedhashset.add("Right");
		linkedhashset.add("?");
		
		System.out.println(linkedhashset);
		
		linkedhashset.remove("?");
		System.out.println(linkedhashset);
		
		System.out.println(linkedhashset.size());
		System.out.println(linkedhashset.isEmpty());
		
		
		System.out.println();
		
		// Using iterator
		Iterator<String> iterator = linkedhashset.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
