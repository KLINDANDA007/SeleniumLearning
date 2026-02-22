package questionsLearning;

abstract class Animalss{
	
	String name;
	
	Animalss(String name)
	{
		this.name = name;
	}
	
	abstract void makesound();
}

class Dogg extends Animalss{
	
	Dogg(String name)
	{
		super(name);
	}

	void makesound()
	{
		System.out.println("Bow Bow..");
	}
	
}

class Catt extends Animalss{
	
	Catt(String name)
	{
		super(name);
	}
	
	void makesound()
	{
		System.out.println("Meow meow..");
	}
	
}

public class Ques_25_Abstract {

	public static void main(String[] args) {
		
		Dogg dg = new Dogg("Simba");
		
		System.out.println(dg.name);
		
		dg.makesound();
		
		
		
		Catt ct = new Catt("Silo");
		
		System.out.println(ct.name);
		
		ct.makesound();

	}

}
