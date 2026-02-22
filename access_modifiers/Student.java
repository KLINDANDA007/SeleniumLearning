package access_modifiers;

class Teacher{
	
	 private String name = "RAGHUL";
	 
	 void disp()
	 {
		 System.out.println(name);
	 }
	
}

public class Student {

	public static void main(String[] args) {
		
		Teacher t = new Teacher();
		
		t.disp();

	}

}
