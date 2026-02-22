package questionsLearning;

class Person{

	public String name;
	protected int age;
	private String socialSecurityNumber;
	String address;
	
	Person(String name,int age,String ssn,String address)
	{
		this.name=name;
		this.age=age;
		this.socialSecurityNumber=ssn;
		this.address=address;
	}
}

class Employee extends Person{
	
	Employee(String name,int age,String ssn,String address)
	{
		super(name,age,ssn,address);
		System.out.println("Hello Employees");
		
	}
}

public class Ques_22_Access {

	public static void main(String[] args) {
		
		Employee es = new Employee("RUBAN",19,"SA97J9K","Chennai");
		
		System.out.println(es.name);
		System.out.println(es.address);
		System.out.println(es.age);
		//System.out.println(es.socialSecurityNumber);

	}

}
