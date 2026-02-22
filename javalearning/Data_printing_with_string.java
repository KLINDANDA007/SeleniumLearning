package javalearning;

import java.util.Scanner;

public class Data_printing_with_string {

	public static void main(String[] args) {
	
		Scanner john = new Scanner (System.in);
		
		String name = john.nextLine();
		int age = john.nextInt();
		john.nextLine();
		String address = john.nextLine();
		
		System.out.println("YOUR NAME IS " + name);
		System.out.println("YOUR AGE IS " + (age+age));
		System.out.println("YOUR ADDRESS IS "+ address);
	}

}
