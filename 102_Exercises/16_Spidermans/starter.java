/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman Jonah = new Spiderman("J Jonah Jameson", 51, "Peter Parker");
		Jonah.SpidermanToString();
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		tobey.SpidermanToString();
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Andrew.SpidermanToString();
		Spiderman Tom = new Spiderman("Tom Holland", 27, "Vulture");
		Tom.SpidermanToString();
		Tom.fight();
		Tom.printArt();
		
		
	}
}
