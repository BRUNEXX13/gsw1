package com.arm.atm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arm.atm.entity.Bank;
import com.arm.atm.exceptions.bank.BankJaExistenteException;
import com.arm.atm.exceptions.bank.BankNaoEncontradoException;
import com.arm.atm.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepository;

	public List<Bank> listar() {
		return (List<Bank>) bankRepository.findAll();
	}


	public Bank salvar(Bank bank) throws BankJaExistenteException {
		if (bank.getId() != null) {

			Bank b = bankRepository.findOne(bank.getId());

			if (b != null) {
				throw new BankJaExistenteException("BANCO JÁ EXISTENTE");
			}
		}
		return bankRepository.save(bank);

	}
	public Bank buscar(Long id) throws BankNaoEncontradoException {
		Bank b = bankRepository.findOne(id);

		if (b == null) {
			throw new BankNaoEncontradoException("O BANCO NÃO PODE SER ENCONTRADO");
		}
		return b;
	}

}
