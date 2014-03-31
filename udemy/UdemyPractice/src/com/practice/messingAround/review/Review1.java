package com.practice.messingAround.review;

import java.util.Scanner;
//import java.util.

public class Review1 {
	
	public static void main(String[] args) {
		//OBJECTIVE: recursive function dealing with logarithms
		// g-1+(n/e^6)=x
		
		Scanner scan = new Scanner(System.in);
		
		int x = 9;
		System.out.println(x);
		System.out.println("Please enter a base: ");
		double base = scan.nextDouble();
		
		System.out.println("Please enter value: ");
		double value = scan.nextDouble();
		
		System.out.println(value * (base*x));
	}
	
}
