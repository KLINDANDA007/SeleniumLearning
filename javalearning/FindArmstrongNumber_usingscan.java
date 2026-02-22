package javalearning;

import java.util.Scanner;

public class FindArmstrongNumber_usingscan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int original = input;
		
		int sum = 0;
		
		int remind;
		
		while(input>0)
		{
			remind = input % 10 ;
			
			sum = sum + (remind*remind*remind);
			
			input = input / 10;
		}
		
		if(sum==original)
		{
			System.out.println("Given number is Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}

	}

}
