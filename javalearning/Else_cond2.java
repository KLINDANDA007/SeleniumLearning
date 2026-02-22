package javalearning;

import java.util.Scanner;

public class Else_cond2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1==num2)
		
		{
			System.out.println("BOTH THE NUMBERS ARE EQUAL");
		}
		else
		{
			System.out.println("BOTH THE NUMBERS ARE NOT EQUAL");
		}
		
	}

}
