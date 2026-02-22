package javalearning;

interface Name{
	void Disp();
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Name N = ()->{System.out.println("Venom");}; // ()->{}; -- lambda expression
		
		N.Disp();

	}

}
