package javalearning;

import java.io.FileReader;

public class FileReaderFromFile {

	public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("Output.txt");
			
			int c = fr.read();
//			System.out.print((char)c);
//			
//			c = fr.read();
//			System.out.print((char)c);
//			
//			c = fr.read();
//			System.out.print((char)c);
//			
//			c = fr.read();
//			System.out.print((char)c);
			
			while(c!=-1)
			{
				System.out.print((char)c);
				c=fr.read();
			}
			
			fr.close();
		}
		catch(Exception e)
		{
			
		}

	}

}
