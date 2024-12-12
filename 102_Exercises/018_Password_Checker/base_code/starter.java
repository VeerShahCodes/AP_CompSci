import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int level1 = 0;
		int level2 = 0;
		int level3 = 0;
		int level0 = 0;
		for(int j = 0; j < count; j++) {
            if(passwords[j].length() >= 8 && (passwords[j].contains("@") || passwords[j].contains("!") || passwords[j].contains("#") || passwords[j].contains("$") || passwords[j].contains("%") || passwords[j].contains("^") || passwords[j].contains("&") || passwords[j].contains("*"))) {
                level3++;
            }		    
            else if(passwords[j].length() >= 8) {
                level1++;
            }
            else if(passwords[j].contains("@") || passwords[j].contains("!") || passwords[j].contains("#") || passwords[j].contains("$") || passwords[j].contains("%") || passwords[j].contains("^") || passwords[j].contains("&") || passwords[j].contains("*")) {
                level2++;
            }
            else {
                level0++;
            }
		}
		System.out.println("Level3 passwords: " + level3);
		System.out.println("Level2 passwords: " + level2);
		System.out.println("Level1 passwords: " + level1);
		System.out.println("No strength passwords: " + level0);

		
	}
}
