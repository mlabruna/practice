package com.practice.udemy.tutorial8;

import java.util.Scanner;

public class Application8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Please enter an integer < 10: ");
		
		int value = scanner.nextInt();
		
		while(value != 5) {
			System.out.println("Please enter an integer <10: ");
			value = scanner.nextInt();	
		}
		*/	
		int value = 0;
		do {
			System.out.println("Please enter an odd integer < 10: ");
			value = scanner.nextInt();
		}
		while(value != 5);
		
		System.out.println("got 5!");	
	}
	
}