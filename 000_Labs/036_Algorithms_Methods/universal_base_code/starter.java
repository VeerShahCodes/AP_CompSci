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
		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
		}
		
		
		toStringArray(array);
		System.out.println();
		System.out.println("AVERAGE: " + getAverage(array));
		System.out.println("MAX: " + getArrayMax(array));
		System.out.println("MIN: " + getArrayMin(array));
	}
	
	public static void toStringArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static double getAverage(int[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		return sum / array.length;
	}
	
	public static int getArrayMax(int[] array) {
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
