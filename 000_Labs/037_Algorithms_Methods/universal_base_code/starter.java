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
	int [] arr = new int[100];
	for (int i = 0; i < arr.length; i++)
	{
		arr[i] = (int)(Math.random()*(100)+1);
	}
	BaseClass array = new BaseClass();
	array.toStringArray(arr);
	System.out.print("The average number of the array is ");
	System.out.println(array.getArrayAverage(arr));
	System.out.print("The minimum number of the array is ");
	System.out.println(array.getArrayMin(arr));
	System.out.print("The maximum number of the array is ");
	System.out.println(array.getArrayMax(arr));
	

		
	}
}
