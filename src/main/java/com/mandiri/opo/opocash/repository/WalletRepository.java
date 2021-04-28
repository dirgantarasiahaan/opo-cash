package com.mandiri.opo.opocash.repository;

import com.mandiri.opo.opocash.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, String> {
    public Wallet findWalletByPhoneNumber(String phoneNumber);
}
