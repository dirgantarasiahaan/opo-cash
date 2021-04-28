package com.mandiri.opo.opocash.service;

import com.mandiri.opo.opocash.entity.Wallet;
import com.mandiri.opo.opocash.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class WalletServiceImpl implements WalletService{

    @Autowired
    WalletRepository walletRepository;

    @Override
    public Wallet createNewWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    @Override
    public List<Wallet> findAllWallet() {
        return walletRepository.findAll();
    }

    @Override
    public void debit(String phoneNumber, BigDecimal amount) {
        Wallet wallet = walletRepository.findWalletByPhoneNumber(phoneNumber);
        wallet.setBalance(wallet.getBalance().subtract(amount));
        walletRepository.save(wallet);
    }
}
