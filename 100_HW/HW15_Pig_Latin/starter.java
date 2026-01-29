/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a sentence.");
		String phrase = sc.nextLine();
		String part;
		String word;
		int space;
		while (phrase.indexOf(" ")!= -1)
		{
			space = phrase.indexOf(" ");
			word = phrase.substring(0,space);
			if ((word.substring(0,1).equalsIgnoreCase("a")) || (word.substring(0,1).equalsIgnoreCase("e")) || (word.substring(0,1).equalsIgnoreCase("i")) || (word.substring(0,1).equalsIgnoreCase("o")) || (word.substring(0,1).equalsIgnoreCase("u")))
			{
				System.out.print(word+"-way ");
			}
			else if (word.substring(1,2).equalsIgnoreCase("h"))
			{
				part = word.substring(0,2);
				word = word.substring(2);
				System.out.print(word+"-"+part+"ay ");
			}
			else
			{
				part = word.substring(0,1);
				word = word.substring(1);
				System.out.print(word+"-"+part+"ay ");
			}
			phrase = phrase.substring(space+1);
			
			
		}
		space = phrase.indexOf(" ");
			word = phrase.substring(0);
			if ((word.substring(0,1).equalsIgnoreCase("a")) || (word.substring(0,1).equalsIgnoreCase("e")) || (word.substring(0,1).equalsIgnoreCase("i")) || (word.substring(0,1).equalsIgnoreCase("o")) || (word.substring(0,1).equalsIgnoreCase("u")))
			{
				System.out.print(word+"-way ");
			}
			else if (word.substring(1,2).equalsIgnoreCase("h"))
			{
				part = word.substring(0,2);
				word = word.substring(2);
				System.out.print(word+"-"+part+"ay ");
			}
			else
			{
				part = word.substring(0,1);
				word = word.substring(1);
				System.out.print(word+"-"+part+"ay ");
			}
			phrase = phrase.substring(space+1);
			
		
		
	}
}
