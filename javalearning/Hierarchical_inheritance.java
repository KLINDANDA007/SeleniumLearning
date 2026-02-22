package javalearning;

	class Animals{ // super class
		void eat()
		{
			System.out.println("Animals can eat");
		}
	}
	
	class Goat extends Animals{ //derived class
		void sounds()
		{
			System.out.println("Goat bark at stranger");
		}
	}
	
	class Cat extends Animals{ //derived class
		void moans()
		{
			System.out.println("Cat moans like child");
		}
	}

public class Hierarchical_inheritance {

	public static void main(String[] args) {
		
		Cat july = new Cat();
		Goat puppy = new Goat();
		
		july.eat();
		puppy.eat();

	}

}
