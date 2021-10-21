package com.alexandermervar;

import java.util.HashMap;

public class Customer {
    
    private String customerName;
    private double customerBudget;
    private boolean isCustomerMask;
    private HashMap<Item, Integer> shoppingCart = new HashMap<>();

    //Constructor
    public Customer(String customerName, double customerBudget, boolean isCustomerMask) {
        this.customerName = customerName;
        this.customerBudget = customerBudget;
        this.isCustomerMask = isCustomerMask;
    }
    
    //Name Getters and Setters
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    //Budget Getters and Setters
    public double getCustomerBudget() {
        return customerBudget;
    }
    public void setCustomerBudget(double customerBudget) {
        this.customerBudget = customerBudget;
    }

    //Mask Getters and Setters
    public boolean isCustomerMask() {
        return isCustomerMask;
    }
    public void setCustomerMask(boolean isCustomerMask) {
        this.isCustomerMask = isCustomerMask;
    }

    //ShoppingCart Getters and Modifier
    public HashMap<Item, Integer> getShoppingCart() {
        return shoppingCart;
    }
    public void addToShoppingCart(Item inputItem, int inputQuantity) {
        shoppingCart.put(inputItem, inputQuantity);
    }
}
