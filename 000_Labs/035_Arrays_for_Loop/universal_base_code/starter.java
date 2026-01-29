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
	int [] arr = new int[1000];
		int len = arr.length;
	for(int counter1 = 0; counter1 < len; counter1++)
	{
		arr[counter1] = (int)(Math.random()*(1000)+1);
		System.out.println(arr[counter1]);
	}

		
	}
}
