package com.alexandermervar;

import java.util.HashMap;
import java.util.Map;

public class Receipt {

    private HashMap<Item, Integer> purchasedItems = new HashMap<Item, Integer>();
    private Customer owningCustomer;
    
    //Constructor
    public Receipt(HashMap<Item, Integer> purchasedItems, Customer owningCustomer) {
        this.purchasedItems = purchasedItems;
        this.owningCustomer = owningCustomer;
    }

    public String displayReceipt() {
        String outputString = "The following receipt is for Customer:\n" + owningCustomer.getCustomerName() +"\nItem (Quantity):\n";
        int itemCount = 0;
        double runningTotal = 0.0;

        for (Map.Entry<Item, Integer> entry : purchasedItems.entrySet()) {
            itemCount++;
            outputString += itemCount + ". " + entry.getKey().getItemName() + "-" + entry.getKey().getItemPrice() + " " + entry.getValue() + "\n";
            outputString += "Item Cost: " + entry.getKey().getItemPrice() * (double) entry.getValue() + "\n";
            runningTotal += entry.getKey().getItemPrice() * (double) entry.getValue();
        }

        outputString += "\nTotal: $" + runningTotal;

        return outputString;
    }
    
}
