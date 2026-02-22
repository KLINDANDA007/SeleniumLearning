package javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Learn {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(17);
		treeset.add(10);
		treeset.add(7);
		treeset.add(1);
		treeset.add(5);
		treeset.add(9);
		treeset.add(14);
		treeset.add(27);
		
		System.out.println(treeset);// it will print the values in default sorted format
		
		//first() - Returns first element
		System.out.println("The first element is : "+treeset.first());
		
		//last() - Returns last element
		System.out.println("The Last element is : "+treeset.last());
		
		//headset() - Returns less than the value of given value
		System.out.println("Less than the given element : "+treeset.headSet(9));
		
		//tailset() - Returns equal and higher than the given value
		System.out.println("Equal or higher element is : "+treeset.tailSet(10));
		
		//subset() - Returns from starts with before the end element
		System.out.println("The between element from start and before is : "+treeset.subSet(7, 17));
		
		//comparator() - Returns null if the sorting is natural order
		System.out.println("Natural order or not : "+treeset.comparator());
		
		//higher() - Returns higher than the given value
		System.out.println("Higher element is : "+treeset.higher(9));
		
		//Lower() - Returns Lower than the given value
		System.out.println("Lower element is : "+treeset.lower(9));
		
		//Pollfirst() - Returns the first element and removes the element
		System.out.println("Element list is : "+treeset.pollFirst());
		System.out.println(treeset);
		
		//PollLast() - Returns the last element and removes the element
		System.out.println("Element is : "+treeset.pollLast());
		System.out.println(treeset);
		
		//desendingset  - Returns descending order for the set
		System.out.println("Descending order of elements is : "+treeset.descendingSet());
		
		Iterator<Integer> iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		Iterator<Integer> desc_iterator = treeset.descendingIterator();
		
		while(desc_iterator.hasNext())
		{
			System.out.println(desc_iterator.next());
		}

	}

}
