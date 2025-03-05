package com.solvenz_bank.backend.repository;

import com.solvenz_bank.backend.model.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Integer> {
}
