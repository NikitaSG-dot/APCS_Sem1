/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();
		int amount = 0;
		int check = 0;
		String total = "";
		String word = "";


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			if (choice.equalsIgnoreCase("file"))
			{
				System.out.println(textFile);
			}
			else if (choice.equalsIgnoreCase("print"))
			{
				printsArray(arr);
			}
			else if (choice.equalsIgnoreCase("printBack"))
			{
				printsArrayBack(arr);
			}
			else if (choice.equalsIgnoreCase("printNum"))
			{
				System.out.println("How many words of the text do you want?");
				amount = sc.nextInt();
				sc.nextLine();
				printsNumber(arr, amount);
			}
			else if (choice.equalsIgnoreCase("change"))
			{
				System.out.println("What text would you like to change to?");
			 textFile = sc.nextLine();
				 arr = fillArray(textFile);
			}
			else if (choice.equalsIgnoreCase("check"))
			{
				System.out.println("What word would you like to look for?");
				word = sc.nextLine();
				System.out.println("The word "+word+" has "+checksArray(arr,word)+" uses in the text.");
				
			}
			else if (choice.equalsIgnoreCase("common"))
			{
				System.out.println("The most common word is "+mostCommon(arr));
			}
			else
			{
				System.out.println("Sorry, that isn't an option. Try again.");
			}

			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
		for (int i = 0; i <arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
		for (int i = arr.length-1; i>0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		for (int i = 0; i < num; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
	int x = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if(check.equals(arr[i]))
			{
				x++;
			}
		}
		return x;	// Dummy value, delete when needed.
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		int [] arr2 = new int[arr.length];
		int h = 0;
		String q = "";
		
		for (int i = 0; i < arr.length; i++)
		{
		
			for(int g = 0; g < arr2.length; g++)
			{
				for (int x = 0; x < arr.length; x++)
				{
					if (arr[x] == arr[i])
					{
						
						arr2[g]++;
					}
					
				}
				if (h<arr2[g])
				{
					h = arr2[g];
					q = arr[i];
				}
			
			}
			
		}
		
		
		
		return q;	// Dummy value, delete when needed.
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
