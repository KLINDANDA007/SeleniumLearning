package javalearning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		
		String k = "I am bat, the bats can be roam in nights";
		
		Pattern p = Pattern.compile("night");
		
		Matcher m = p.matcher(k);
		
		while(m.find()) // find the pattern that given matches or not
		{
			System.out.println(m.group() + " at " + m.start() + " end at " + m.end()); // group prints what all are matched found in find
		}                             // start prints where the value is at the string

	}

}
