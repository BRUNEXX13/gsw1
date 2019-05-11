package com.arm.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arm.atm.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
