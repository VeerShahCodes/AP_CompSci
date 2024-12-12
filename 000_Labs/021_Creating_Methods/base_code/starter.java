/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;




class starter {
	
	public static void toString(String string) {
		System.out.println(string);
		return;
	}
	
	
	public static void toStringCombined(String string, String string2) {
		System.out.println(string + " " + string2);
	}
	
	public static void main(String args[]) {
		// Your code goes below here


		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String sentence = new String(sc.nextLine());
		System.out.println("Write a sentence!");
		String sentence2 = new String(sc.nextLine());
		
		System.out.println();
		
		System.out.println("This is using the methods!");
		
		System.out.println();
		
		toString(sentence);

		toStringCombined(sentence,sentence2);
	}
}
