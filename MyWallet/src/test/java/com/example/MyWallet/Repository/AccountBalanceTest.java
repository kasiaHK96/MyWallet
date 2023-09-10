package com.example.MyWallet.Repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountBalanceTest {


    private AccountBalance accountBalance;

    @BeforeEach
    public void setUp() {
        accountBalance = new AccountBalance();
    }
    @Test
    public void testAddIncome() {
        accountBalance.addIncome(100.0);
        assertEquals(100.0, accountBalance.getBalance(), 0.01);
    }

    @Test
    public void testAddExpense() {
        accountBalance.addIncome(100.0);
        accountBalance.addExpense(50.0);
        assertEquals(50.0, accountBalance.getBalance(), 0.01);
    }
}