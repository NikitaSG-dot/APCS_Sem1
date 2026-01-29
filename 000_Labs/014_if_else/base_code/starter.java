/*
 *	Author:  Nikita Shevchenko Gallegos
 *  Date: 8/28
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("I am thinking of a number between 1-1000. Please guess it.");
		int guess = sc.nextInt();
		double number = (int)(Math.random()*1000+1);
		if (guess == number)
		{
			System.out.println("You guessed it! Nice job.");
		}
		else
		{
			System.out.println("You got it wrong. I was thinking of "+number);
		}
	}
}
