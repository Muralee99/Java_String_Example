package com.teststring;

public class InternMethodExample 
{
	public static void main(String args[]) {
		String s = "Hello";
		String t = "Hello";
		System.out.println(t.intern() ==  s.intern());
	}
}
