import pkg.*;
import java.util.*;

class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to the ATM");
System.out.println("We're going to create a bank account! What info do we know?");
System.out.println("1 - Nothing");
System.out.println("2 - Owner");
System.out.println("3 - Owner and Initial Deposit");
int choice = sc.nextInt();
sc.nextLine();
BankAccount x = new BankAccount();


if(choice == 1){
System.out.println("");
System.out.println("Account successfully created!");
System.out.println("");
System.out.println("---Account Info---");
x.accountInfo();
}
else if(choice == 2){
System.out.println("what is the name of the owner?");
String owner = sc.nextLine();
System.out.println("");
System.out.println("Account successfully created!");
System.out.println("");
System.out.println("---Account Info---");
x.BankAccount(owner);
x.accountInfo();

}




}
}