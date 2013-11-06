package com.practice.challenge;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		
		float value = scanner.nextFloat();
		
		System.out.println(square(value));
	}
	
	/**
	 * Calculates the square of a given number.
	 * @param double val - Number to square
	 * @return double Number^2
	 */
	public double square(double val) {
		return val * val;
	}
}
