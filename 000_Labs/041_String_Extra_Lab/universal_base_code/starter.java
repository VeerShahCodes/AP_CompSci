/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String input = sc.nextLine();
		

		System.out.println(reverse(input));
		
	}
	
	public static String reverse(String input) {
		String result = "";
		while(true) {
			if(input.indexOf(" ") == -1) {
				result = input + result;
				break;	
			}
			int space = input.indexOf(" ");
			String word = input.substring(0, space);
			result = " " + word + result;
			input = input.substring(space + 1);
		}	
		return result;
	}
}

