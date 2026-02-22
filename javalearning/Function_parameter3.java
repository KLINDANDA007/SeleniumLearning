package javalearning;

public class Function_parameter3 {

	void sum(int value1,int value2)
	{
		System.out.println(value1-value2); // function with two values subtraction
	}

	public static void main(String[] args) {
		
		Function_parameter3 subtract = new Function_parameter3();
		
		subtract.sum(55,15);
		

	}

}
