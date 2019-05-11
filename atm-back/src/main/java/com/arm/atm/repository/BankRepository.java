package com.arm.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arm.atm.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
