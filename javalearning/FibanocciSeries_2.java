package javalearning;

public class FibanocciSeries_2 {

	public static void main(String[] args) {
		
		int a = 5; // find fibanocci numbers between 100 from 5,8 and etc., 
		
		int b = 8;
		
		int sum = 0;
		
		int count = 0;
		
		System.out.println(a); // prints the a
		
		System.out.println(b); // prints the b
		
		for(int i=1;i<=5;i++)
		{
			sum = a+b; // adds the a and b and stores in sum
			
			System.out.println(sum); // prints the sum value
			
			a = b; // assign a value as b
			
			b = sum; // assign b value as sum
			
			count = count + 1; // calls count and add count value with 1 
			
		}
		
		System.out.println("The total count is " +count); // prints the count

	}

}
