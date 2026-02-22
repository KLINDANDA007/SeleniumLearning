package javalearning;

public class Constructor {
	
	int marks;
	
	String name;
	
	Constructor()
	{
		System.out.println("KLING");
	}

	public static void main(String[] args) {
		
		Constructor kling = new Constructor();// whenever new object created constructor will be called
		
		Constructor joe = new Constructor(); // whenever new object created constructor will be called
		
		System.out.println(kling.marks);
		
		System.out.println(joe.marks);
		
		System.out.println(kling.name);
		
		kling.marks =10;
		
		System.out.println(kling.marks);

	}

}
