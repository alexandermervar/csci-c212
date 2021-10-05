package com.alexandermervar.bankClasses.bankClasses;

import com.alexandermervar.bankAbstractClasses.BankAccount;

public class SavingsAccount extends BankAccount{

    //Constructors
    public SavingsAccount(String accountOwnerName, double currentAccountBalance) {
        super(accountOwnerName, currentAccountBalance);
        withdrawalsThisMonth = 0;
        currentMonth = 1;
    }

    //Class Specific Variables
    private int withdrawalsThisMonth;
    private int currentMonth;

    //Getters and Setters
    public int getTotalWithdrawalsThisMonth() {
        return withdrawalsThisMonth;
    }
    public int getCurrentMonth() {
        return currentMonth;
    }
    public void setTotalWithdrawalsThisMonth(int numOfWithdrawals) {
        this.withdrawalsThisMonth = numOfWithdrawals;
    }
    public void setCurrentMonth(int currentMonth) {
        this.currentMonth = currentMonth;
    }

    //Other Methods
    @Override
    public double withdraw(double withdrawAmount, int currentMonth) throws IllegalArgumentException{
        //Exceptions for Withdraw Amount == 0||-n
        if (withdrawAmount <= 0) {
            throw new IllegalArgumentException("The withdrawn amount cannot be less than or equal to zero.");
        }

        //Keeping track of withdrawals
        if(withdrawalsThisMonth == 6 && currentMonth == this.currentMonth) {
            throw new IllegalArgumentException("The limit on total withdrawals this month has been reached.");
        }
        else if(currentMonth == this.currentMonth) {
            withdrawalsThisMonth++;
        }
        else {
            this.currentMonth = currentMonth;
            withdrawalsThisMonth = 1;
        }

        if(withdrawAmount > getCurrentAccountBalance()) {
            setCurrentAccountBalance(0);
            return getCurrentAccountBalance();
            
        }
        else {
            setCurrentAccountBalance(getCurrentAccountBalance()-withdrawAmount);

            return getCurrentAccountBalance();
        }
    }

    @Override
    public void transferMoney(double amountToTransfer, BankAccount accountToTransferTo, int currentMonth) throws IllegalArgumentException{
        //Exceptions for Withdraw Amount == 0||-n
        if (amountToTransfer <= 0) {
            throw new IllegalArgumentException("The withdrawn amount cannot be less than or equal to zero.");
        }

        //Keeping track of withdrawals
        if(withdrawalsThisMonth == 6 && currentMonth == this.currentMonth) {
            throw new IllegalArgumentException("The limit on total withdrawals this month has been reached.");
        }
        else if(currentMonth == this.currentMonth) {
            withdrawalsThisMonth++;
        }
        else {
            this.currentMonth = currentMonth;
            withdrawalsThisMonth = 1;
        }

        if(amountToTransfer > getCurrentAccountBalance()) {
            double transferAmount;
            transferAmount = getCurrentAccountBalance();
            setCurrentAccountBalance(0);
            accountToTransferTo.deposit(transferAmount);
            
        }
        else {
            setCurrentAccountBalance(getCurrentAccountBalance()-amountToTransfer);

            accountToTransferTo.deposit(amountToTransfer);
        }
    }
}
