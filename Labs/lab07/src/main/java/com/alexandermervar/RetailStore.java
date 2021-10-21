package com.alexandermervar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RetailStore {
    
    //Instance Variables
    private String storeName;
    private HashMap<Item, Integer> storeItems = new HashMap<Item, Integer>();
    private ArrayList<Customer> storeCustomers = new ArrayList<Customer>();

    //Constructor
    public RetailStore(String storeName) {
        this.storeName = storeName;
    }
    
    //StoreName Getters and Setters
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    //Items Getters and modifiers
    public HashMap<Item, Integer> getStoreItems() {
        return storeItems;
    }
    public void addStoreItems(Item inputItem, int inputQuantity) {
        storeItems.put(inputItem, inputQuantity);
    }
    public void removeStoreItems(Item inputItem, int inputQuantity) {
        storeItems.put(inputItem, -1 * inputQuantity);
    }
    public void removeStoreItems(Item inputItem) {
        storeItems.remove(inputItem);
    }

    //Customers Getters and Modifiers
    public ArrayList<Customer> getStoreCustomers() {
        return storeCustomers;
    }
    public void addStoreCustomers(Customer inputCustomer) {
        if (storeCustomers.size() >= 5) {
            System.out.println("Store is Full!");
        }
        else if (inputCustomer.isCustomerMask() == false) {
            System.out.println("Customer must wear a mask!");
        }
        else {
            storeCustomers.add(inputCustomer);
            runCustomerMenu(inputCustomer);
        }
    }
    public void removeStoreCustomers(Customer inputCustomer) {
        if (storeCustomers.contains(inputCustomer)) {
            storeCustomers.remove(inputCustomer);
        }
        else {
            System.out.println("Customer cannot be found within store!");
        }
    }

    //CustomerMenu
    public void runCustomerMenu(Customer inputCustomer) {
        System.out.println("Please select the task you would like to complete in the store: ");
        System.out.print("1. Add an Item to Cart\n2. Display Current Shopping Cart\n3. Checkout of the Store\n4. Exit the Menu\n");

        Scanner sc = new Scanner(System.in);

        int menuSelection = Integer.parseInt(sc.nextLine());

        if (menuSelection == 1) {
            System.out.println("Your current balance: $" + inputCustomer.getCustomerBudget());
            System.out.println("");
            System.out.println("Please select the item you would like to add to your cart: ");

            for (Map.Entry<Item, Integer> entry : storeItems.entrySet()) {
                System.out.println(entry.getKey().getItemName() + " - $" + entry.getKey().getItemPrice() + "     In Stock: " + entry.getValue() + "\n");
            }

            String userSelection = sc.nextLine();
            boolean entryExists = false;
            for (Map.Entry<Item, Integer> entry : storeItems.entrySet()) {
                if(entry.getKey().getItemName().equals(userSelection)) {
                    entryExists = true;
                }
            }

            if (entryExists) {
                System.out.println("Input Quantity: ");
                int userQuantity = Integer.parseInt(sc.nextLine());

                for (Map.Entry<Item, Integer> entry : storeItems.entrySet()) {
                    if(entry.getKey().getItemName().equals(userSelection)) {

                        if (entry.getKey().getItemPrice() * (double) userQuantity > inputCustomer.getCustomerBudget()) {
                            System.out.println("That quantity would put you over budget!");
                            runCustomerMenu(inputCustomer);
                        }
                        else {
                            inputCustomer.setCustomerBudget(inputCustomer.getCustomerBudget() - (entry.getKey().getItemPrice() * (double) userQuantity));
                            inputCustomer.addToShoppingCart(entry.getKey(), userQuantity);
                            storeItems.put(entry.getKey(), entry.getValue()-userQuantity);
                            runCustomerMenu(inputCustomer);
                        }

                        break;
                    }
                }

            }
            else {
                System.out.println("That item is not stocked at this store!");
            }
        }
        else if (menuSelection == 2) {
            System.out.println("Your Shopping Cart: ");
            for (Map.Entry<Item, Integer> entry : storeItems.entrySet()) {
                System.out.println(entry.getKey().getItemName() + " - " + entry.getValue());
            }
            runCustomerMenu(inputCustomer);
        }
        else if (menuSelection == 3) {
            storeCustomers.remove(inputCustomer);
            Receipt createdReceipt = new Receipt(inputCustomer.getShoppingCart(), inputCustomer);
            System.out.println(createdReceipt.displayReceipt());
        }
        else {
            System.out.println("Exiting Menu...");
        }
    }
    
}
