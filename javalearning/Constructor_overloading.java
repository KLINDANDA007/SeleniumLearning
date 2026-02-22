package javalearning;

public class Constructor_overloading {
	
	int marks;
	
	String name;
	
	Constructor_overloading(int a, String b)
	{
		marks = a;
		name =b;
	}

	public static void main(String[] args) {
		
		Constructor_overloading kling = new Constructor_overloading(99,"KLING");
		
		Constructor_overloading john = new Constructor_overloading(90,"VIMAL");
		
		System.out.println(kling.marks);
		
		System.out.println(kling.name);
		
		System.out.println(john.marks);
		
		System.out.println(john.name);
		

	}

}
