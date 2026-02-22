package javalearning;

public class Function_multiply {
	
	int apple_price = 20;
	int apple_count = 5;
	
     void total_money()
	{
		System.out.println(apple_price*apple_count);
	}

	public static void main(String[] args) {
		
		Function_multiply kling = new Function_multiply();
		
		kling.total_money();

	}

}
