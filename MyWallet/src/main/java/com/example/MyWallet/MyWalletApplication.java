package com.example.MyWallet;

import com.example.MyWallet.Repository.AccountBalance;
import com.example.MyWallet.Service.WalletService;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Data
@Configuration
public class MyWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWalletApplication.class, args);

		AccountBalance accountBalance = new AccountBalance();
		WalletService walletService = new WalletService(accountBalance);
		walletService.start();
	}
}
