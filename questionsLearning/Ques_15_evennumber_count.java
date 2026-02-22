package questionsLearning;

public class Ques_15_evennumber_count {

	public static void main(String[] args) {
		
		int evencount = 0;
		
		for (int i=1;i<=10;i=i+1)
		{
			if(i%2==0)
			{
				evencount =evencount+1;
			}
		}
		
		System.out.println(evencount);
	}

}
