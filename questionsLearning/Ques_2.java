package questionsLearning;

import java.util.Scanner;

public class Ques_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int income = scan.nextInt();
		
		if (income>7000)
		{
			System.out.println("Scholarship is available");
		}
		else
		{
			System.out.println("not eligible for Scholarship");
		}
	}

}
