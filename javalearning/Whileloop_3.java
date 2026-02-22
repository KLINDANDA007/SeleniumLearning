package javalearning;

import  java.util.Random;

public class Whileloop_3 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int number = 0;
		
		while(number!=5) // number 0 is not equals to 5 comparing the values of count and 5
		{
			number = rand.nextInt(11); // randomly get values between 11 so 0 to 10 will print
			System.out.println(number);
		}

	}

}
