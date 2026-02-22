package javalearning;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderFileBuffer {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("Output.txt");
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
//			System.out.println(line);
//			
//			line = br.readLine();   // line by line read command
//			System.out.println(line); // these lines will be read by line
			
			while(line!=null)
			{
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
		
		}
		catch(Exception e)
		{
			
		}

	}

}
