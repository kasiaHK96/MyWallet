package com.example.MyWallet.Controller;
import com.example.MyWallet.Repository.AccountBalance;
import com.example.MyWallet.Service.WalletService;

import com.example.MyWallet.Model.Expense;
import com.example.MyWallet.Model.Income;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    private WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/income")
    public ResponseEntity<String> addIncome (@RequestBody Income income) {
        String response = walletService.addIncome(income);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/expense")
    public ResponseEntity<String> addExpense (@RequestBody Expense expense) {
        String response = walletService.addExpense(expense);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/balance")
    public ResponseEntity <Double> showBalance() {
        double balance = walletService.getAccountBalance().showBalance();
        return ResponseEntity.ok(balance);
    }
}
