/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Sentence: ");
		String input = sc.nextLine();
		
		String[] words;
		
		int count = 1;
		String tempInput = input;
		while(true) {
			if(tempInput.indexOf(" ") == -1) {
				break;
			}
			int space = tempInput.indexOf(" ");
			tempInput = tempInput.substring(space + 1, tempInput.length());
			count++;
		}
		
		words = new String[count];
		
		tempInput = input;
		count = 1;
		while(true) {
			if(tempInput.indexOf(" ") == -1) {
				words[count - 1] = tempInput.substring(0);
				break;
			}
		    int space = tempInput.indexOf(" ");
		    words[count - 1] = tempInput.substring(0, space);
			tempInput = tempInput.substring(space + 1, tempInput.length());
			count++;
		}
		
		System.out.println("Piglatin:");
		for(int i = 0; i < words.length; i++) {
			if(!(words[i].substring(0, 1).equals("a") || words[i].substring(0, 1).equals("e") || words[i].substring(0, 1).equals("i") || words[i].substring(0, 1).equals("o") || words[i].substring(0,1).equals("u") || words[i].substring(0, 1).equals("A") || words[i].substring(0, 1).equals("E") || words[i].substring(0, 1).equals("I") || words[i].substring(0, 1).equals("O") || words[i].substring(0,1).equals("U")) && words[i].length() > 1) {
				if(words[i].substring(1, 2).equals("a") || words[i].substring(1,2).equals("e") || words[i].substring(1,2).equals("i") || words[i].substring(1, 2).equals("o") || words[i].substring(1, 2).equals("u") || words[i].substring(1, 2).equals("A") || words[i].substring(1,2).equals("E") || words[i].substring(1,2).equals("I") || words[i].substring(1, 2).equals("O") || words[i].substring(1, 2).equals("U")) {
					System.out.print(words[i].substring(1, words[i].length()) + "-" + words[i].substring(0, 1) + "ay ");
				}
				else {
					System.out.print(words[i].substring(2, words[i].length()) + "-" + words[i].substring(0,2) + "ay ");
				}
			}
			else if(words[i].substring(0, 1).equals("a") || words[i].substring(0, 1).equals("e") || words[i].substring(0, 1).equals("i") || words[i].substring(0, 1).equals("o") || words[i].substring(0,1).equals("u") || words[i].substring(0, 1).equals("A") || words[i].substring(0, 1).equals("E") || words[i].substring(0, 1).equals("I") || words[i].substring(0, 1).equals("O") || words[i].substring(0,1).equals("U")) {
				System.out.print(words[i] + "-way ");
			}
		}
		
	}
}
