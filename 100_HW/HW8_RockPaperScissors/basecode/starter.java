/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    while (true)
    {
        System.out.println("Would you like to play the computer [y]? or would you like the computer to play itself [n]? You can also quit [q].");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        String item;
        String choice2;
        String choice3 = "";
        String choice4;
        int x;
        int y;
        int win = 0;
        int lose = 0;
        int tie = 0;
        if (choice.equals("y") || choice.equals("Y"))
        {
            System.out.println("Please input Rock, Paper, or Scissors.");
            choice2 = sc.nextLine();
            item = getObject(choice);
            x = compare2(choice2,item);
            if (x == 0)
            {
                System.out.println("You tied.");
            }
            else if (x == 1)
            {
                System.out.println("You won!");
            }
            else if (x == 2)
            {
                System.out.println("You lose.");
            }
            else if (x == 67)
            {
                System.out.println("That is not one of the optional roles. Please try again.");
            }
        }
        else if (choice.equals("n") || choice.equals("N"))
        {
            System.out.println("How many times do you want the computer to play against itself?");
            y = sc.nextInt();
            while(y>0)
            {
                choice4 = getObject(choice3);
                item = getObject(choice);
                x = compare2(choice4, item);
            if (x == 0)
            {
                tie++;
                
                y--;
            }
            else if (x == 1)
            {
                win++;
               
                y--;
            }
            else if (x == 2)
            {
                lose++;
            
                y--;
            }
                
            }
            System.out.println("Player 1 won "+win+" times.");
            System.out.println("Player 2 won "+lose+" times.");
            System.out.println("There were "+tie+" ties.");
        }
        else if (choice.equals("q") || choice.equals("Q"))
        {
            System.out.println("Thanks for playing!");
            break;
        }
        else
        {
            System.out.println("Please input one of the three options.");
        }
    }
    }
    public static String getObject(String choice)
    {
         String item;
         int object = (int)(Math.random()*(3));
         if (object == 0)
         {
             item = "rock";
         }
         else if (object == 1)
         {
             item = "paper";
         }
         else if (object == 2)
         {
             item = "scissors";
         }
         else
         {
             item = "other";
         }
         return item;
         
    }
    public static int compare2(String a, String b)
    {
        if ((a.equals("Rock") || a.equals("rock")) && (b.equals("scissors")))
            {
                return 1;
            }
            else if ((a.equals("Rock") ||a.equals("rock")) && (b.equals("paper")))
            {
                return 2;
            }
            else if ((a.equals("Rock") || a.equals("rock")) && (b.equals("rock")))
            {
                return 0;
            }
            else if ((a.equals("Paper") || a.equals("paper")) && (b.equals("rock")))
            {
                return 1;
            }
            else if ((a.equals("Paper") || a.equals("paper")) && (b.equals("paper")))
            {
               return 0;
            }
            else if ((a.equals("Paper") || a.equals("paper")) && (b.equals("scissors")))
            {
                return 2;
            }
            else if ((a.equals("Scissors") || a.equals("scissors")) && (b.equals("rock")))
            {
                return 2;
            }
            else if ((a.equals("Scissors") || a.equals("scissors")) && (b.equals("paper")))
            {
               return 1;
            }
            else if ((a.equals("Scissors") || a.equals("scissors")) && (b.equals("scissors")))
            {
                return 0;
            }
            else
            {
                return 67;
            }
    }
}
