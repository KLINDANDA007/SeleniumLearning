package javalearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_4 {

	public static void main(String[] args) {
		
		String a = "Tamil is the oldest language in the world";
		
		Pattern p = Pattern.compile("\\w+"); //prints any of the single word in the string
		
		Matcher m = p.matcher(a);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
