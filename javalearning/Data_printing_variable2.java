package javalearning;

import  java.util.Scanner;

public class Data_printing_variable2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.nextLine();
		double score = scan.nextDouble();
	    scan.nextLine();
		String department = scan.nextLine();
		
		System.out.println("MY NAME IS "+name);
		System.out.println("YOUR SCORE IS "+ score/10 +"/10");
		System.out.println("YOUR DEPARTMENT IS "+ department);

	}

}
