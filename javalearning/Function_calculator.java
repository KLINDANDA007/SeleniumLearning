package javalearning;

public class Function_calculator {
	
	int add(int a, int b)
	{
		int sum = a+b;
		
		return sum;
	}
	
	double sub(double a, double b)
	{
		double result = a-b;
		
		return result;
	}
	
	double mul(double a, double b)
	{
		double result = a*b;
		
		return result;
	}
	
	int div(int a, int b)
	{
		int result = a/b;
		
		return result;
	}
	

	public static void main(String[] args) {
		
		Function_calculator calc = new Function_calculator();
		
		int sum =calc.add(12, 12);
		
		System.out.println(sum);
		
		double subtraction = calc.sub(12.77, 2.33);
		
		System.out.println(subtraction);
		
		System.out.println(calc.mul(12.77, 12.33));
		
		System.out.println(calc.div(122, 2));

	}

}
