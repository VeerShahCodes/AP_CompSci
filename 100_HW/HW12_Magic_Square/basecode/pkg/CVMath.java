package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int times) {
		int c = 0;
		
		for(int i = 1; c < times; i++) {
			int current = i * i;
			if(checkForConsecutive(current)) {
				System.out.println(current);
				c++;
			}
		}
		

	}
	
	public static boolean checkForConsecutive(int number) {
		int sum = 0;
		for(int i = 1; sum < number; i++) {
			sum+=i;

		}
		return sum == number;
	}
	
}
