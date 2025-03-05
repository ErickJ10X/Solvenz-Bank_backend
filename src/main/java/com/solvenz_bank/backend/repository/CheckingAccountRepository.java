package com.solvenz_bank.backend.repository;

import com.solvenz_bank.backend.model.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Integer> {
}
