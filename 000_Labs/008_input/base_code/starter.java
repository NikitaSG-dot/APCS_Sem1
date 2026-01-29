/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 8/26
*/

import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("How old are you?");
	int age = sc.nextInt();
	System.out.println("What month were you born?");
	int month = sc.nextInt();
	System.out.println("What is the date of your birthday?");
	int date = sc.nextInt();
	System.out.println("What year were you born?");
	int year = sc.nextInt();
	System.out.println("How much money is a buck fifty?");
	double cash = sc.nextDouble();
	System.out.print("Your name is "+ name + ", you are "+ age + " years old, ");
	System.out.print("You were born on "+month+"/"+date+"/"+year+", ");
	System.out.print("and a buck fifty is worth $"+cash+".");
	}
}
