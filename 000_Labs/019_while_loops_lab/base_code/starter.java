/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = new String(sc.nextLine());
		System.out.println("How many times do you want to repeat the name:");
		int repeat = sc.nextInt();
		
		int c = 1;
		while(true) {
			System.out.println(name);
			
			if(c >= repeat) {
				break;
			}
			
			c++;
		}



		
	}
}
