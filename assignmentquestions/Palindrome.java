package assignmentquestions;

public class Palindrome {

	public static void main(String[] args) {
		
		String kling = "madam";
		
		String reverse ="";
		
		for(int i=kling.length()-1;i>=0;i--)
		{
			reverse = reverse+kling.charAt(i);
			
			//System.out.println(reverse);
		}
		
		if(kling.equals(reverse))
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println("The given string is not Palindrome");
		}

	}

}
