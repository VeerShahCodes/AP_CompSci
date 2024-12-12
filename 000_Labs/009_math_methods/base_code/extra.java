/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        double x = sc.nextDouble();
        System.out.print("Y: ");
        double y = sc.nextDouble();
        
        double max = Math.max(x, y);
        double sqrt = Math.sqrt(y);
        double pow = Math.pow(x, y);
        
        System.out.println("Maximum number of x and y is " + max);
        System.out.println("Square root of y is " + sqrt);
        System.out.println("Power of x and y is " + pow);
	}
}
