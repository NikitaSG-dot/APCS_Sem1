/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer value. We will output every number up to that value that is a prime number.");
		int value = sc.nextInt();
		printPrimes(value);
	}
	public static boolean checkPrime(int num)
	{
		int counter = num-1;
		while(counter >= 2)
		{
			if (num%counter==0)
			{
				return false;
			}
			counter--;
		}
		return true;
	}
	public static void printPrimes(int num)
	{
		int counter = num;
		boolean check = true;
		while (counter >= 2)
		{
			check = checkPrime(counter);
			if (check == true)
			{
				System.out.println(counter);
			}
			counter--;
		}
	}

}
