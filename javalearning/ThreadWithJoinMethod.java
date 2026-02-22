package javalearning;


class Aaron extends Thread{
	
	int j=0;
	public void run()
	{
		j=50;
	}
}

public class ThreadWithJoinMethod {

	public static void main(String[] args) {
		
		Aaron a1 = new Aaron();
		
		a1.start();
		
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a1.j);
		

	}

}
