package pattern;

// Print left to right side triangle decrement downward

public class Pattern_2 {

	public static void main(String[] args) {
			
		for(int i=1;i<=5;i++)
		{			
			for(int j=1;j<=5;j++)  // everytime 5 times loop will print dependending on condition
			{
				if(i<=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println();
		}
	}

}


