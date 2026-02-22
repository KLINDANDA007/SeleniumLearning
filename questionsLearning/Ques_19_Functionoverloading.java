package questionsLearning;

public class Ques_19_Functionoverloading {
	
	void sum(int a, int b) // function overloading it has same function names with different types/list inside
	{
		System.out.println(a+b);
	}
	
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		Ques_19_Functionoverloading total = new Ques_19_Functionoverloading();
		
		total.sum(12,15);
		
		total.sum(12,22,15);

	}

}
