package com.practice.udemy.tutorial2;

public class Application2 {
	private static final String Raw_input = null;

	public static void main(String[] args) {
	int myInt = 7;
	
	String text = "Hello";
	String text2 = " How are you?";
	
	String blank = " ";
	String name = "Bob";
	String greeting = text + blank + name + blank + text2;
	
	double myDouble = 7.8;
			
	System.out.println(greeting);
	
	System.out.println("hello" + " " + "Bob");
	System.out.println("My integer is: " + myInt);
	System.out.println("My integer is: " + myInt * myDouble);
	}
}
