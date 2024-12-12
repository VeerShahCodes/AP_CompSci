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
		MyCharacter character = new MyCharacter();
		System.out.println("Your role is " + character.Role);
		System.out.println("Your strength trait is " + character.strength);
		System.out.println("Your dexterity trait is " + character.dexterity);
		System.out.println("Your intelligence trait is " + character.intelligence);
		System.out.println("Your charisma trait is " + character.charisma);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------------------");
		
		System.out.println("What do you want your role to be:");
		
		String role = sc.nextLine();
		
		System.out.println("-------------------------");
		
		character = new MyCharacter();
		
		System.out.println("-------------------------");
		character.setAll(role, 5,5,5,5);
		System.out.println("Your role is " + character.Role);
		System.out.println("Your strength trait is " + character.strength);
		System.out.println("Your dexterity trait is " + character.dexterity);
		System.out.println("Your intelligence trait is " + character.intelligence);
		System.out.println("Your charisma trait is " + character.charisma);

		
	}
}
