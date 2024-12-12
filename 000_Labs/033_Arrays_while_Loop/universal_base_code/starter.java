/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

		int[] randArray = new int[1000];
		
		int i = 0;
		while(i < randArray.length) {
			randArray[i] = (int)(Math.random() * 100);
			
		}
		
		i = 0;
		while(i < randArray.length) {
			System.out.println(randArray[i]);
		}

		
	}
}
