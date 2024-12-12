/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wizards = new Wizard[100];
		Warrior[] warriors = new Warrior[100];

		for(int i = 0; i < warriors.length; i++) {
			warriors[i] = new Warrior();
			wizards[i] = new Wizard();
		}
		
		int i = 0;
		int j = 0;
		boolean wizardsWon = false;
		while(true) {
			if(i >= wizards.length) {
				System.out.println("WARRIORS WON!!!");
				wizardsWon = false;
				break;
			}
			else if(j >= warriors.length) {
				System.out.println("WIZARDS WON!!!");
				wizardsWon = true;
				break;
			}
			
			wizards[i].attack(warriors[j]);
			warriors[j].attack(wizards[i]);
			if(wizards[i].isDead()) {
				i++;
			}
			if(warriors[j].isDead()) {
				j++;
			}

		}
		
		if(wizardsWon) {
			int c = 0;
			for(int d = 0; d < wizards.length; d++) {
				if(!wizards[d].isDead()) {
					c++;
					
				}
			}
			System.out.println("There are " + c + " wizards left alive and traumatized from the great war.");
		}
		else {
			int c = 0;
			for(int d = 0; d < warriors.length; d++) {
				if(!warriors[d].isDead()) {
					c++;
				}
			}
			System.out.println("There are " + c + " warriors left alive and traumatized from the great war.");
		}
		
		
	}
}
