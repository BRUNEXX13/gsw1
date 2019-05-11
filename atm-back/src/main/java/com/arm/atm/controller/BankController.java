package com.arm.atm.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.arm.atm.entity.Bank;
import com.arm.atm.exceptions.bank.BankJaExistenteException;
import com.arm.atm.exceptions.bank.BankNaoEncontradoException;
import com.arm.atm.service.BankService;

@RestController //
@RequestMapping(value = "/bank")
public class BankController {

	@Autowired
	private BankService banksService;

	@RequestMapping(method = RequestMethod.GET, produces = { org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
			org.springframework.http.MediaType.APPLICATION_XML_VALUE

	})
	public ResponseEntity<List<Bank>> listar() {

		return ResponseEntity.status(HttpStatus.OK).body(banksService.listar());
	}

	// Salvado um Autor - Methodo Post
	@RequestMapping(method = RequestMethod.POST) //@Valid Verifica a Camada de persitência 
	public ResponseEntity<Void> salvar(@Valid @RequestBody Bank bank) throws BankJaExistenteException {
		
		bank = banksService.salvar(bank);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bank.getId()).toUri();

		return ResponseEntity.created(uri).build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Bank> buscar(@PathVariable("id") Long id) throws BankNaoEncontradoException {
		Bank bank = banksService.buscar(id);
		return ResponseEntity.status(HttpStatus.OK).body(bank);
	}

}
