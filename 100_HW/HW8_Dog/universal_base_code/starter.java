/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to name dog?");
		String name = sc.nextLine();
		System.out.println("What is your dog's age?");
		int age = sc.nextInt();
		Dog dog1 = new Dog(name);
		dog1.setAge(age);

		
		Dog dog2 = new Dog("Coco", "Golden Retriever");
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old");
		if(dog1.isSleeping()) {
			System.out.println(dog1.getName() + " is asleep. Don't wake him up!");
			if(dog2.isSleeping() == true) {
				System.out.println(dog2.getName() + " is sleeping too!");
			}
			else {
				System.out.println(dog2.getName() + " is not sleeping!");
			}
		}
		else {
			System.out.println(dog1.getName() + " is awake!");
			dog1.bark();
			if(dog2.isSleeping() == true) {
				System.out.println(dog2.getName() + " wakes up from the bark!");
			}
			else {
				System.out.println(dog2.getName() + " also is awake!");
			}
			dog2.bark();

		}

	}
}
