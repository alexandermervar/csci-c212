package com.alexandermervar.bankAbstractClasses;

public abstract class BankAccount {
    
    //Variables
    private String accountOwnerName;
    private double currentAccountBalance;

    //Constructor
    public BankAccount(String accountOwnerName, double currentAccountBalance) {
        this.accountOwnerName = accountOwnerName;
        this.setCurrentAccountBalance(currentAccountBalance);
    }

    //Getters and Setters
    public String getAccountOwnerName() {
        return accountOwnerName;
    }
    public double getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    public void setCurrentAccountBalance(double currentAccountBalance) {
        this.currentAccountBalance = currentAccountBalance;
    }

    //Other Methods
    public double deposit(double amountTodeposit) {
        setCurrentAccountBalance(amountTodeposit + currentAccountBalance);
        return currentAccountBalance;
    }
    public abstract double withdraw(double withdrawAmount, int currentMonth);
    public abstract void transferMoney(double amountToTransfer, BankAccount accountToTransferTo, int currentMonth);

}
