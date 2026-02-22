package javalearning;

class Motor implements Runnable{
	
	public void run()
	{
		System.out.println("Hello Everyone...");
	}
}

public class ThreadWithRunnable {

	public static void main(String[] args) {
		
		Runnable kling = new Motor();
		
		Thread t1 = new Thread(kling);
		
		t1.start();

	}

}
