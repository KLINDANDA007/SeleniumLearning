package javalearning;

	class Bird{
		void eat()
		{
			System.out.println("Bird can eat");
		}
	}
	
	class Owl extends Bird{ //derived class
		void sound()
		{
			System.out.println("Owl roams at night");
		}
	}
	
	class Piegon extends Owl{ // derived class
		void sounds()
		{
			System.out.println("Piegon sounds beautiful");
		}
	}

public class Multilevel_inheritence {

	public static void main(String[] args) {
		
		Piegon shadow = new Piegon();
		
		shadow.sound();
		
		shadow.eat();
		
		shadow.sounds();

	}

}
