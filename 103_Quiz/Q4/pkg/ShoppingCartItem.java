package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int itemQuantity;
    public ShoppingCartItem()
    {
        itemName = "Nothing";
        itemCost = 0.0;
        itemQuantity = 0;
    }
    public ShoppingCartItem(String n, double c, int q)
    {
        itemName = n;
        itemCost = c;
        itemQuantity = q;
    }
    public void cartToString()
    {
        System.out.println("You have "+itemQuantity+" of "+itemName+" for $"+itemCost+" each.");
    }
    public String getItemName()
    {
        return itemName;
    }
    public int getQuantity()
    {
        return itemQuantity;
    }
    public double getTotalCost()
    {
        double total = itemCost*itemQuantity;
        return total;
    }
    public double getTotalWithTax()
    {
        double total = getTotalCost();
        double tax = total*0.12;
        total+=tax;
        return total;
    }
    public double quantityToCostCalculator(int q)
    {
        double total = itemCost*q;
        return total;
    }
    public boolean compareItemCost(ShoppingCartItem a)
    {
       if (itemCost < a.itemCost)
       {
           return true;
       }
       else 
       {
           return false;
       }
    }
   
}
