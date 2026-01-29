/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in any phrase you want. Remember the spaces between each word.");
		String phrase = sc.nextLine();
		int space;
		String word;
		String ans = "";
		int length = phrase.length();
		while (phrase.indexOf(" ")!= -1)
		{
			space = phrase.indexOf(" ");
			word = phrase.substring(0,space);
			phrase = phrase.substring(space+1);
			ans = word+" "+ans;
			
		}
		
		System.out.print(phrase+" "+ans+" ");
		

		
	}
}
