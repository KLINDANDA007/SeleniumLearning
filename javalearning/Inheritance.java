package javalearning;

class Dad{
	int money = 2000;
}

class Son extends Dad{
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Son kling = new Son();
		
		System.out.println(kling.money);

	}

}
