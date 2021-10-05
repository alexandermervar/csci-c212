package com.alexandermervar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.alexandermervar.bankClasses.bankClasses.CheckingAccount;
import com.alexandermervar.bankClasses.bankClasses.SavingsAccount;

public class BankTests {

    CheckingAccount ca = new CheckingAccount("Alexander Mervar", 1000.0);
    SavingsAccount sa = new SavingsAccount("Alexander Mervar", 5000.0);

    @Test
    void testGetAccountOwnerName() {
        assertEquals(ca.getAccountOwnerName(), "Alexander Mervar");
        assertEquals(sa.getAccountOwnerName(), "Alexander Mervar");
    }

    @Test
    void testGetCurrentAccountBalance() {
        assertEquals(ca.getCurrentAccountBalance(), 1000.0);
        assertEquals(sa.getCurrentAccountBalance(), 5000.0);
    }

    @Test
    void testSetCurrentAccountBalance() {
        ca.setCurrentAccountBalance(2000.0);
        assertEquals(ca.getCurrentAccountBalance(), 2000.0);
        sa.setCurrentAccountBalance(10000.0);
        assertEquals(sa.getCurrentAccountBalance(), 10000.0);
    }

    @Test
    void testDeposit() {
        ca.deposit(4000.0);
        assertEquals(ca.getCurrentAccountBalance(), 5000.0);
        sa.deposit(5000.0);
        assertEquals(sa.getCurrentAccountBalance(), 10000.0);
    }

    @Test
    void testWithdraw() {
        assertEquals(ca.withdraw(2000.0, 1), 0);
        ca.setCurrentAccountBalance(1000);
        assertEquals(ca.withdraw(750.0, 1), 250.0);
        assertThrows(IllegalArgumentException.class, () -> {
            sa.withdraw(-4.0, 01);
        });
        sa.setTotalWithdrawalsThisMonth(6);
        assertThrows(IllegalArgumentException.class, () -> {
            sa.withdraw(350, 01);
        });
        assertEquals(sa.withdraw(1000.0, 2), 4000.0);
        assertEquals(sa.withdraw(1000.0, 2), 3000.0);
        assertEquals(sa.getTotalWithdrawalsThisMonth(), 2);
        }

    @Test
    void testTransferMoney() {
        ca.transferMoney(500.0, sa, 1);
        assertEquals(ca.getCurrentAccountBalance(), 500.0);
        assertEquals(sa.getCurrentAccountBalance(), 5485.0);
        assertThrows(IllegalArgumentException.class, () -> {
            sa.transferMoney(-4.0, ca, 1);
        });
        sa.setTotalWithdrawalsThisMonth(6);
        assertThrows(IllegalArgumentException.class, () -> {
            sa.withdraw(350, 01);
        });
        sa.setCurrentAccountBalance(5000.0);
        ca.setCurrentAccountBalance(1000.0);
        sa.transferMoney(1000.0, ca, 2);
        assertEquals(sa.getCurrentAccountBalance(), 4000.0);
        sa.transferMoney(1000.0, ca, 2);
        assertEquals(sa.getCurrentAccountBalance(), 3000.0);
        assertEquals(sa.getTotalWithdrawalsThisMonth(), 2);
        assertEquals(ca.getCurrentAccountBalance(), 3000.0);
    }
}
