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
		
		MyCharacter start = new MyCharacter();
		System.out.println("Your role is " + start.Role);
		System.out.println("Your strength trait is " + start.strength);
		System.out.println("Your dexterity trait is " + start.dexterity);
		System.out.println("Your intelligence trait is " + start.intelligence);
		System.out.println("Your charisma trait is " + start.charisma);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------");
		
		System.out.println("What do you want your role to be:");
		
		String role = sc.nextLine();
		
		System.out.println("-------------------------");
		
		MyCharacter character = new MyCharacter(role);
		
		System.out.println("-------------------------");
		
		System.out.println("Your role is " + character.Role);
		System.out.println("Your strength trait is " + character.strength);
		System.out.println("Your dexterity trait is " + character.dexterity);
		System.out.println("Your intelligence trait is " + character.intelligence);
		System.out.println("Your charisma trait is " + character.charisma);


		
	}
}
