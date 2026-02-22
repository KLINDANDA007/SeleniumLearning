package javalearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex_2 {

	public static void main(String[] args) { // using regex to find no of word print
		
		String john = "life is beautiful, life without chanllenge is boaring";
		
		Pattern p = Pattern.compile("life");
		
		Matcher m = p.matcher(john);
		
		int count =0; // initial count as 0
		
		while(m.find()) //finds the matcher in pattern using while
		{
			count++; // counts the find
		}
		
		System.out.println("Life prints " + count + " times"); //prints the count  value

	}

}
