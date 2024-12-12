import pkg.*;
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many mmagic squares??");
		int num = sc.nextInt();
		System.out.println();
		CVMath.specialSquare(num);
	}
	
	
}
