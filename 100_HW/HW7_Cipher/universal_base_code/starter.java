/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want to decipher?");
		String message = new String(sc.nextLine());
		
		System.out.println();
		
		System.out.println("Your message is: ");
		System.out.println(Cipher.encode(message));
		


		
	}
}
