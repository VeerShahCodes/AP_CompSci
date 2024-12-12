/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int int1 = (int)(Math.random() * 10);
		int int2 = (int)(Math.random() * 100 + 1);
		double decimal = Math.random() + 2.5;
		double double2 = Math.random() * 575 + 14;
		
		System.out.println("Integer between 0 and 9: " + int1);
		System.out.println("Integer between 1 and 100: " + int2);
		System.out.println("Double between 2.5 and 3.5: " + decimal);
		System.out.println("Double between 14 and 589: " + double2);
	}
}
