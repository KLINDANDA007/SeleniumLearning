package javalearning;

interface Printable{
	
	void Display();
}

interface Showable{
	
	void Display();
	
}

class C implements Printable,Showable{

	@Override
	public void Display() {
		
		System.out.println("HI");
		
	}
	
}

public class Interface_MultipleInheritance {

	public static void main(String[] args) {
		
		C c1= new C();
		c1.Display();

	}

}
