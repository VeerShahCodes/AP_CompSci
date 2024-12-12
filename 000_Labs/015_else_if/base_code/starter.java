/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int rng = (int)(Math.random() * 1000 + 1);
		
		System.out.println("Enter a number between 1 - 1000");
		
		int guess = sc.nextInt();
		
		if(guess == rng) {
			System.out.println("Your guess was correct!!!");
		}
		else if(guess > rng) {
			System.out.println("Your guess was higher than the random value. The value was " + rng);
		}
		else if(guess < rng) {
			System.out.println("Your guess was lower than the random value. The value was " + rng);
		}

	}
}
