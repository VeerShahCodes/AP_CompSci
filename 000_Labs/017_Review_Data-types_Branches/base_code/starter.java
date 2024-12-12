/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = new String(sc.nextLine());
		
		System.out.println("What is your Title: EX: Slayer of the Dragons");
		String title = new String(sc.nextLine());
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = new String(sc.nextLine());
		role = role.toLowerCase();
		if(role.equals("wizard")) {
			System.out.println("You've chosen the Wizard!");
		}
		else if(role.equals("warrior")) {
			System.out.println("You've chosen the Warrior!");
		}
		else if(role.equals("rogue")) {
			System.out.println("You've chosen the Rogue!");
		}
		else {
			System.out.println("Please enter a valid option.");
		}
		
		System.out.println();
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		System.out.println();
		
		int pointsRemaining = 20;
		
		System.out.println("Strength (1-10): ");
		int strengthPoints = sc.nextInt();
		if((strengthPoints <= 10 && strengthPoints >= 0) && strengthPoints <= pointsRemaining) {
			pointsRemaining = pointsRemaining - strengthPoints;
			System.out.println("You have " + pointsRemaining + " points remaining");
			
			System.out.println();
		}
		else {
			System.out.println("Please enter a valid number");
				System.out.println("Strength (1-10): ");
				strengthPoints = sc.nextInt();
				if(strengthPoints <= 10 && strengthPoints >= 0) {
					pointsRemaining = pointsRemaining - strengthPoints;
					System.out.println("You have " + pointsRemaining + " points remaining");
					
					System.out.println();
				}
		}
		
		System.out.println();

		System.out.println("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if((dexterity <= 10 && dexterity >= 0) && dexterity <= pointsRemaining) {
			pointsRemaining = pointsRemaining - dexterity;
			System.out.println("You have " + pointsRemaining + " points remaining");
			
			System.out.println();
		}
		else {
			System.out.println("Please enter a valid number");
				System.out.println("Dexterity (1-10): ");
				dexterity = sc.nextInt();
				if(dexterity <= 10 && dexterity >= 0) {
					pointsRemaining = pointsRemaining - dexterity;
					System.out.println("You have " + pointsRemaining + " points remaining");
					
					System.out.println();
				}
		}	
		
		System.out.println();

		System.out.println("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if((intelligence <= 10 && intelligence >= 0) && intelligence <= pointsRemaining) {
			pointsRemaining = pointsRemaining - intelligence;
			System.out.println("You have " + pointsRemaining + " points remaining");
			
			System.out.println();
		}
		else {
			System.out.println("Please enter a valid number");
				System.out.println("Intelligence (1-10): ");
				intelligence = sc.nextInt();
				if(intelligence <= 10 && intelligence >= 0) {
					pointsRemaining = pointsRemaining - intelligence;
					System.out.println("You have " + pointsRemaining + " points remaining");
					
					System.out.println();
				}
		}
		
		System.out.println();

		System.out.println("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if((charisma <= 10 && charisma >= 0) && charisma <= pointsRemaining) {
			pointsRemaining = pointsRemaining - charisma;
			System.out.println("You have " + pointsRemaining + " points remaining");
			
			System.out.println();
		}
		else {
			System.out.println("Please enter a valid number");
				System.out.println("Charisma (1-10): ");
				charisma = sc.nextInt();
				if(charisma <= 10 && charisma >= 0) {
					pointsRemaining = pointsRemaining - charisma;
					System.out.println("You have " + pointsRemaining + " points remaining");
					
					System.out.println();
				}
		}		
		
		System.out.println();
		
		System.out.println("-------------------------------------------");
		
		System.out.println("Your name is " + name + ", the " + title + " CVHS");
		System.out.println("You are a " + role + " with the following stats:");
		System.out.println("Strength - " + strengthPoints);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		
		System.out.println();
		
		System.out.println("Good luck with your quest, " + name);
	}
}
