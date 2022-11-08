package com.greatlearning.matchingbrackets;

import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
	
	public static boolean checkBrackets(String s) {
		
		String openingBrackets = "({[";
		String closingBrackets = ")}]";
		String brackets = openingBrackets + closingBrackets;
		
		//Define Stack
		Stack <Integer> int_stack = new Stack <> ();
		
		for (char ch:s.toCharArray()) {
			int index = -1;
			if (!brackets.contains(ch+"")) { 
				continue;
			}
			if ((index = openingBrackets.indexOf(ch))!=-1) {
				
				int_stack.push(index);
				continue;
			}
			
			if (int_stack.isEmpty()) {
			   return false;	
			}
			
			index = int_stack.pop();
			if (ch != closingBrackets.charAt(index)) {
				return false;
			}					
		}
		
		return int_stack.isEmpty();
		
	}
	
	public static void main (String args []) {
		
		System.out.println("Please enter a String with brackets :");
		Scanner usr_inp = new Scanner(System.in);
		String input_str = usr_inp.next();
			
		boolean check = checkBrackets(input_str);
		
		if (check)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		
		usr_inp.close();
		
	}

}
