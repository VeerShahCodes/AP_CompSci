/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name;
	int age;
	String villain;
	
	public Spiderman() {
		name = "Miles Morales";
		age = 13;
		villain = "King Pin";
	}
	
	public Spiderman(String name) {
		this.name = name;
		age = 0;
		villain = "None";
	}
	
	public Spiderman(String name, int age) {
		this.name = name;
		this.age = age;
		this.villain = "None";
	}
	
	public Spiderman(String name, String villain) {
		this.name = name;
		this.villain = villain;
		age = 0;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setVillain(String villain) {
		this.villain = villain;
	}
	
	public void print() {
		System.out.println("-------------------------------------------------------");
		System.out.println("The actor " + name + " is " + age + " years old.");
		System.out.println("They play Spiderman whose villain is " + villain + ".");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		System.out.println();
	}
}
