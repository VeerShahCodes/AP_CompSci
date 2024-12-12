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
		
		
		int length = (int)(Math.random() * 150 + 51);
		int[] randArray = new int[length];
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = (int)(Math.random() * 100 + 1);
		}

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < randArray.length; i++) {
			if(randArray[i] < min) {
				min = randArray[i];
			}
			
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < randArray.length; i++) {
			if(randArray[i] > max) {
				max = randArray[i];
			}
		}
		
		int sum = 0;
		for(int i = 0; i < randArray.length; i++) {
			sum += randArray[i];
		}
		double avg = (double)(sum / randArray.length);
		
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
		System.out.println("AVG: " + avg);
		System.out.println("Array Size: " + randArray.length);
		
		
	}
}
