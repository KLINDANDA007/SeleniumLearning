package javalearning;

import java.util.Scanner;

public class Data_printing_with_int {

	public static void main(String[] args) {
		
		Scanner kling = new Scanner(System.in);
		
		int age = kling.nextInt();
		kling.nextLine();
		String name = kling.nextLine();
		
		System.out.println("YOUR AGE IS "+ (age+age));
		System.out.println("YOUR NAME IS "+ name + " FLEMMINGG");

	}

}
