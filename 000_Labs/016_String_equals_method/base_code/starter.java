/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
		String choice = new String(sc.nextLine());
		choice = choice.toLowerCase();
		if(choice.equals("wizard")) {
			System.out.println("You chose Wizard!");
		}
		else if(choice.equals("warrior")) {
			System.out.println("You chose Warrior!");
		}
		else if(choice.equals("rogue")) {
			System.out.println("You chose Rogue!");
		}
		else {
			System.out.println("Please enter a valid option");
		}
	}
}
