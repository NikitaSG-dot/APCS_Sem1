/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        double item1Price = 29.99;
        double item2Price = 40.50;
        double item3Price = 5.99;
        System.out.println("☕Welcome to the coff cafe!☕");
        System.out.println("Here's the menu:");
        System.out.println("1. 🧇 Waffles - $"+item1Price+" per piece");
        System.out.println("2. 🥞 Pancakes - $"+item2Price);
        System.out.println("3. 🧂 Salt - $"+item3Price);
        
        System.out.println("What is the name for the order?");
        String name = sc.nextLine();
        
        System.out.println();
        System.out.println("How many waffle pieces would you like?");
        int quant1 = sc.nextInt();
        System.out.println("How many pancakes would you like?");
        int quant2 = sc.nextInt();
        System.out.println("How much salt would you like?");
        int quant3 = sc.nextInt();
        double Item1total = quant1*item1Price;
        double Item2total =quant2*item2Price;
        double Item3total = quant3*item3Price;
        double total = Item1total+Item2total+Item3total;
        System.out.println("Your current total is: $"+total);
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = total*(tipPercent/100);
        double GrandTotal = total+tip;
        System.out.println("----------------------------------------------");
        System.out.println(name+"'s receipt: ");
        System.out.println(quant1+" x Waffles = $"+Item1total);
        System.out.println(quant2+" x Pancakes = $"+Item2total);
        System.out.println(quant3+" x salt = $"+Item3total);
        System.out.println("You tipped "+tipPercent+"% of the total, which = "+tip);
        System.out.println("----------------------------------------------");
        System.out.println(name+"'s grand total is $"+GrandTotal);
        System.out.println("----------------------------------------------");
        System.out.println("Thank you for shopping at coff cafe!");
        
	}
}
