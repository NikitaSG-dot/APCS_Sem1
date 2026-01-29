/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		boolean sleep1;
		boolean sleep2;
		Dog snowball = new Dog();
		snowball.NameAge("Snowball", 5);
		snowball.DogToString();
		Dog WorldDestroyer = new Dog();
		WorldDestroyer.NameBreed("World Destroyer", "chihuahua");
		WorldDestroyer.DogToString();
		sleep1 = snowball.isSleeping();
		if (sleep1 == true)
		{
			System.out.println("The first dog is asleep!");
		}
		else if (sleep1 == false)
		{
			snowball.bark("Snowball");
		}
		sleep2 = WorldDestroyer.isSleeping();
		if (sleep2 == true)
		{
			if (sleep1 == true)
			{
				System.out.println("The second dog is also asleep.");
			}
			else if (sleep1 == false)
			{
				WorldDestroyer.bark("WorldDestroyer");
			}
		}
		else if (sleep2 == false)
		{
			if (sleep1 == true)
			{
				System.out.println("The second dog relaxes awake.");
			}
			else if (sleep1 == false)
			{
				WorldDestroyer.bark("World Destroyer");
			}
		}
		



	}
}
