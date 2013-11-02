package com.practice.udemy.tutorial9;

import java.util.Scanner;

public class Tutorial9practice {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//new scanner object
		
		System.out.println("Enter a integer < 10: ");
		//asking user to print a number less than 10
		int value = scanner.nextInt();
		//taking the number the user has given and given it a variable name
		while(value != 5) {
			System.out.println("Enter a integer < 10: ");
			//the program will continue asking the user to enter a number until they enter5
			value = scanner.nextInt();
			
}
		
		
		
		
	}

}



