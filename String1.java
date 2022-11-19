package com.affan.string;

// Write a Java program to get the character at the given index within the String

public class String1 {

	public static void main(String[] args) {

		String str = "Java Exercise!";
		System.out.println("Original String is: " + str);

//		Get the character position at 0th and 10th
		char i1 = str.charAt(0);
		int i2 = str.charAt(10);
		System.out.println((char) i1);
		System.out.println((char)i2);
		System.out.println((char)str.codePointAt(2));
	}

}
