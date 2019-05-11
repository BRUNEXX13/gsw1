package com.arm.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arm.atm.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
