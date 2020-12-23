package com.teststring;

import java.util.stream.Stream;

public class StringLines 
{
	
	public static void main(String args[]) 
	{
		String testString = "First Hello World \n"+
						"Second Hello World \n"+
						"Third Hello World ...";
		
		Stream<String> lines = testString.lines();
				
		lines.forEach(line -> System.out.println(line));
	}

}
