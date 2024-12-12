/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("The first num is: " );
		int num1 = sc.nextInt();
		System.out.println("The second num is: ");
		int num2 = sc.nextInt();
		
		
		if(num1 != num2) {
			System.out.println("The values are different");
		}
		else {
			System.out.println("The values are equal");
		}
	}
}

