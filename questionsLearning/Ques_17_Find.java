package questionsLearning;

import java.util.Scanner;

public class Ques_17_Find { // Finding odd or even using function and getting input from user

	void oddoreven(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		Ques_17_Find kling = new Ques_17_Find();
		
		kling.oddoreven(number);
		
		
	}

}
