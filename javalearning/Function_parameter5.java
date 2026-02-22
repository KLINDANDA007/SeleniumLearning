package javalearning;

public class Function_parameter5 {

	void sum(int value1,int value2)
	{
		System.out.println(value1*value2); // function with two values multiplication
	}

	public static void main(String[] args) {
		
		Function_parameter5 subtract = new Function_parameter5();
		
		subtract.sum(5,15);

	}

}
