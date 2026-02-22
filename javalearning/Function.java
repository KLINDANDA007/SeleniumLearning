package javalearning;

public class Function {
	
	void greeting() // Function
	{
		System.out.println("Welcome Home");
	}
	
	void farewell() // Function
	{
		System.out.println("Good Bye");
	}
	
	public static void main(String[] args) {  // Function
		
		Function kling = new Function();// syntax of object, classname objectname(new create)= new classname();
		
		kling.greeting(); // function called using method, object.function();
		kling.farewell();
		
		

	}

}
