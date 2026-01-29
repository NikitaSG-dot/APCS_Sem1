/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		
	}

	public static void printArray(String[] arr){
		int len = arr.length;
		for (int p = 0; p < len; p++ )
		{
			System.out.print(arr[p]+", ");
		}
	}

	public static void leftShift(String [] arr){
		int len = arr.length;
		String first = arr[0];
		for (int p = 0; p < len; p++)
		{
			if (p == len-1)
			{
				arr[p] = first;
			}
			else
			{
			arr[p] = arr[p+1];
			}
		}
	}
	public static void leftShift(String [] arr, int num){
		for (int p = 0; p < num; p++)
		{
			
		
		leftShift(arr);
		}
	}
	
}
