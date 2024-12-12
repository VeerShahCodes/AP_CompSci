/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("wOrD:");
		String sentence = sc.nextLine();
		
		while(true) {
			if(sentence.indexOf(" ") == -1) {
				System.out.print(spongeCase(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(spongeCase(word) + " ");
			sentence = sentence.substring(space + 1);
		}
		
	}
	
	public static String spongeCase(String word) {
		String result = "";
		for(int i = 0; i < word.length(); i++) {
			String letter = "";
			if(i % 2 != 0) {
				letter = word.substring(i, i + 1).toUpperCase();
			}
			else {
				letter = word.substring(i, i + 1).toLowerCase();
			}
			result = result + letter;
		}	
		return result;
	}
}
