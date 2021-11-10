package com.alexandermervar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * A class that reads the filename provided by the constructor and has 2 methods:
 * 
 * 1. currentBalances(ArrayList<> arrlist) - Returns a HashMap<String, Integer> 
 * containing current bank balances of each individual where key will be the individual’s name and value will be their current balance.
 * 
 * 2. updateBalances(HashMap<String, Integer>) - uses an Iterator to iterate over the allBalances HashMap and update the balances accordingly and return the updated HashMap.
 * 
 */
public class BankAccount {
    
    private String filename;
    private ArrayList<String> transactionList;
    private HashMap<String, Integer> allBalances;

    // Getters for the above private variables
    public String getFilename() {
        return filename;
    }
    public ArrayList<String> getTransactionList() {
        return transactionList;
    }
    public HashMap<String, Integer> getAllBalances() {
        return allBalances;
    }
    

    // Constructor that takes in a filename as a parameter
    public BankAccount(String filename) {
        this.filename = filename;
        this.transactionList = new ArrayList<String>();
        this.allBalances = new HashMap<String, Integer>();

        //proces the given file and add each line to the transactions arraylist
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                transactionList.add(sc.nextLine());
            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    // Method that returns a HashMap<String, Integer> containing current bank balances of each individual where key will be the individual’s name and value will be their current balance.
    public HashMap<String, Integer> currentBalances(ArrayList<String> arrlist) {
        for (String line : arrlist) {
            String[] lineArray = line.split(",");
            String name = lineArray[0];
            int amount = Integer.parseInt(lineArray[1]);
            if (allBalances.containsKey(name)) {
                allBalances.put(name, allBalances.get(name) + amount);
            } else {
                allBalances.put(name, amount);
            }
        }
        return allBalances;
    }

    // Method that uses an Iterator to iterate over the allBalances HashMap and update the balances accordingly and return the updated HashMap.
    // If the balance is >= 1500, 150 is added to the balance.
    // If the balance is < 1500, the balance is the same.
    public HashMap<String, Integer> updateBalances(HashMap<String, Integer> allBalances) {
        for (String key : allBalances.keySet()) {
            int balance = allBalances.get(key);
            if (balance >= 1500) {
                balance += 150;
            }
            allBalances.put(key, balance);
        }
        return allBalances;
    }

    // A main method that will display the balances of all 
    // individuals before and after the scheme update by iterating over the HashMap.
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("src/main/java/com/alexandermervar/resources/transactions.txt");
        HashMap<String, Integer> allBalances = ba.currentBalances(ba.getTransactionList());
        System.out.println("Before scheme update:");
        for (String key : allBalances.keySet()) {
            System.out.println(key + ": " + allBalances.get(key));
        }
        System.out.println("");
        System.out.println("After scheme update:");
        allBalances = ba.updateBalances(allBalances);
        for (String key : allBalances.keySet()) {
            System.out.println(key + ": " + allBalances.get(key));
        }
    }
}
