package access_modifiers;

//static is used for memory consumption in java.
//for static method or variables should not create an object.

public class StaticClass {
	
	static String name = define();  // compiler executes the static method first
	static int depart = 12;
	
	static String define() {
		System.out.println("Static");
		return "HIMAN";
	}

	static {
		//System.out.println("ARAISE");
	}
	
	public static void main(String[] args) {
		
		StaticClass bee = new StaticClass();
		
		StaticClass.name ="DROID";
		System.out.println(StaticClass.name);
		
		System.out.println(bee.name);
		

	}

}
