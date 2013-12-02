package com.practice.TECclub;

import java.util.Scanner;
//imported scanner system
public class UserInput {
	public static void main(String[] args) {
		
		//created a new caluclator object
		System.out.println("Would you like to add, subtract, multiply, or divide? ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		//asked the function they would like to perform and saved it into the variable "input"
		
		System.out.println("Enter 1st number");
		double x = scan.nextDouble();
		//got 1st number saved into variable "x"
		
		System.out.println("Enter 2nd number");
		double y = scan.nextDouble();
		/*got 2nd number saved it in "y"
		 * made it a double because it increases the capacity that can be stored in x & y
		*/
		
		if (input.equals("add")) {
			System.out.println(x + y);
		}
		
		else if (input.equals("subtract")) {
			System.out.println(x - y);
		}
		
		else if (input.equals("multiply")) {
			System.out.println(x * y);
		}
		
		else if (input.equals("divide")) {
			System.out.println(x / y);
		}
		
		/*else if (input.equalsIgnoreCase("add")) {
			System.out.println("function not recognized");
		(above)^^ I was trying to have the program recognize if input != "add", "subtract", "multiply", or "divide"
			*/
		}
		
		
	}

}
