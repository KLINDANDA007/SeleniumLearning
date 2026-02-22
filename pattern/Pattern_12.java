package pattern;

public class Pattern_12 {
	
	// reverse triangle from long to down and increase the same ways

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i<=j)
				{
					System.out.print(" "+j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int k=4;k>=1;k--)
		{
			if(k!=4)
			{
			for(int l=1;l<=4;l++)
			{
				if(k<=l)
				{
					System.out.print(" "+l);
				}
				else
				{
					System.out.print(" ");
				}
			}
			}
			if(k!=4)
			{
			System.out.println();
			}
			
		}

	}

}
