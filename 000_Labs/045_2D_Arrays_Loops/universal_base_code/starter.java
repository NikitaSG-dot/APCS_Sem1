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
		System.out.println("How many rows would you like your 2d array to be?");
		int rows = sc.nextInt();
		System.out.println("How many columns would you like your 2d array to be?");
		int columns = sc.nextInt();
		int [][] arr = new int[rows][columns];
		for (int x = 0; x < arr.length; x++)
		{
			for (int y = 0; y < arr[0].length; y++)
			{
				arr[x][y] = (int)(Math.random()*10)+1;
				System.out.print(arr[x][y]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("What row would you like to get the average of?");
		int choice = sc.nextInt();
		double average = 0.0;
		for (int x = 0; x < arr[0].length; x++)
		{
			average = average + arr[choice][x];
		}
		System.out.println("The average is "+average/arr[0].length);
		double totavg = 0.0;
		for (int x = 0; x < arr.length; x++)
		{
			for (int y = 0; y < arr[0].length; y++)
			{
				totavg = totavg+arr[x][y];
			}
			
		}
		System.out.println("The total average is "+totavg/(arr[0].length*arr.length));

		
	}
}
