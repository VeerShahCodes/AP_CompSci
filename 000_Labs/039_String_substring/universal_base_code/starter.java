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
		System.out.println("ENTER WORD!!!");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			System.out.println(i + " " + word.substring(i, i + 1));
		}


		
	}
}
