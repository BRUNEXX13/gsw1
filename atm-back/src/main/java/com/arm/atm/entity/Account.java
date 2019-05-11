package com.arm.atm.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude
@Table (name = "account")
public class Account {

	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonInclude(Include.NON_NULL)
	private Long numbr;

	@JsonInclude(Include.NON_NULL)
	private String ownedr;

	@JsonInclude(Include.NON_NULL)
	private BigDecimal balance;

	@JsonInclude(Include.NON_NULL)
	private String password;
//
//	@ManyToOne // Uma Conta tem Um Banco // Um Banco tem varias contas
//	@JoinColumn(name = "id_bank")
//	private Bank bank;
//	
	@NotNull(message = "O banco é obrigatório")
	@ManyToOne
	@JoinColumn(name = "id_bank")
	private Bank bank;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumbr() {
		return numbr;
	}

	public void setNumbr(Long numbr) {
		this.numbr = numbr;
	}

	public String getOwnedr() {
		return ownedr;
	}

	public void setOwnedr(String ownedr) {
		this.ownedr = ownedr;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Account(Long id, Long numbr, String ownedr, BigDecimal balance, String password, Bank bank) {
		super();
		this.id = id;
		this.numbr = numbr;
		this.ownedr = ownedr;
		this.balance = balance;
		this.password = password;
		this.bank = bank;
	}

	public Account() {
		super();
	}

}
