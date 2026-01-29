/*
 *	Author:  Nikita Shevchenko-Gallegos
 *  Date: 10/7
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Write a sentence.");
	String sen1 = sc.nextLine();
	System.out.println("Write another sentence.");
	String sen2 = sc.nextLine();
	System.out.println("These outputs are from methods.");
	ToString(sen1);
	ToStringCombined(sen1,sen2);



		
	}
	public static void ToString(String a)
	{
		System.out.println(a);
	}
	public static void ToStringCombined(String a, String b)
	{
		System.out.println(a+" "+b);
	}
}
