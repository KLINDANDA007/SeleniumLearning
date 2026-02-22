package javalearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_3 {

	public static void main(String[] args) {
		
		String a = "Tamil is the oldest language and Tamil is the beautiful language in world";
		
		Pattern p = Pattern.compile("^Tamil");// ^ Specifies it was starts at 
		
		Matcher m = p.matcher(a);
		
		while(m.find())
		{
			System.out.println(m.group()+ " Starts at "+m.start());
		}
		
		

	}

}
