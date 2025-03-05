package com.solvenz_bank.backend.repository;

import com.solvenz_bank.backend.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
