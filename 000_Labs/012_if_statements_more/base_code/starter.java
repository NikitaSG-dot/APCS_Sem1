/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 8/28
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me two integers.");
		int one = sc.nextInt();
		int two = sc.nextInt();
		if (one == two)
		{
			System.out.println("They are the same value!");
		}
		if (one != two)
		{
			System.out.println("They are not the same value...");
		}
	}
}
