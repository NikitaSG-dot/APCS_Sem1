/*
 *	Author:  Nikita Shevchenko-Gallegos
 *  Date: 11/5/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	int [] arr = new int[10];
	int len = arr.length;
	int counter1 = 0;
	int counter2 = 9;
	while (counter1 < len)
	{
		arr[counter1] = counter2;
		
		System.out.println(arr[counter1]);
		counter1++;
		counter2--;
	}
	
		
	}
}
