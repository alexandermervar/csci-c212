package com.alexandermervar;

import java.util.ArrayList;
import java.util.Scanner;

public class RetailDriver {

    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static ArrayList<RetailStore> stores = new ArrayList<RetailStore>();

    public static void beginShoppingSpree() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("----------");
        System.out.println("Welcome to the Retail Store Simulator");
        System.out.println("PLease select you desired operation from the list below.");
        System.out.println("----------");
        System.out.print("1. Create a Store\n2. Create a Customer and Begin Shopping\n3. Add an Item to a Store\n4. Exit the Menu\n");

        Scanner user = new Scanner(System.in);

        int menuSelection = Integer.parseInt(user.nextLine());

        if (menuSelection == 1) {
            System.out.println("Please input the name of the store you would like to create: ");
            String userStoreName = user.nextLine();
            createStore(userStoreName);
            beginShoppingSpree();
        }
        else if (menuSelection == 2) {
            System.out.println("Please input the name of the customer you would like to create: ");
            String userCustomerName = user.nextLine();
            System.out.println("Please input the respective customer's budget: ");
            double userCustomerBudget = Double.parseDouble(user.nextLine());
            System.out.print("Please input if the customer is wearing a mask:\n1. Wearing a Mask\n2. Not Wearing a Mask\n");
            int userWearingAMask = Integer.parseInt(user.nextLine());
            boolean userWearingAMaskBoolean = true;
            if (userWearingAMask == 2){
                userWearingAMaskBoolean = false;
            }

            createCustomer(userCustomerName, userCustomerBudget, userWearingAMaskBoolean);

            System.out.println("Please select a store to shop at: ");
            String customerStoreToGoTo = user.nextLine();

            boolean doesStoreExist = false;
            int storeIndex = 0;

            for (int i = 0; i < stores.size(); i++) {
                if (stores.get(i).getStoreName().equals(customerStoreToGoTo)) {
                    doesStoreExist = true;
                    storeIndex = i;
                }
            }

            if (doesStoreExist) {
                stores.get(storeIndex).addStoreCustomers(customers.get(customers.size() - 1));
            }
            else {
                System.out.println("That store does not exist try again!");
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }

            beginShoppingSpree();
        }
        else if (menuSelection == 3) {
            System.out.println("Please input the name of the item you would like to create: ");
            String userItemName = user.nextLine();
            System.out.println("Please input the price of the respective item: ");
            double userItemPrice = Double.parseDouble(user.nextLine());
            System.out.println("Please Input the Item Quantity: ");
            int userItemQuantity = Integer.parseInt(user.nextLine());

            System.out.println("Please Input the Store you would like to add the item to: ");
            String userSelectedStore = user.nextLine();

            boolean doesStoreExist = false;
            int storeIndex = 0;

            for (int i = 0; i < stores.size(); i++) {
                if (stores.get(i).getStoreName().equals(userSelectedStore)) {
                    doesStoreExist = true;
                    storeIndex = i;
                }
            }

            if (doesStoreExist) {
                addItemToStore(stores.get(storeIndex), userItemName, userItemPrice, userItemQuantity);
                beginShoppingSpree();
            }
            else {
                System.out.println("That store does not exist try again!");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                beginShoppingSpree();
            }
        }
        else {
            System.out.println("Thank you for shopping with us!");
        }

    }

    public static void createStore(String inputStoreName) {
        RetailStore createdStore = new RetailStore(inputStoreName);
        stores.add(createdStore);
        System.out.println("Store added!");
    }

    public static void createCustomer(String inputCustomerName, double inputCustomerBudget, boolean isCustomerWearingMask) {
        Customer createdCustomer = new Customer(inputCustomerName, inputCustomerBudget, isCustomerWearingMask);
        customers.add(createdCustomer);
        System.out.println("Customer successfully created!");


    }

    public static void addItemToStore(RetailStore inputStore, String inputItemName, double inputItemPrice, int inputItemQuantity) {
        Item newItem = new Item(inputItemName, inputItemPrice);
        inputStore.addStoreItems(newItem, inputItemQuantity);
        System.out.println("Item successfully added to store!");
    }

    public static void main(String[] args) {
        
        beginShoppingSpree();

    }
}
