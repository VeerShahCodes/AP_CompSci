/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to get a range for your random numbers");
		System.out.println("First integer: ");
		int x = sc.nextInt();
		System.out.println("Second integer(bigger than first): ");
		int y = sc.nextInt();
		System.out.println("Your range is " + x + " to " + y);
		System.out.println("Here are five random numbers generated within that range:");
		System.out.println((int)(Math.random() * (y - x) + x));
		System.out.println((int)(Math.random() * (y - x) + x));
		System.out.println((int)(Math.random() * (y - x) + x));
		System.out.println((int)(Math.random() * (y - x) + x));
		System.out.println((int)(Math.random() * (y - x) + x));
	}
}
