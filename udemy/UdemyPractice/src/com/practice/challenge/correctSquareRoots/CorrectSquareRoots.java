package com.practice.challenge.correctSquareRoots;

import java.lang.Math;
import java.util.Scanner;

public class CorrectSquareRoots {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		
		System.out.println(Math.sqrt(value));
		
	}	
}
