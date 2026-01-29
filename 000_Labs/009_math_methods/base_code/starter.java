/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 8/27
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(Math.max(13-6*11,30%7*(-2)));
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		System.out.println(Math.pow(37 / 3, 35 % 21));
		double one = Math.pow(2,14%3);
		double two = Math.sqrt(2*6);
		System.out.println(Math.max(one,two));
		System.out.println("Please enter a double.");
		double three = sc.nextDouble();
		System.out.println("Please enter a second double.");
		double four = sc.nextDouble();
		System.out.println(Math.max(three,four));
		System.out.println(Math.sqrt(four));
		System.out.println(Math.pow(three,four));
	}
}
