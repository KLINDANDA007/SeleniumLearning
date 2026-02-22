package javalearning;

public class Return {
	
	int sum(int a, int b)
	{
		//int sum = 15;
	
		int total = b-a;
		
		return total;
	}
	
	public static void main(String[] args) {
		
		Return kling = new Return();
		
		int remainder = kling.sum(20,50);
		
		System.out.println(remainder);
		

	}

}
