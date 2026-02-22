package javalearning;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int amount = scan.nextInt();
			
//			int a =10;
			
			if(amount<1) 
			{
				
			throw new ArithmeticException();
			
			}
		}
		catch(ArithmeticException e) {
			
			System.out.println("Arithmetic Exception "+e);
		}
		
		System.out.println("The program was ended");
	}

}
