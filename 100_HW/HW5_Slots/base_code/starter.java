/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int money = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		while(true) {
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			String response = sc.nextLine();
			
			if(response.equals("Yes") || response.equals("yes") || response.equals("Y") || response.equals("y")) {
				System.out.print("You have $" + money + ". How much would you like to wager? (integers only!!!)");
				int wager = sc.nextInt();
				while(wager > money || wager < 0) {
					System.out.print("You only have " + "$" + money + ". Please enter a valid integer: ");
					wager = sc.nextInt();
				}
			    sc.nextLine();

				System.out.println();
				
				System.out.println("Great!");
				System.out.println("Your rolls are:");
				int roll1 = (int)(Math.random() * 10 + 1);
				int roll2 = (int)(Math.random() * 10 + 1);
				int roll3 = (int)(Math.random() * 10 + 1);
				
				System.out.println();
				
				System.out.println("--------------------");
				System.out.println(" | " + roll1 + " | " + roll2 + " | " + roll3 + " | ");
				System.out.println("--------------------");
				
				money = money - wager;
				if(roll1 == roll2 && roll2 == roll3) {
					System.out.println("JACKPOT! $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					money = money + wager * 3;
				}
				else if(roll1 == roll2) {
					System.out.println("LUCKY! $$$");
					money = money + wager * 2;
				}
				else if(roll2 == roll3) {
					System.out.println("LUCKY! $$$");
					money = money + wager * 2;
				}
				else if(roll3 == roll1) {
					System.out.println("LUCKY! $$$");
					money = money + wager * 2;
				}
				else {
					System.out.println("HAHA UNLUCKY!");
				}
				
			}
			else if(response.equals("No") || response.equals("N") || response.equals("n") || response.equals("no")) {
				break;
			}
			else {
				System.out.println("That wasn't quite the correct answer. Please try again!");
			}
			
		    System.out.println();
		    
		    if(money <= 0) {
		    	System.out.println("You are broke.");
		    	break;
		    }

		}
		System.out.println("Good riddance");
	}
}
