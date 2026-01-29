/*
 *	Author: Nikita Shevchenko-Gallegos
 *  Date: 9/16/25
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess the word in two hints!");
		int game = (int)(Math.random()*3+1);
		String guess1;
		String guess2;
		if (game == 1)
		{
			System.out.println("It's a sandbox game!");
			System.out.println("What is your guess?");
			guess1 = sc.nextLine();
			if (guess1.equals("Minecraft") || guess1.equals("minecraft"))
			{
				System.out.println("You are correct! Nice job.");
			}
			else
			{
				System.out.println("Incorrect! Another hint is that it is the best-selling individual game of all time!");
				guess2 = sc.nextLine();
				if (guess2.equals("Minecraft") || guess2.equals("minecraft"))
				{
					System.out.println("You are correct! Nice job.");
				}
				else
				{
					System.out.println("You are incorrect, the correct answer was minecraft! Good try!");
				}
			}
		}
		if (game == 2)
		{
			System.out.println("It's a food that the teenage mutant ninja turtles love!");
			System.out.println("What is your guess?");
			guess1 = sc.nextLine();
			if (guess1.equals("Pizza") || guess1.equals("pizza"))
			{
				System.out.println("You are correct! Nice job.");
			}
			else
			{
				System.out.println("Incorrect! Another hint is that it is usually cut up into slices shaped like triangles!");
				guess2 = sc.nextLine();
				if (guess2.equals("Pizza") || guess2.equals("pizza"))
				{
					System.out.println("You are correct! Nice job.");
				}
				else
				{
					System.out.println("You are incorrect, the correct answer was pizza! Good try!");
				}
			}
		}
		if (game == 3)
		{
			System.out.println("It's a popular tv show about a certain serial killer!");
			System.out.println("What is your guess?");
			guess1 = sc.nextLine();
			if (guess1.equals("Dexter") || guess1.equals("dexter"))
			{
				System.out.println("You are correct! Nice job.");
			}
			else
			{
				System.out.println("Incorrect! Another hint is that he is a vigilante that kills other killers!");
				guess2 = sc.nextLine();
				if (guess2.equals("Dexter") || guess2.equals("dexter"))
				{
					System.out.println("You are correct! Nice job.");
				}
				else
				{
					System.out.println("You are incorrect, the correct answer was Dexter! Good try!");
				}
			}
		}
	}
}
