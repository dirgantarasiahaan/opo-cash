package com.mandiri.opo.opocash.controller;

import com.mandiri.opo.opocash.entity.Wallet;
import com.mandiri.opo.opocash.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class WalletController {

    @Autowired
    WalletService walletService;

    @GetMapping("/wallets")
    public List<Wallet> findAllWallet(){
        return walletService.findAllWallet();
    }

    @PostMapping("/wallet")
    public Wallet createNewWallet(@RequestBody Wallet wallet){
        return walletService.createNewWallet(wallet);
    }

    @PostMapping("/debit")
    public void debet(@RequestParam(name = "phoneNumber") String phoneNumber,
                      @RequestParam(name = "amount")BigDecimal amount){
        walletService.debit(phoneNumber, amount);
    }




}
