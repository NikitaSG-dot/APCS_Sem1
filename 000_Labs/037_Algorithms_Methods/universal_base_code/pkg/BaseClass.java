/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
	
		
	}
	public void toStringArray(int []x)
	{
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
	}
	public int getArrayAverage(int []x)
	{
		int total = 0;
		for (int i = 0; i < x.length; i++)
		{
			total+=x[i];
		}
		total/=(x.length-1);
		return total;
	}
	public int getArrayMin(int []x )
	{
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++)
		{
			if (x[i]< min)
			{
				min = x[i];
			}
		}
		return min;
	}
	public int getArrayMax(int []x)
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < x.length; i++)
		{
			
		
			if (x[i] > max)
			{
				max = x[i];
			}
	
		}
		return max;
	}
	

}

