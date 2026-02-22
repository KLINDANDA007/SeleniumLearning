package questionsLearning;

import java.util.Scanner;

public class Ques_18_School { // Give an input value of total mark using String function printing values
	
	String passorfail(int a)
	{
		if(a>=35)
		{
			return "Pass";
		}
		else
		{
			return "Fail";
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int totalmark = scan.nextInt();
		
		Ques_18_School result = new Ques_18_School();
		
		String status = result.passorfail(totalmark);
		
		System.out.println(status);

	}

}
