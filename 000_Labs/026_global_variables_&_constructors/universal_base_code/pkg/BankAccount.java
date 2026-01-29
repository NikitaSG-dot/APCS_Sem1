package pkg;
import java.util.*;

public class BankAccount {
// -------GLOBAL VARIABLES-------
private String owner;
private int accountNum;
private int balance;
private boolean isActive;
private int nextAccountNum = (int) (Math.random()*951)+50;

// -------CONSTRUCTORS-------
public BankAccount(){ // Default
owner = "unkown";
accountNum = nextAccountNum;
balance = 0;
isActive = true;
}

public void BankAccount(String o){ // Owner
owner = o;
balance = 0;
isActive = true;
accountNum = nextAccountNum++;
}

public void BankAccount(String o, int initialDeposit) {
owner = o;
balance = initialDeposit;
isActive = true;
accountNum = nextAccountNum++;
}

// -------METHODS-------
public void checkBalance(){
System.out.println("Current balance: " + balance);
}

public void accountInfo() {
System.out.println("Owner: " + owner);
System.out.println("Account Number: " + accountNum);
System.out.println("Balance: $" + balance);
System.out.println("Status: " + isActive);
System.out.println("------------------------");
}


}