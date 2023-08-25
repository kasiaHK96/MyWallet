package com.example.MyWallet.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class Income {

    private String description;
    private double amount;


    public Income(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }


}
