package com.practice.alex;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci extends Object {
	public static void main(String[] args) {
		System.out.println(getFibTermsList(-1));
	}
	
	static String getFibTermsString(int n) {
		String fib = "1";
		
		if (n <= 0)
			fib = "Nada";
		
		// Store last 2 fib values
		double lastFibTerm = 1;
		double last2FibTerm = 0;
		
		// Set loop-index to 0
		int i = 0 + 1; // Account for first term already being set
		// While i is less than n
		while(i < n) {
			
			// Calculate current Fib Term
			double currFibTerm = lastFibTerm + last2FibTerm;
			// Append current Fib Term to String
			fib = fib + "\n" + String.valueOf(i) + "\t" + String.valueOf(currFibTerm);
			
			// Update Last 2 Fib Term first so that it doesn't equal Current Fib Term
			last2FibTerm = lastFibTerm;
			// Update Last Fib Term to Current Fib Term
			lastFibTerm = currFibTerm;
			
			i++; // Increment i
		}
		
		return fib;
	}
	
	static List<Double> getFibTermsList(int n) {
		List<Double> fib = new ArrayList<Double>();
		
		int i = 0;
		while (i < n) {
			if (i == 0) {
				fib.add(1.0);
			} else if (i == 1) {
				fib.add(1.0);
			} else {
				fib.add( fib.get(i - 1) + fib.get(i - 2) );
			}
			
			i++;
		}
		
		return fib;
	}
	
	// Fibonacci: 1,1,2,3,5,8,13,21,34,55,89
	// f(0) = 1
	// f(1) = f(0)
	// f(2) = f(1) + f(0)
	// f(3) = f(2) + f(1)
	
	// f(n) = f(n-1) + f(n-2)

}
