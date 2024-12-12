/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee veer = new Employee(1234, "Veer", "Shah", 6743485987.17);
		System.out.println("Before raise: ");
		
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		veer.employeeToString();
		
		
		System.out.println("Michael's Annual Salary: " + michael.getAnnualSalary());
		System.out.println("Dwight's Annual Salary: " + dwight.getAnnualSalary());
		System.out.println("Jim's Annual Salary: " + jim.getAnnualSalary());
		System.out.println("Pam's Annual Salary: " + pam.getAnnualSalary());
		System.out.println("Veer's Annual Salary: " + veer.getAnnualSalary());		
		
		System.out.println();
		
		System.out.println("After raise:");
		
		michael.raiseSalary(30);
		dwight.raiseSalary(20);
		jim.raiseSalary(10);
		pam.raiseSalary(60);
		veer.raiseSalary(1000000000);
		
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		veer.employeeToString();
		
		
		System.out.println("Michael's Annual Salary: " + michael.getAnnualSalary());
		System.out.println("Dwight's Annual Salary: " + dwight.getAnnualSalary());
		System.out.println("Jim's Annual Salary: " + jim.getAnnualSalary());
		System.out.println("Pam's Annual Salary: " + pam.getAnnualSalary());
		System.out.println("Veer's Annual Salary: " + veer.getAnnualSalary());
		
		
	}
}
