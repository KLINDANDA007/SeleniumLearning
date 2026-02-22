package javalearning;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterAndStore_BufferedWriter {

	public static void main(String[] args) {
		
		try {
		FileWriter fw = new FileWriter("Sample.txt",true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Welcome to learing of java ");
		bw.newLine();
		bw.write("All is well");
		bw.newLine();
		bw.close();
		System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
