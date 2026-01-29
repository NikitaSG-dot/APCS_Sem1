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
		michael.raiseSalary(10);
		michael.employeeToString();
		System.out.println("Annual salary: "+michael.getAnnualSalary());
		System.out.println("");
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.raiseSalary(21);
		Dwight.employeeToString();
		System.out.println("Annual salary: "+Dwight.getAnnualSalary());
		System.out.println("");
		Employee Jim = new Employee(2474, "Jim","Halpert", 4416.66);
		Jim.raiseSalary(41);
		Jim.employeeToString();
		System.out.println("Annual salary: "+Jim.getAnnualSalary());
		System.out.println("");
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.raiseSalary(61);
		Pam.employeeToString();
		System.out.println("Annual salary: "+Pam.getAnnualSalary());
		System.out.println("");
		Employee Jesse = new Employee(2009, "Jesse", "Pinkman", 617000);
		Jesse.raiseSalary(67);
		Jesse.employeeToString();
		System.out.println("Annual salary: "+Jesse.getAnnualSalary());
		System.out.println("");
		
	}
}
