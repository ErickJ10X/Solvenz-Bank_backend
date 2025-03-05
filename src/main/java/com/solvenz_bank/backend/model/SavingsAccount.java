package com.solvenz_bank.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "savings_account")
@PrimaryKeyJoinColumn(name = "account_number")
public class SavingsAccount extends Account{
    @Column(name = "variable_interest", nullable = false)
    private double variableInterestRate;
    @Column(name = "minimum_balance", nullable = false)
    private double minimunBalance;
}
