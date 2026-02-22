package questionsLearning;

class Counter{
	
	static int count = 0;
	int instanceNumber = 0;
	
	Counter()
	{
		count= count+1;
		instanceNumber = instanceNumber+1;
	}
	
	void Disp()
	{
		System.out.println("instanceNumber : " + instanceNumber);
		System.out.println("Static count : " + count);
	}
}

public class Ques_23_Static {

	public static void main(String[] args) {
		
		Counter  cn = new Counter();
		cn.Disp();
		Counter  cn1 = new Counter();
		cn1.Disp();
		Counter  cn2 = new Counter();
		cn2.Disp();
		
		

	}

}
