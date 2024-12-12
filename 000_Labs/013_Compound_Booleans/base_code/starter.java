/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First Number: ");
		int firstNum = sc.nextInt();
		System.out.print("Second Number: ");
		int secondNum = sc.nextInt();
		System.out.print("Third Number: ");
		int thirdNum = sc.nextInt();
		
		if(firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("The greatest value was your first value.");
			System.out.println("The value was " + firstNum);
		}
		else if(secondNum > firstNum && secondNum > thirdNum) {
			System.out.println("The greatest value was your secondNum value.");
			System.out.println("The value was " + secondNum);			
		}
		else if(thirdNum > firstNum && thirdNum > secondNum) {
			System.out.println("The greatest value was your third value.");
			System.out.println("The value was " + thirdNum);			
		}
		
		if(firstNum < secondNum && firstNum < thirdNum) {
			System.out.println("The smallest value was your first value.");
			System.out.println("The value was " + firstNum);
		}
		else if(secondNum < firstNum && secondNum < thirdNum) {
			System.out.println("The smallest value was your secondNum value.");
			System.out.println("The value was " + secondNum);			
		}
		else if(thirdNum < firstNum && thirdNum < secondNum) {
			System.out.println("The smallest value was your third value.");
			System.out.println("The value was " + thirdNum);			
		}
	}
}
