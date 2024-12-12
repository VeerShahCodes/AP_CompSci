/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("--------------------------");
		int[] array = new int[20];
		System.out.println("These are the " + array.length + " numbers:");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 10 + 1);
			System.out.print(array[i] + "  ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		int target = (int)(Math.random() * 10 + 1);
		System.out.println("The random target is " + target);
		int duplicates = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == target) {
				duplicates++;
				System.out.println("Duplicate found at index " + i);
			}
		}
		System.out.println("Total number of duplicates for " + target + " is " + duplicates);
		
		System.out.println("---------------------------");
		System.out.println("Looking for two in a row: ");
		
		for(int i = 0; i < array.length - 1; i++) {

			
			if(array[i] == array[i + 1]) {
				System.out.println("Two in a row found at indexes " + i + " and " + (i + 1) + ". The number is " + array[i]);
			}
		}
	}
}
