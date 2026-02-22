package javalearning;

import java.util.Scanner;

public class Data_printing_variable {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = a*b*c;
		int e = a+b+c;

		System.out.println(d);
		System.out.println(e);
		System.out.println(d/e);

	}

}
