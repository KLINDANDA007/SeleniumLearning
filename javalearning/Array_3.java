package javalearning;

import java.util.Scanner;


public class Array_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[5];
				
		for(int i=0;i<=4;i=i+1)
		{
			number[i] = scan.nextInt();
		}
		for (int i=0;i<=4;i=i+1)
		{
			System.out.println(number[i]);
		}

	}

}
