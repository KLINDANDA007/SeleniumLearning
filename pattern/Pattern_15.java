package pattern;

public class Pattern_15 {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		int h=1;
		for(int k=5;k>=1;k--)
		{
			if(k!=5)
			for(int l=1;l<=h;l++)
			{	
				System.out.print(" ");	
			}
			if(k!=5)
			{
			for(int l=1;l<=k;l++)
			{
					System.out.print("* ");
			 }
			}
			if(k!=5) {
			System.out.println();
			}
			
			if(k<5)
			h++;
		}

	}

}
