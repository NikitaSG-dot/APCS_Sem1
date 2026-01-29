/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		boolean guess = false;
		int number = (int)(Math.random()*(1000-1)+1);
		System.out.println("Please guess a number between 1-1000.");
		int numGuess;
		while(guess == false)
		{
			numGuess = sc.nextInt();
			if (numGuess == number)
			{
				System.out.println("You are correct!");
				guess = true;
			}
			else if (numGuess > number)
			{
				System.out.println("That is wrong. The correct number is smaller than that.");
				
			} 
			else if (numGuess < number)
			{
				System.out.println("That is wrong. The correct number is larger than that.");
			}
			
		}


		
	}
}
