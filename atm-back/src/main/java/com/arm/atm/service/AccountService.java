package com.arm.atm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.arm.atm.entity.Account;
import com.arm.atm.exception.AccountExistenteException;
import com.arm.atm.exceptions.account.AccountNaoEncontradaException;
import com.arm.atm.repository.AccountRepository;

public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	
}
