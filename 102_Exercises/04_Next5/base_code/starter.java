/*
 *	Author: Nikita Shevchenko-Gallegos
 *  Date: 9/9
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please input an integer value.");
	int number = sc.nextInt();
	double number2 = number;
	System.out.println("Here are the next five numbers!");
	System.out.print(number+", ");
	System.out.print(number+1+", ");
	System.out.print(number+2+", ");
	System.out.print(number+3+", ");
	System.out.print(number+4+", ");
	System.out.println(number+5);
	System.out.println("Here are the next 5 multiples of your number!");
	System.out.print(number*1+", ");
	System.out.print(number*2+", ");
	System.out.print(number*3+", ");
	System.out.print(number*4+", ");
	System.out.print(number*5+", ");
	System.out.println(number*6);
	System.out.println("Here is your number divided by 100!");
	double divide1 = number2/100;
	System.out.println(divide1);
	System.out.println("Here is your number divided by 10!");
	double divide2 = number2/10;
	System.out.println(divide2);
	

	}
}
