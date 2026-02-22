package javalearning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		int a = scan.nextInt();
		int b = 10/0;
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		catch(InputMismatchException e) {
			System.out.println("Exception handled "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic "+e);
		}
		
		System.out.println("Program Excecuted Sucessfully");
		
	}

}
