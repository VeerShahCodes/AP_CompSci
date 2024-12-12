/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf dwarf1 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		PooleDwarf dwarf2 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		PooleDwarf dwarf3 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		PooleDwarf dwarf4 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		PooleDwarf dwarf5 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		PooleDwarf dwarf6 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		PooleDwarf dwarf7 = new PooleDwarf(randName(), (int)(Math.random() * 100));
		
		int c = 0;
		if(dwarf1.isSameName(dwarf2.getName())) {
			c++;
		}
		if(dwarf1.isSameName(dwarf3.getName())) {
			c++;
		}
		if(dwarf1.isSameName(dwarf4.getName())) {
			c++;
		}
		if(dwarf1.isSameName(dwarf5.getName())) {
			c++;
		}
		if(dwarf1.isSameName(dwarf6.getName())) {
			c++;
		}
		if(dwarf1.isSameName(dwarf7.getName())) {
			c++;
		}
		
		
		
		System.out.println(dwarf1.getName() + " was the name and there were " + c + " matches!");
		
		
	}
}
