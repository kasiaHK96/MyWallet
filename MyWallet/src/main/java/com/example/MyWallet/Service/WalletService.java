package com.example.MyWallet.Service;
import com.example.MyWallet.Repository.AccountBalance;
import com.example.MyWallet.Model.Expense;
import com.example.MyWallet.Model.Income;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Service
public class WalletService {

    private AccountBalance accountBalance;
    private Expense expense;
    private Income income;

    Scanner scanner = new Scanner(System.in);

    public WalletService(AccountBalance accountBalance) {

        this.accountBalance = accountBalance;
    }


    public void start() {


        while (true) {
            System.out.println("Select an option:");
            System.out.println("1.Add Income.");
            System.out.println("2. Add Expense.");
            System.out.println("3. Show Balance.");
            System.out.println("4. Exit.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addIncome(income);
                    break;
                case 2:
                    addExpense(expense);
                    break;
                case 3:
                    showBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public String addIncome(Income income) {
        System.out.println("Enter income amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter income description:");
        String description = scanner.nextLine();

        Income newIncome = new Income(description, amount);
        accountBalance.addIncome(newIncome.getAmount());
        return "Income added successfully.";

    }

    public String addExpense(Expense expense) {
        System.out.println("Enter expense amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter expense description:");
        String description = scanner.nextLine();

        Expense newExpense= new Expense(description, amount);
        accountBalance.addExpense(newExpense.getAmount());
        return "Expense added successfully.";
    }

    public double showBalance() {

        return accountBalance.getBalance();
    }
}
