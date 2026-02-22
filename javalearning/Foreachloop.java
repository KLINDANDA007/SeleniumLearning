package javalearning;

public class Foreachloop {

	public static void main(String[] args) {
		
		int num[] = {12,44,39,99,50};
		
		for(int i=0;i<5;i=i+1)
		{
			System.out.println(num[i]);
		}
		
		for(int kling:num) // Assigning a variable to call a array of num calling it
		{
			System.out.println(kling);
		}
	}

}
