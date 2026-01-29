/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 10/9
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = 0;
	int y = 0;
	System.out.println("Input an integer.");
	x = sc.nextInt();
	System.out.println("Input another integer.");
	y = sc.nextInt();
	int sum = pow(x,y);
	System.out.println(x+" to the power of "+y+" = "+sum);


		
	}
	public static int pow(int a, int b)
	{
		b = b-1;
		int c = a;
		while (b>0)
		{
			c = c*a;
			System.out.println(c);
			b = b-1;
		}
		return c;
	}
}
