package com.example.MyWallet.Controller;
import com.example.MyWallet.Service.WalletService;

import com.example.MyWallet.Model.Expense;
import com.example.MyWallet.Model.Income;
import com.example.MyWallet.Service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
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
}
