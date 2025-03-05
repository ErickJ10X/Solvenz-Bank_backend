package com.solvenz_bank.backend.repository;

import com.solvenz_bank.backend.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
