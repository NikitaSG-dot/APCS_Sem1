/*
 *	Author:  Nikita Shevchenko-Gallegos
 *  Date: 8/29
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Warrior, Wizard, or Rogue?");
		String character = sc.nextLine();
		if(character.equals("Warrior")|| character.equals("warrior"))
		{
			System.out.println("You have chosen the warrior class.");
		}
		else if (character.equals("Wizard") || character.equals("wizard"))
		{
			System.out.println("You have chosen to be a wizard.");
		}
		else if (character.equals("rogue") || character.equals("Rogue"))
		{
			System.out.println("You have selected to live as a rogue.");
		}
		else
		{
			System.out.println("You misspelled your choice. Please try again.");
		}
	}
}
