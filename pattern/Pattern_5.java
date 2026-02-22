package pattern;

// print numbers with left to rightside trinangle with numbers increment

public class Pattern_5 {

	public static void main(String[] args) {
		
		int z=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(z+" ");
				z++;
			}
			System.out.println();
		}
	}

}
