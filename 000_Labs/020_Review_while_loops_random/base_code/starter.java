/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		int guess;
		int secretNum = (int)(Math.random() * 1000 + 1);
		
		while(true) {
			System.out.print("What is your guess: ");
			guess = sc.nextInt();
			
			if(guess > secretNum) {
				System.out.println("Your guess is higher than the secret number.");
			}
			else if(guess < secretNum) {
				System.out.println("Your guess is lower than the secret number.");
			}
			else {
				System.out.println("You guessed correct!");
				break;
			}
		}


		
	}
}
