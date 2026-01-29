/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int [] arr2 = new int[1001];
		 int len1 = arr1.length;
		 int counter1 = 0;
		 int counter2 = 0;
		 while(counter1 < len1-1)
		 {
		 	
		 	counter2+=3;
		 	arr1[counter1] = counter2;
		 	System.out.print(arr1[counter1]+", ");
		 	counter1++;
		 }
		 System.out.println("----------------------------------------------------------------------------------------------------------");
		 int counter3 = 0;
		 int counter4 = 1000;
		 while (counter3 <len1)
		 {
		 	arr2[counter3] = counter4;
		 	System.out.print(arr2[counter3]+", ");
		 	counter3++;
		 	counter4--;
		 }
	}
}
