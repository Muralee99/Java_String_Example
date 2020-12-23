package com.teststring;

public class IsBlankAndIsEmpty 
{

	public static void main(String args[]) 
	{
		String str = " ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(str.trim().isEmpty());
	}

}
