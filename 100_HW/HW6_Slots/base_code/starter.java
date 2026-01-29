/*
 *	Author: Nikita Shevchenko-Gallegos
 *  Date: 10/3
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int Num1 = 0;
		int Num2 = 0;
		int Num3 = 0;
		String choice;
		int wager = 0;
		int total = 100;
		while (total > 0)
		{
		
			System.out.println(" ");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("Want to run the slot machines? Y/y or N/n: ");
			choice = sc.nextLine();
			while(!choice.equals("N") && !choice.equals("n") && !choice.equals("Y") && !choice.equals("y"))
			{
				System.out.print("Please put in Y/y or N/n: ");
				choice = sc.nextLine();
			}
			if ((choice.equals("N")) || choice.equals("n"))
			{
			
				break;
			}
			else if (choice.equals("Y") || choice.equals("y"))
			{
				System.out.print("Alright, you have $"+total+" to your name. How much would you like to wager: ");
				wager = sc.nextInt();
				while((wager > total) || (wager <= 0))
				{
					System.out.print("Please put in a number that is at max your total, or at minimum one dollar: ");
					wager = sc.nextInt();
				}
				total = total - wager;
				Num1 = (int)(Math.random()*9)+1;
				Num2 = (int)(Math.random()*9)+1;
				Num3 = (int)(Math.random()*9)+1;
				System.out.println(" ");
				System.out.println("________________");
				System.out.println(" | "+Num1+" | "+Num2+" | "+Num3+" | ");
				System.out.println("________________");
				if (Num1 == Num2 || Num1 == Num3 || Num2 == Num3)
				{
					total = total+(wager*2);
					System.out.println(" ");
					System.out.println("You won! Your wager has doubled. You have $"+total+"!");
				}
				else if (Num1 == Num2 && Num2 == Num3)
				{
					total = total+(wager*3);
					System.out.println(" ");
					System.out.println("You won the jackpot! Congratulations! Your wager has tripled to $"+total+"!");
				}
				else
				{
					System.out.println(" ");
					System.out.println("Im sorry, looks like you lost that round. Better luck next time! You have $"+total+" remaining.");
					System.out.println("---------------------------------------------------------------------");
				}
			}
		}
		System.out.println("Thank you for coming to the casino! Hope to see you again soon!");
	}
}
