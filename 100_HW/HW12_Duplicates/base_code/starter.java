/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] x = new int[20];
		System.out.println("Here are your numbers.");
		for (int i = 0; i < x.length; i++)
		{
			x[i] = (int)(Math.random()*(10)+1);
			System.out.print(x[i]+" ");
		}
		int rand = (int)(Math.random()*(10)+1);
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("The random number is "+rand);
		int dup = 0;
		for (int i = 0; i < x.length; i++)
		{
			if(x[i]==rand)
			{
				System.out.println("Duplicate found at index "+i);
				dup+=1;
			}
		}
		System.out.println("The total number of duplicates is "+dup);
		System.out.println("---------------------------------------");
		System.out.println("Checking for two in a row");
		
		for (int i = 0; i < x.length-1; i++)
		{
			if (x[i]==x[i+1])
			{
				System.out.println(i+" and "+(i+1)+" are duplicates, being number "+x[i]);
			}
		}
	}
}
