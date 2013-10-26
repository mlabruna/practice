package com.practice.udemy.tutorial3;

public class Application3 {
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
