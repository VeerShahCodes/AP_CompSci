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
		String[] lyrics = new String[10];
		lyrics[0] = "I'm in the thick of it, everybody knows";
		lyrics[1] = "They know me where it snows, I skied in and they froze";
		lyrics[2] = "I don't know no nothin' 'bout no ice, I'm just cold";
		lyrics[3] = "Forty somethin' milli' subs or so, I've been told";
		lyrics[4] = "I'm in my prime, and this ain't even final form";
		lyrics[5] = "They knocked me down, but still, my feet, they find the floor";
		lyrics[6] = "I went from living rooms straight out to sold out tours";
		lyrics[7] = "Life's a fight, but trust, I'm ready for the war";
		lyrics[8] = "Woah-oh-oh";
		lyrics[9] = "This is how the story goes";
		
		int i = 0;
		while(i < lyrics.length) {
			System.out.println(lyrics[i]);
			i++;
		}

		
	}
}
