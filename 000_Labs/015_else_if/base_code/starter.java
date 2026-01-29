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
		else if (guess > number)
		{
			System.out.println("Your guess is too high. The number was "+number);
		}
		else if (guess < number)
		{
			System.out.println("Your guess is too low. The number was "+number);
		}
		
	}
}

