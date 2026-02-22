package javalearning;

public class Factorial {

	public static void main(String[] args) {
		
		int fact =1; // declare variable fact as 1
		
		for(int i=1;i<=5;i++)
		{
			fact = fact *i; // loop multiplies and stores value in fact 
		}
		
		System.out.println(fact); // call fact value
	}

}
