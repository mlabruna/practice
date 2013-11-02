package com.practice.udemy.tutorial9;

import java.util.Scanner;
//saying that we are going to be using ^program
public class Application9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//creating a new scanner object
		System.out.println("Please enter a command: ");
		//telling user to enter text
		String text = input.nextLine();
		//giving their response a variable name
		
		switch (text) {
		case "Start":
			System.out.println("machine started.");
			break;
			
		case "Stop":
			System.out.println("Machine stopped.");
			break;
			
		default:
			System.out.println("command not recognized.");
		}
		}
}
