/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What day is it? (0 - 6)");
		
		int day = sc.nextInt();
		
		if(day < 6 && day > 0) {
			System.out.println("Wake up at 7:00 am");
		}
		else if(day == 0 || day == 6)  {
			System.out.println("Wake up at 10:00 am");
		}
		else {
			System.out.println("Please enter a day within the range provided.");
		}
	}
}
