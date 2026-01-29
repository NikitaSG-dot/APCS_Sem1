/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first name and last name with a space in between.");
	String name = sc.nextLine();
	int space = name.indexOf(" ");
	String last = name.substring(space);
	System.out.println("Your last name is"+last);
	

		
	}
}
