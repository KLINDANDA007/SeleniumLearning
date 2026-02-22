package javalearning;

import java.util.Scanner;

public class Array_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] a = new int[size];
		
		for (int i=0;i<=size-1;i=i+1)
		{
			a[i] = scan.nextInt();
		}
		
	}

}
