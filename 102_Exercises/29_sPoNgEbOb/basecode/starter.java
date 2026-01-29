/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a word or phrase.");
		String phrase = sc.nextLine();
		System.out.println("Your word/phrase in sponge case is: ");
		String word = "";
		while (phrase.indexOf(" ") != -1)
		{
			word = phrase.substring(0,phrase.indexOf(" "));
			System.out.print(translate(word)+ " ");
			phrase = phrase.substring(phrase.indexOf(" ")+1);
		}
		System.out.print(translate(word));
	}
	public static String translate(String w)
	{
		int len = w.length();
		boolean c = false;
		String letter;
		String ans = "";
		for (int i = 0; i < len; i++)
		{
			
			letter = w.substring(i,i+1);
			if (c == true)
			{
				letter = letter.toUpperCase();
				
				c = false;
			}
			else if (c == false)
			{
				letter = letter.toLowerCase();
				
				c = true;
			}
			ans = ans+letter;
			
		}
		return ans;
	}
}
