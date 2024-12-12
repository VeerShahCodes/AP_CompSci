/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a full name(first and last with space between)");
		String name = sc.nextLine();
		
		int indexOfSpace = name.indexOf(' ');
		
		System.out.println("The last name is: " + name.substring(indexOfSpace + 1, name.length()));

		
	}
}
