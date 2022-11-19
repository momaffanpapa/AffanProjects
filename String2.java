package com.affan.string;

public class String2 {
	public static void main(String[] args) {
		String str="W3 school website!";
		System.out.println("Original String is: "+str);
		int i1=str.codePointAt(1);
		int i2=str.codePointAt(9);
		System.out.println("character unicode point at 1 is: "+i1);
		System.out.println("character unicode point at 9 is: "+i2);
	}
}
