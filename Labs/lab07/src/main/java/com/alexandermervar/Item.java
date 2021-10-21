package com.alexandermervar;

public class Item {
    
    private String itemName;
    private double itemPrice;
    
    //Constructor
    public Item(String itemName, double itemPrice) {
        this.setItemName(itemName);
        this.setItemPrice(itemPrice);
    }
    
    //ItemName Getters and Setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    //ItemPrice Getters and Setters
    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
