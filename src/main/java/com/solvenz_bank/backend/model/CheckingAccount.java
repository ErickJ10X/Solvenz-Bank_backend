package com.solvenz_bank.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "checking_account")
@PrimaryKeyJoinColumn(name = "account_number")
public class CheckingAccount extends Account {
    @Column(name = "fixed_interest", nullable = false)
    private final double fixedInterestRate = 0.015;
}
