package com.practice.messingAround;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//imported scanner, list, and arrayList systems

public class DansApp {
//named the blueprint

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to add to the list: ");
		
		String newItem = input.nextLine();
		
		System.out.println(newItem + " have been added");
		
		List<String> list = new ArrayList<String>();
		
		list.add(newItem);
		assert newItem == list.get(0);
		
		/*List myList = new List();
		myList<value>
		*/
		System.out.println(list);
		
		System.out.println("would you like to add anything else? ");
		
		if ("yes" != null) {
			
			System.out.println("What would you like to add to the list: ");
			String newItem2 = input.nextLine();
			
			System.out.println(newItem2 + " have been added");
			
			List<String> list = new ArrayList<String>();
			
			list.add(newItem2);
			assert newItem == list.get(0);
			
			/*List myList = new List();
			myList<value>
			*/
			System.out.println(list);
			
		}
		
	}

}
