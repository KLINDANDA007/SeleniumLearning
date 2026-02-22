package javalearning;

import java.util.LinkedList;

public class LinkedList_Learn {

	public static void main(String[] args) {
		
		LinkedList<Integer> link = new LinkedList<Integer>();
		
		link.add(2);
		link.add(3);
		link.add(4);
		link.add(4);
		
		System.out.println("The LinkedList : "+link);
		
		// Add an element in the first position
		link.addFirst(1);
		System.out.println("After adding the First element : "+link);
		
		// Add an element in the Last position
		link.addLast(5);
		System.out.println("After adding the Last element : "+link);
		
		// Get first element 
		System.out.println("The first element : "+ link.getFirst());
		
		// Get Last element 
		System.out.println("The Last element : "+ link.getLast());
		
		// Get first element value using index
		System.out.println("The first element value : "+ link.get(0));
		
		// Get element value using index of 2
		System.out.println("The element value of 2 is : "+ link.get(2));
		
		// remove the first value
		System.out.println("Remove first : "+ link.removeFirst());
		System.out.println(link);
		
		// remove the Last value
		System.out.println("Remove Last : "+ link.removeLast());
		System.out.println(link);
		
		// poll deletes first element in list
		System.out.println("Deletes First element : "+ link.poll());
		System.out.println(link);
		
		// pollLast deletes last element in list
		System.out.println("Deletes last element : "+ link.pollLast());
		System.out.println(link);
	}

}
