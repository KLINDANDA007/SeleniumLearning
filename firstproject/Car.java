package firstproject;

//AccessSpecifier Keyword ClassName
public class Car {
	
	//AccessSpecifier ReturnType MethodName()
	public void superCar() {
		System.out.println("THE CAR DESIGN IS AWESOME");

	}
	
	public void superSpeed() {
		System.out.println("THE CAR WILL REACH THE SPEED OF 0 TO 100 WITHIN 7 SECCONDS");

	}
	
	public static void main(String[] args) {
		
	//ClassName ObjectName = new ClassName();
		Car luxuryCar = new Car();
		
	//To call the method ObjectName.MethodName();
		luxuryCar.superCar();
		
		luxuryCar.superSpeed();
		
	}
}
