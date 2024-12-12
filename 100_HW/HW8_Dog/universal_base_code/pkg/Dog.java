package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	String name;
	int age;
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String name) {
		this.name = name;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		age = 1;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		breed = "dog dog";
	}
	
	public void setName(String input) {
		name = input;
	}
	
	public void setAge(int input) {
		age = input;
	}
	
	public void setBreed(String input) {
		breed = input;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isSleeping() {
		int chance = (int)(Math.random() * 100);
		if(chance < 50) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + " barks!");
	}

}
