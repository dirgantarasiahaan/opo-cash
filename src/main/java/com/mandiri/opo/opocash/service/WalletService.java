package com.mandiri.opo.opocash.service;

import com.mandiri.opo.opocash.entity.Wallet;

import java.math.BigDecimal;
import java.util.List;

public interface WalletService {

    public Wallet createNewWallet(Wallet wallet);
    public List<Wallet> findAllWallet();
    public void debit(String phoneNumber, BigDecimal amount);
}
