package access_modifiers;

public class Constructor {
	
	String student;
	int std;
	
	
	Constructor(int a,String b){
		
		std = a;
		student = b;

	}
	
	Constructor(){
		System.out.println("Constructor called");
	}
	

	public static void main(String[] args) {
		
		
		Constructor kling = new Constructor();
		
		Constructor joe = new Constructor(10,"Eden");
		
		System.out.println(kling.std + " "+kling.student); // while initialise this object the default value for the constructor will be printed
		System.out.println(joe.std +" "+joe.student);

	}

}
