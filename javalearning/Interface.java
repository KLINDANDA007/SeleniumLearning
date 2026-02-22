package javalearning;

interface Zoo{
	
	int animalPopulation = 2000;
	void animals();
}


class Breads implements Zoo{

	@Override
	public void animals() {
		
		System.out.println("All are beautiful");
		
	}
	
}

class Species implements Zoo{

	@Override
	public void animals() {
		
		System.out.println("There are different catogories");
		
	}
	
}


public class Interface {

	public static void main(String[] args) {
		
		Breads ze = new Breads();
		
		ze.animals();
		int Bee = ze.animalPopulation; // assigned animalPopulation value to the new variable
		System.out.println(Bee);
		
		Species sp = new Species();
		
		sp.animals();
		System.out.println(sp.animalPopulation);
		

	}

}
