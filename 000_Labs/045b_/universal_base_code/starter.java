/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        System.out.println("Input any word and I'll hide it.");
        String word = sc.nextLine();
        int len = word.length();
        int h  = 0;
        String [][] crossword = new String[len+5][len+5];
        for(int r = 0; r < crossword.length;r++)
        {
        	for (int c = 0; c < crossword[0].length; c++)
        	{
        		h = (int)(Math.random()*letters.length);
        		crossword[r][c] = letters[h];
        	
        	}
        
        }
		int s = (int)(Math.random()*crossword.length);
		int t = (int)(Math.random()*crossword[0].length);
		int x = 0;
		int horvert = (int)(Math.random()*3);
		if (horvert == 0)
		{
			while(true)
			{
				if (!(t > (crossword[0].length-len)))
				{
					for (int c = t; c < crossword[0].length+len; c++)
					{
						if (!(x+1 > len))
						{
						crossword[s][c] = word.substring(x,x+1);
						x++;
					
						}
					}
					break;
				}
				else 
				{
					 
					while (x < len)
					{
						crossword[s][t] = word.substring(x,x+1);
						x++;
						t--;
						
					}
					break;
				
				}
			}
		}
		else if (horvert == 1)
		{
			while(true)
			{
				if (!(s > (crossword.length-len)))
				{
					for (int r = s; r < crossword.length+len; r++)
					{
						if (!(x+1 > len))
						{
						crossword[r][t] = word.substring(x,x+1);
						x++;
					
						}
					}
					break;
				}
				else 
				{
					 while (x < len)
					 {
					 	crossword[s][t] = word.substring(x,x+1);
						x++;
						s--;
					 }
				}
			}
		 
		
		}
		else if (horvert == 2)
		{
			s = (int)(Math.random()*crossword.length);
			t = (int)(Math.random()*crossword[0].length);
			if (!(s > (crossword.length-len)))
			{
				if (!(t > (crossword.length-len)))
				{
					int r = s;
					int c = t;
					while (x < len)
					{
						crossword[r][c] = word.substring(x,x+1);
						r++;
						c++;
						x++;
					}
				}
				else if (t > crossword.length-len)
				{
					int r = s;
					int c = t;
					while (x < len)
					{
						crossword[r][c] = word.substring(x,x+1);
						r++;
						c--;
						x++;
					}
				}
			}
			else if (s > crossword.length-len)
			{
				if (!(t > (crossword.length-len)))
				{
					int r = s;
					int c = t;
					while (x < len)
					{
						crossword[r][c] = word.substring(x,x+1);
						r--;
						c++;
						x++;
					}
				}
				else if (t > crossword.length-len)
				{
					int r = s;
					int c = t;
					while (x < len)
					{
						crossword[r][c] = word.substring(x,x+1);
						r--;
						c--;
						x++;
					}
				}
			}
		}
		for(String []r : crossword)
        {
        	for (String c : r)
        	{
        		System.out.print(c+" ");
        	
        	}
        	System.out.println(" ");
        }
	}
}
