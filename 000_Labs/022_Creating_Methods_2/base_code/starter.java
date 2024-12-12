/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y) {
		int count = 0;
		int val = x;
		while(count < y - 1) {
			val = val * x;
			count++;
		}
	
		return val;
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your base number?");
		
		int base = sc.nextInt();
		
		System.out.println("What is your exponent?");
		
		int exponent = sc.nextInt();
		
		
		int answer = pow(base, exponent);
		System.out.println();
		System.out.println("Answer: " + answer);
		
		
		

		
	}
}
