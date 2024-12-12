/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number and I will show you its primes: ");
		int input = sc.nextInt();
		
		printPrimes(input);
	}
	
	public static boolean checkPrime(int number) {
		int count = number - 1;
		while(count > 1) {
			if(number % count == 0) {
				return false;
			}
			count--;
		}
		return true;
	}
	
	public static void printPrimes(int input) {
		int count = input - 1;
		while(count > 1) {
			if(checkPrime(count) == true) {
				System.out.println(count);
			}
			count--;
		}
	}
}
