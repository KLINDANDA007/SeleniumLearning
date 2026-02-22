package javalearning;

import java.io.FileWriter;

public class FileWriterAndStore {

	public static void main(String[] args) {
		
		try {
			
		FileWriter fw = new FileWriter("Output.txt", true);
		
//		fw.write("Hi Guys");
		fw.append(" How are u guys are doing ");
		fw.close();
		System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("Something error occurred");
		}

	}

}