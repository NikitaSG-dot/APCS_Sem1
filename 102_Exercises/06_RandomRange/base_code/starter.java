/*
 *	Author: Nikita Shevchenko-Gallegos
 *  Date: 9/16/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number.");
		System.out.print("Please enter an integer.");
		int one = sc.nextInt();
		System.out.println("Please enter another integer. (Bigger than the first)");
		int two = sc.nextInt();
		System.out.println("Your range is "+one+" to "+two+".");
		System.out.println("Here are five numbers guaranteed within that range.");
		System.out.println((int)(Math.random()*(two-one)+one));
		System.out.println((int)(Math.random()*(two-one)+one));
		System.out.println((int)(Math.random()*(two-one)+one));
		System.out.println((int)(Math.random()*(two-one)+one));
		System.out.println((int)(Math.random()*(two-one)+one));
	}
}
