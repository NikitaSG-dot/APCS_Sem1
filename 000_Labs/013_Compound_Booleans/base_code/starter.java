/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 8/28
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 integers.");
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		if ((one > two) && (one > three))
		{
			System.out.println("The biggest integer is "+one);
		}
		if ((two > one) && (two > three))
		{
			System.out.println("The biggest integer is "+two);
		}
		if ((three > one) && (three > two))
		{
			System.out.println("The biggest integer is "+three);
		}
		if ((one < two) && (one < three))
		{
			System.out.println("The smallest integer is "+one);
		}
		if ((two < one) && (two < three))
		{
			System.out.println("The smallest integer is "+two);
		}
		if ((three < one) && (three < two))
		{
			System.out.println("The smallest integer is "+three);
		}
	}
}
