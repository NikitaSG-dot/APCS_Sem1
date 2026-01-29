/*
 *	Author: Nikita Shevchenko-Gallegos
 *  Date: 9/9
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input two integers.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int OddEven1 = num1%2;
		int OddEven2 = num2%2;
		int x1 = num1%3;
		int x2 = num1%4;
		int x3 = num1%5;
		int x4 = num2%3;
		int x5 = num2%4;
		int x6 = num2%5;
		System.out.println("------------------------------ ");
		if (OddEven1 == 1)
		{
			System.out.println(num1+" is not divisible by 2.");
		} 
		else if (OddEven1 != 1)
		{
			System.out.println(num1+" is divisible by 2.");
		}
		if (x1 == 0)
		{
			System.out.println(num1+" is divisible by 3");
		}
		if (x2 == 0)
		{
			System.out.println(num1+" is divisible by 4");
		}
		if (x3 == 0)
		{
			System.out.println(num1+" is divisible by 5");
		}
		if (x1 != 0 && x2 != 0 && x3 != 0)
		{
			System.out.println(num1+" is not divisible by 3, 4, or 5.");
		}
		System.out.println("------------------------------ ");
		if (OddEven2 == 1)
		{
			System.out.println(num2+" is not divisible by 2.");
		} 
		else if (OddEven2 != 1)
		{
			System.out.println(num2+" is divisible by 2.");
		}
			if (x4 == 0)
			{
				System.out.println(num2+" is divisible by 3");
			}
			if (x5 == 0)
			{
				System.out.println(num2+" is divisible by 4");
			}
			if (x6 == 0)
			{
				System.out.println(num2+" is divisible by 5");
			}
			if (x4 != 0 && x5 != 0 && x6 != 0)
			{
				System.out.println(num2+" is not divisible by 3, 4, or 5.");
			}
	}
}
