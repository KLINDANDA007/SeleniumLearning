package javalearning;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		
		int original = input;
		
		int sum = 0;
		
		int rem;
		
		
		while(input>0)
		{
			rem = input % 10; // reminder 3 will get
			//System.out.println(rem);  
			
			sum = sum + (rem*rem*rem); // 0+(3*3*3) so 27 will get
			//System.out.println(sum);
			
			input = input/10; // here 15 will get
			//System.out.println(input);
			
		}
		
		if(sum==original)
		{
			System.out.println("Given number is Armstrong Number");
		}
		else
		{
			System.out.println("Given number is not an Armstrong Number");
		}
	}

}
