package javalearning;

public class Class_ex_2 {
	
	String name = "";
	
	String Processor = "";
	
	String GPU = "";
	
	int price = 0;
	
	int ram = 0;

	public static void main(String[] args) {
		
		Class_ex_2  laptop = new Class_ex_2();
		
		laptop.name = "ASUS";
		laptop.GPU = "NVIDIA";
		laptop.Processor = "i7";
		laptop.ram = 16;
		laptop.price = 55000;
		
		System.out.println(laptop.Processor);
		System.out.println(laptop.name);

		
		Class_ex_2 laptop2 = new Class_ex_2();
		
		laptop2.price = 45000;
		
		System.out.println(laptop2.price);
		System.out.println(laptop2.name);
		
	}

}
