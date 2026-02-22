package questionsLearning;

class ZooAnimal{
	
	String name;
	int age;
	
	void makeSound() 
	{
		System.out.println("Animals make sound");
	}
}

class Dogs extends ZooAnimal{
	String breed;
	
	@Override
	void makeSound() {
		
		System.out.println("Dog barks");
	}
	
	void fetch() {
		System.out.println("Dog is fetching");
	}
}

class Cats extends ZooAnimal{
	String colour;
	
	@Override
	void makeSound()
	{
		System.out.println("Cat meows.....");
	}
	
	void climb()
	{
		System.out.println("Cat is Climbing");
	}
	
}

public class Ques_20_inheritance {

	public static void main(String[] args) {
		
		Dogs d1 = new Dogs();
		d1.name="Tom";
		d1.age=20;
		d1.breed="German";
		d1.makeSound();
		d1.fetch();
		
		Cats c1 = new Cats();
		c1.name="Cirus";
		c1.age=12;
		c1.colour="Golden";
		c1.makeSound();
		c1.climb();
		

	}

}
