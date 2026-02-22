package assignmentquestions;

import java.util.Arrays;

public class Findsecondlargestnumber_Array {

	public static void main(String[] args) {
		
		int[] sum = {99,12,33,12,44,55};
		
		Arrays.sort(sum);// here, 12,12,33,44,55,99 arranged as sequence
		
		int len = sum.length-2;
		
		//System.out.println(len); // length got as 4 so index of 4th number in sum will picked
		
		System.out.println(sum[len]); // called the sum using array len variable so 55 will be picked since its index is 4
		


	}

}
