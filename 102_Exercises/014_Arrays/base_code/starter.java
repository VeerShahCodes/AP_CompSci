/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		 System.out.println("FIRST ARRAY");
		 
		 int[] arr1 = new int[1001];
		 int c = 3;
		 int i = 0;
		 
		 while(i < arr1.length) {
		 	arr1[i] = c;
		 	c+=3;
		 	System.out.println(arr1[i]);
		 	i++;
		 }
		 
		 System.out.println("SECOND ARRAY");
		 
		 int[] arr2 = new int[1001];
		 int c = 1000;
		 int i = 0;
		 
		 while(i < arr2.length) {
		 	
		 	arr2[i] = c;
		 	System.out.println(arr2[i]);
			c--;
		 	
		 	i++;
		 	
		 }
	}
}
