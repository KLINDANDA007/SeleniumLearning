package questionsLearning;

import java.util.Scanner;

public class Ques_10_add {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String color = scan.nextLine();
		
		if(color.equals("RED"))
		{
			System.out.println("STOP");
		}
		if(color.equals("YELLOW"))
		{
			System.out.println("GET READY");
		}
		if(color.equals("GREEN"))
		{
			System.out.println("GOOD TO GO");
		}

	}

}
