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
		BaseClass test = new BaseClass();
		int[] randArray = new int[1000];
		
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = (int)(Math.random() * 100);
		}
		
		for(int i = 0; i < randArray.length; i++) {
			System.out.println(randArray[i]);
		}

		
	}
}
