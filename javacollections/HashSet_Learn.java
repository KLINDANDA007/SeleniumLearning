package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Learn {

	public static void main(String[] args) {
		
		HashSet<String> colony = new HashSet<String>();
		
		colony.add("A");
		colony.add("B");
		colony.add("C");
		colony.add("D");
		colony.add("E");
		colony.add("A"); // if a value already present & tries to add again will not add
		colony.add(null);
		colony.add("Arise");
		
		// We have no control of the insert order
		System.out.println("Contents of Hashset : "+ colony);
		
		// remove element in
		colony.remove(null);
		System.out.println("Contents of Hashset : "+ colony);
		
		// Checks whether a element present or not
		System.out.println("Does the set contains : "+ colony.contains("A"));
		
		System.out.println("Size of the colony is : "+ colony.size());
		
		System.out.println();
		
		Iterator<String> iterator = colony.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
