package com.alexandermervar.bankClasses.bankClasses;

import com.alexandermervar.bankAbstractClasses.BankAccount;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountOwnerName, double currentAccountBalance) {
        super(accountOwnerName, currentAccountBalance);
    }

    //Other Methods
    @Override
    public double withdraw(double withdrawAmount, int currentMonth) {
        if(withdrawAmount > getCurrentAccountBalance()) {
            setCurrentAccountBalance(0);
            return getCurrentAccountBalance();
        }
        else {
            setCurrentAccountBalance(getCurrentAccountBalance() - withdrawAmount);
            return getCurrentAccountBalance();
        }
    }
    @Override
    public void transferMoney(double amountToTransfer, BankAccount accountToTransferTo, int currentMonth) {
        setCurrentAccountBalance(getCurrentAccountBalance() - amountToTransfer);    
        double transferAmount = 0.97 * amountToTransfer;
        accountToTransferTo.setCurrentAccountBalance(accountToTransferTo.getCurrentAccountBalance() + transferAmount);    
    }
    
}
