package javalearning;

public class This_keyword {
	
	String name;
	
	
	This_keyword()
	{
		System.out.println("HELLO");
	}
	
	void school(String name)
	{
		this.name = name;
	}

	public static void main(String[] args) {
		
		This_keyword kling = new This_keyword();
		
		kling.school("ATTENDENCE");
		
		System.out.println(kling.name);

	}

}
