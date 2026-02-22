package javalearning;

public class Foreachloop_2 {

	public static void main(String[] args) {
		
		String name[] = {"SUN","MOON","EARTH"};
		
		for(int i=0;i<3;i=i+1)
		{
			System.out.println(name[i]);
		}
		
		for(String kling:name) //for each loop here, using the data type and assigned a variable to call name array
		{
			System.out.println(kling);
		}

	}

}
