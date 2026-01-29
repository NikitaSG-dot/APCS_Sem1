/*
 *	Author:  Nikita Shevchenko-Gallegos
 *  Date: 9/2
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Monarch of motion.");
		String title = sc.nextLine();
		System.out.println("Do you want to be a Warrior, Wizard, or Rogue?");
		String character = sc.nextLine();
		int strength = 0;
		int dexterity = 0;
		int charisma = 0;
		int intelligence = 0;
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
			System.out.println("You misspelled your choice. Please rerun the program.");
		}
		System.out.println("You have 20 skill points that you can spend on Strength, Dexterity, Charisma, and Intelligence. Spend them wisely.");
		int skillpoints = 20;
		System.out.println("How many skill points will you spend on strength? 1-10 points.");
		strength = sc.nextInt();
		if (strength > 10 || strength < 1)
		{
			System.out.println("Please input a value between 1-10 points.");
			strength = sc.nextInt();
		}
		skillpoints = skillpoints - strength;
		System.out.println("You have "+skillpoints+" Skill points left.");
	if (skillpoints > 0){
		System.out.println("How many skill points will you spend on dexterity? 1-10 points.");
		dexterity = sc.nextInt();
		if (dexterity > 10 || dexterity < 1)
		{
			System.out.println("Please input a value between 1-10 points.");
			dexterity = sc.nextInt();
		}
		skillpoints = skillpoints - dexterity;
			System.out.println("You have "+skillpoints+" Skill points left.");
	}
	
	if (skillpoints > 0){
		
		System.out.println("How many skill points will you spend on charisma? 1-10 points.");
		charisma = sc.nextInt();
		if (charisma > 10 || charisma < 1)
		{
			System.out.println("Please input a number between 1-10 points.");
			charisma = sc.nextInt();
		}
		skillpoints = skillpoints - charisma;
		System.out.println("You have "+skillpoints+" Skill points left.");
	}
	if (skillpoints > 0){
		
	
		System.out.println("How many skill points will you spend on intelligence? 1-10 points.");
		intelligence = sc.nextInt();
		if (intelligence > 10 || intelligence < 1)
		{
			System.out.println("Please input a number between 1-10 points.");
			intelligence = sc.nextInt();
		}
		skillpoints = skillpoints - intelligence;
		System.out.println("You have "+skillpoints+" Skill points left.");
	}
		
		System.out.println("---------------------------------------------");
		System.out.println("You are "+name+ ", AKA "+title+".");
		System.out.println("You are a "+character);
		System.out.println("You delegated your stat points towards:");
		System.out.println("Strength: "+strength);
		System.out.println("Dexterity: "+dexterity);
		System.out.println("Charisma: "+charisma);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("You have "+skillpoints+" skill points left over.");
		System.out.println("Good luck on your adventure! Happy travels!");
	}
}
