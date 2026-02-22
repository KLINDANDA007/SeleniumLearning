package javalearning;

public class Function_parameter4 {

	void sum(int value1,int value2)// here we could use float or double operator for precise output
	{
		System.out.println(value1/value2); // function with two values division
	}

	public static void main(String[] args) {
		
		Function_parameter4 subtract = new Function_parameter4();
		
		subtract.sum(55,15);

	}

}
