package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Learn {

	public static void main(String[] args) {
		
		ArrayList <String> arr = new ArrayList<String>();
		
		arr.add("Supra");
		arr.add("BMW");
		arr.add("Ferrari");
		arr.add("Ferrari");
		arr.add("Porche");
		
		System.out.println(arr); // used to print the Arraylist elements
		
		
		System.out.println(arr.get(0)); // used to get the index value of 0 in a arraylist
		System.out.println(arr.indexOf("Ferrari")); // used to find the index value of element
		System.out.println(arr.lastIndexOf("Ferrari")); // used to find the lastindex value of element
		
		
		
		ArrayList <String> another = new ArrayList<String>();  // created new Arraylist
		another.addAll(arr); // addAll used to add all the elements from one another
		
		System.out.println(another);
		
		another.clear(); // used to clear all the elements in another list
		System.out.println(another);
		
		arr.remove(0); //  used to remove the elements in a arr list by index
		System.out.println(arr);
		
		arr.remove("Ferrari"); //  used to remove the elements in a arr list by name
		System.out.println(arr);
		
		arr.add(null); // used to add null values in list
		System.out.println(arr);
		
		arr.set(0, "Renault"); // used to update the index of 0 value as renault
		System.out.println(arr);
		
		arr.add(1, "BMW"); // used to add a element at index of 1 in arr
		System.out.println(arr);
		
		System.out.println(arr.isEmpty()); // used to print the list is empty or not as boolean
		
		//Iterate using for each 
		
		for (String string : arr) {
			System.out.println("Using For each : "+string);
		}
		
		System.out.println("");
		
		//Iterate using for loop
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.println("Using for loop : "+arr.get(i));
		}
		
		System.out.println("");
		
		//Iterate using ListIterator import function and listIterator() method
		
		ListIterator<String> list_iterator = arr.listIterator();
		
		while(list_iterator.hasNext()) // forward iterates
		{
			System.out.println(list_iterator.next());
		}
		
		System.out.println("");
		
		while(list_iterator.hasPrevious()) // backward iterates
		{
			System.out.println(list_iterator.previous());
		}
		
		System.out.println("");
		
		Iterator<String> iterator = arr.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			//arr.add("TATA"); thread exception will occur
		}
		
		arr.remove(null);
		
		System.out.println();
		
		Collections.sort(arr);
		System.out.println(arr);
		
		System.out.println();
		
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);

	}

}
