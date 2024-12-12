/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;


class Character {
	
	String role = new String("Wizard");
	int strength = 10;
	int intelligence = 2;
	int dexterity = 3;
	int charisma = 5;
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character character = new Character();
		
		System.out.println();
		
		System.out.println("Your role is " + character.role);
		
		System.out.println();

        System.out.println("Strength: " + character.strength);
        
        System.out.println();
        
        System.out.println("Intelligence: " + character.intelligence);
        
        System.out.println();
        
        System.out.println("Dexterity: " + character.dexterity);
        
        System.out.println();
        
        System.out.println("Charisma: " + character.charisma);
		
	}
}
