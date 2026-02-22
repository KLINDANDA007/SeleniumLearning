package assignmentquestions;

import java.util.Arrays;

public class Sortoutandlengtth_Array {

public static void main(String[] args) {
		
		int [] num = {36,77,12,22,10,9,33,18,99,45,66,44};
		
		int length = num.length; // gets the length of a given array / number of items in array 
		
		//System.out.println(length);
		
		
		Arrays.sort(num); // Used to sort out array
		
		
		for(int i=0;i<length;i++)
		{
			System.out.println(num[i]); // prints sorted value in ascending order
		}
		
		System.out.println();
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.println(num[i]); // prints sorted value in descending order
		}
	}

}
