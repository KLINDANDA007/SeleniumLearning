package assignmentquestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Integer a = 1634;

		String b = a.toString();
		
		Integer c = 0;
		
		for(int i=0;i<b.length();i++)
		{
		   Integer in = Integer.valueOf(String.valueOf(b.charAt(i)));
		   
		   Integer temp =1;
		   
		   for (int j=0;j<b.length();j++)
		   {
		       temp = temp*in;
		   }
		   
		   c = c + temp;
		   System.out.println(c);
		}
		
		System.out.println(c);
		
		if(c.equals(a))
		{
		    System.out.println("Armstrong Number");
		}
		else{
		    System.out.println("Not an Armstrong Number");
		}
	}
}