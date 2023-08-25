package com.example.MyWallet.Repository;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
@Getter
public class AccountBalance {

    private static double balance = 0.0;
    private static Map<String, Double> incomeTransactions = new HashMap<String, Double>();
    private static Map<String, Double> expenseTransactions = new HashMap<String, Double>();

    public void addIncome(double amount) {
        balance += amount;
        incomeTransactions.put("Income", amount);
    }

    public void addExpense(double amount) {
        balance -= amount;
        expenseTransactions.put("Expense", amount);
    }

    public double getBalance() {
        return balance;
    }

    public Map<String, Double> getIncomeTransactions() {
        return incomeTransactions;
    }

    public Map<String,Double> getExpenseTransactions() {
        return expenseTransactions;
    }

    public void showBalance() {
        System.out.println("Current balance:" + balance);
    }
}
