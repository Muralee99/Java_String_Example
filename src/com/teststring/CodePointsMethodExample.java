package com.teststring;

import java.util.stream.IntStream;

public class CodePointsMethodExample 
{

	public static void main(String[] args) 
	{
		String str = "Hello World";
		IntStream stream = str.codePoints();
		stream.forEach(ch -> System.out.println((char)ch));
	}

}
