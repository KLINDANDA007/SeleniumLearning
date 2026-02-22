package javalearning;

public class Function_parameter {
	
	void chocolate(int money)
	{
		System.out.println(money);
		System.out.println("Chocolate is purchased");
	}
	
	void powder(int money)
	{
		System.out.println(money);
		System.out.println("Powder is purchased");
	}

	public static void main(String[] args) {
		
		Function_parameter grocery = new Function_parameter();
		
		grocery.chocolate(25);
		
		grocery.powder(55);

	}

}
