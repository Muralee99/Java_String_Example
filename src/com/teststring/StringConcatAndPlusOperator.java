package com.teststring;

public class StringConcatAndPlusOperator 
{
	public static void main(String args[]) 
	{
		String str = "Hello";
		String newString = str.concat(" World");
		System.out.println("with concat :: "+newString);
		System.out.println("with + operator :: "+"New "+str+ " World");
	}

}
