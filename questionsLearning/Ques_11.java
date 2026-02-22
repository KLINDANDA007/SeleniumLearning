package questionsLearning;

import java.util.Scanner;

public class Ques_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your salary amount"); // indicates the value need to enter next
		
		int salary = scan.nextInt();
		
		System.out.println("Enter your age"); // indicates the value need to enter next
		
		int age = scan.nextInt();
		
		if(salary>=20000 || age<=25)
		{
			System.out.println("Eligible for loan");
			
			System.out.println("Enter your loan amount"); // indicates the value need to enter next
			
			int loan = scan.nextInt();
			
			if(loan<=50000)
			{
				System.out.println("Your'e Eligible");
			}
		}
		else
		{
			System.out.println("Not Eligible");
		}

	}

}
