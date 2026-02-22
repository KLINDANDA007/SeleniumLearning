package javalearning;

class Student{
	int mark=0;
	static String teacher="Ajay";
	
	static void Display()
	{
		System.out.println("Hi dude");
	}
}

public class LearnStatic {

	public static void main(String[] args) {
		
		Student sd = new Student();
		
		sd.mark=60;
		
		Student sd1 = new Student();
		
		sd1.mark=70;
		
		Student.teacher="Jerome";
		
		System.out.println(sd.mark);
		System.out.println(sd1.mark);
		System.out.println(Student.teacher);
		Student.Display();
	}

}
