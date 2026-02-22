package javalearning;

public class FibanocciSeries {

	public static void main(String[] args) {
		
		int num1 = 0; // prints the first ten fibanocci values 0,1,1,3,..
		
		int num2 = 1;
		
		int sum = 0;
		
		System.out.println(num1);
		
		System.out.println(num2);
		
		for(int i=1;i<=8;i++)
		{
			sum = num1+num2;
			
			System.out.println(sum);
			
			num1 = num2; // num1 =1
			
			num2 = sum; // num2 = 1
		}

	}

}
