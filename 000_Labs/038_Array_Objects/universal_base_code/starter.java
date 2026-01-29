/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] wizards = new Wizard[100];
		Warrior[] warriors = new Warrior[100];
		for (int i = 0; i < wizards.length; i++)
		{
			wizards[i] = new Wizard();
		}
		for (int i = 0; i < warriors.length; i++)
		{
			warriors[i] = new Warrior();
 		}
 		int i = 0;
 		int h = 0;
 		while(true)
 		{
 			
 			if(warriors[i].isDead() == true && i!=99)
 			{
 				i++;
 			}
 			else if (warriors[i].isDead() == true && i==99)
 			{
 				System.out.println("Wizards win with "+(100-h)+" units left.");
 				break;
 			}
 			wizards[h].attack(warriors[i]);
 			if(wizards[h].isDead() == true && h!=99)
 			{
 				h++;
 			}
 			else if (wizards[h].isDead() == true && h==99)
 			{
 				System.out.println("Warriors win with "+(100-h)+" units left.");
 				break;
 			}
 			warriors[i].attack(wizards[h]);
 		}
	}
}
