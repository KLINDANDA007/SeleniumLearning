package questionsLearning;

import java.util.Scanner;

public class Ques_13_add {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 number :");
		
		int a = scan.nextInt();
		
		System.out.println("Enter 2 number :");
		
		int b = scan.nextInt();
		
		for (int i=a; i<=b; i=i+1) // applying for loop condition
		{
			System.out.println(i);
		}

	}

}
