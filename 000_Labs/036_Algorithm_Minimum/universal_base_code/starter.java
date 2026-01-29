/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random()*(200-51)+51);
		int [] arr = new int[x];
		int len = arr.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int total = 0;
		for(int i = 0; i < len; i++)
		{
			arr[i] = (int)(Math.random()*(100)+1);
			if (arr[i]< min)
			{
				min = arr[i];
			}
			if (arr[i] > max)
			{
				max = arr[i];
			}
			total+=arr[i];
		}
		total= total/len-1;
		System.out.println("The minimum value of the array is "+min);
		System.out.println("The maximum value of the array is "+max);
		System.out.println("The average value of the array is "+total);
		System.out.println("There were "+len+" values in the array.");
		
	


		
	}
}
