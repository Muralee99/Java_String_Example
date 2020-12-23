package com.teststring;

import java.util.stream.IntStream;

public class CharsMethodExample 
{

	public static void main(String[] args) 
	{
		String str = "Hello World";
		IntStream stream = str.chars();
		stream.forEach(ch -> System.out.println((char)ch));
	}

}
