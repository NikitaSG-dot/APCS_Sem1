/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 9/30
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name;
		name = sc.nextLine();
		System.out.println("How many times do you want to loop?");
		int count = sc.nextInt();
		while (count > 0)
		{
			System.out.println(name);
			count -= 1;
		}


		
	}
}
