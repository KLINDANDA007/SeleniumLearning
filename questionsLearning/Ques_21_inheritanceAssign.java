package questionsLearning;

class Vehicle{
	String brand;
	int year;
	
	void startEngine()
	{
		System.out.println("It has v4 turbo Engine");
	}
}

class Car extends Vehicle{
	String fuelType;
	
	@Override
	void startEngine() {
		
		System.out.println("Car Engie Starts");
	}
	
	void drive()
	{
		System.out.println("Car is Driving");
	}
}

class Truck extends Vehicle{
	int loadCapacity;
	
	@Override
	void startEngine()
	{
		System.out.println("Truck Engie Starts");
	}
	
	void haul()
	{
		System.out.println("Truck is hauling");
	}
}

public class Ques_21_inheritanceAssign {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.brand="BMW";
		c1.year=2024;
		c1.fuelType="Super petrol";
		c1.startEngine();
		c1.drive();
		
		Truck t1 = new Truck();
		
		t1.brand="TOYOTA";
		t1.year=2023;
		t1.loadCapacity=12;
		t1.startEngine();
		t1.haul();

	}

}
