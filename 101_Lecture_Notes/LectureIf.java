/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       
       
       System.out.println("You''ve joined an Alien Exchange program");
       System.out.println("Pick an alien to take in!");
       System.out.println("1. Joe, a fat bellied alien");
       System.out.println("2. Bob, a blue alien");
       System.out.println("3. Barney, a purple tailed alien");
       
       int answer1 = sc.nextInt();
       String alien;
       
       if(answer1 == 1) {
           System.out.println("You picked Joe! WOO!");
           alien = new String("Joe");
       }
       else if(answer1 == 2) {
           System.out.println("You picked Bob!!! WOO!");
           alien = new String("Bob");
       }
       else if(answer1 == 3) {
           System.out.println("You picked Barney! WOO!");
           alien = new String("Barney");
       }
       else {
           System.out.println("You get Jerry...");
           alien = new String("Jerry");
       }
       
       
       System.out.println("5 Days Later: You and " + alien + " go on a walk on mars.");
       System.out.println("You encounter a monster that is hungry...");
       System.out.println("What do you do:");
       System.out.println("1. Sacrifice your alien, " + alien);
       System.out.println("2. Sacrifice your life for your alien, " + alien);
       
       int answer2 = sc.nextInt();
       
       if(answer2 == 2) {
           System.out.println("You lose WOMP WOMP");
       }
       else {
           System.out.println("You continue on your sad, miserable life without " + alien);
       }
       
       
       
       
       
       
	}
}