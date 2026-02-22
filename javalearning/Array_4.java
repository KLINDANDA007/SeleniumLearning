package javalearning;

public class Array_4 {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,22,33,5,54,54,35,75};
		
		for(int i=0;i<10;i=i+1) // prints forward
		{
			System.out.println(a[i]);
		}
		
		System.out.println();
		
		for(int i=9;i>=0;i=i-1) // prints backward
		{
			System.out.println(a[i]);
		}
	}
	
}
